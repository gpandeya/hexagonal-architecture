package gp.learn.awardservice.application.service;

import gp.learn.awardservice.application.in.CreateActivityMasterUseCase;
import gp.learn.awardservice.application.in.LoadActivityMasterUseCase;
import gp.learn.awardservice.application.out.CreateActivityMasterPort;
import gp.learn.awardservice.domain.ActivityMaster;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityMasterService implements CreateActivityMasterUseCase{

    CreateActivityMasterPort createActivityMasterPort;


    public ActivityMasterService(CreateActivityMasterPort createActivityMasterPort) {
        this.createActivityMasterPort = createActivityMasterPort;
    }

    @Override
    public ActivityMaster createActivityMaster(ActivityMaster activityMaster) {
        return createActivityMasterPort.createActivityMaster(activityMaster);
    }

}
