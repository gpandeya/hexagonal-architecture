package gp.learn.awardservice.application.out;

import gp.learn.awardservice.domain.ActivityMaster;

import java.util.List;

public interface LoadActivityMasterPort {

    List<ActivityMaster> findActivities ();

}
