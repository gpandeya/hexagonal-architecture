package gp.learn.awardservice.application.in;

import gp.learn.awardservice.domain.ActivityMaster;

import java.util.List;

public interface LoadActivityMasterUseCase {

    List<ActivityMaster> findAllActivities();
}
