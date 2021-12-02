package gp.learn.awardservice.adapter.in;

import gp.learn.awardservice.application.in.CreateActivityMasterUseCase;
import gp.learn.awardservice.domain.ActivityMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @Autowired
    CreateActivityMasterUseCase createActivityMasterUseCase;

    @PostMapping("/activity-master/")
    public ActivityMaster createActivity(@RequestBody ActivityMaster activityMaster){

        return createActivityMasterUseCase.createActivityMaster(activityMaster);
    }


}
