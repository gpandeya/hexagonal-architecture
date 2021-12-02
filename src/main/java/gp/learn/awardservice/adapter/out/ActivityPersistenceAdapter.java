package gp.learn.awardservice.adapter.out;

import gp.learn.awardservice.application.mapper.ActivityMapper;
import gp.learn.awardservice.application.out.CreateActivityMasterPort;
import gp.learn.awardservice.application.out.LoadActivityMasterPort;
import gp.learn.awardservice.domain.ActivityMaster;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActivityPersistenceAdapter implements LoadActivityMasterPort,
        CreateActivityMasterPort {

    ActivityMasterRepository activityMasterRepository;

    ActivityMapper activityMapper;

    public ActivityPersistenceAdapter(ActivityMasterRepository activityMasterRepository,
                                      ActivityMapper activityMapper) {
        this.activityMasterRepository = activityMasterRepository;
        this.activityMapper = activityMapper;
    }

    @Override
    public ActivityMaster createActivityMaster(ActivityMaster activityMaster) {
        ActivityMasterJpaEntity activityMasterJpaEntity = activityMapper.fromDomainToJpaEntity(activityMaster);
        ActivityMasterJpaEntity saved = activityMasterRepository.save(activityMasterJpaEntity);
        return activityMapper.fromJpaEntityToDomain(saved);
    }

    @Override
    public List<ActivityMaster> findActivities() {
        return activityMapper.FromJpaEntitiesToDomainCollection(activityMasterRepository.findAll());
    }


}
