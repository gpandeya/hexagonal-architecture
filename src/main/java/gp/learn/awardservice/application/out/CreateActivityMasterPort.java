package gp.learn.awardservice.application.out;

import gp.learn.awardservice.domain.ActivityMaster;

public interface CreateActivityMasterPort {

    ActivityMaster createActivityMaster(ActivityMaster activityMaster);
}
