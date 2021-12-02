package gp.learn.awardservice.application.service;

import gp.learn.awardservice.application.in.AssignActivitiesToAwardUseCase;
import gp.learn.awardservice.application.out.AssignActivityPort;
import gp.learn.awardservice.application.out.LoadActivityMasterPort;
import gp.learn.awardservice.domain.Activity;
import gp.learn.awardservice.domain.ActivityMaster;
import gp.learn.awardservice.domain.Award;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssignActivitiesToAwardService implements AssignActivitiesToAwardUseCase {

    LoadActivityMasterPort loadActivityMasterPort;

    public AssignActivitiesToAwardService(LoadActivityMasterPort loadActivityMasterPort) {
        this.loadActivityMasterPort = loadActivityMasterPort;
    }

    @Override
    public void assignActivities(Award award) {
        List<ActivityMaster> activityMasterList = loadActivityMasterPort.findActivities();
        List<Activity> activities = new ArrayList<>();
        activityMasterList.forEach(activityMaster ->{
            Activity activity = Activity.initializeNewActivity(activityMaster);
            activities.add(activity);
        });
        award.addActivities(activities);
    }
}
