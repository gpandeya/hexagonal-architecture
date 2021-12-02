package gp.learn.awardservice.adapter.in;

import gp.learn.awardservice.application.in.LoadActivityMasterUseCase;
import gp.learn.awardservice.domain.ActivityMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoadActivityController {

    @Autowired
    LoadActivityMasterUseCase loadActivityMasterUseCase;

    @GetMapping("/activity-master/")
    public List<ActivityMaster> findAll(){
        return loadActivityMasterUseCase.findAllActivities();
    }
}
