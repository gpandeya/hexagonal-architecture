package gp.learn.awardservice.application.mapper;

import gp.learn.awardservice.adapter.out.ActivityMasterJpaEntity;
import gp.learn.awardservice.domain.ActivityMaster;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ActivityMapper {

    ActivityMasterJpaEntity fromDomainToJpaEntity(ActivityMaster activityMaster);

    ActivityMaster fromJpaEntityToDomain(ActivityMasterJpaEntity activityMasterJpaEntity);

    List<ActivityMaster> FromJpaEntitiesToDomainCollection(List<ActivityMasterJpaEntity> activityMasterJpaEntities);

}
