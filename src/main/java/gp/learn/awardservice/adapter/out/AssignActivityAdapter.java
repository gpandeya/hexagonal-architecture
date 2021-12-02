package gp.learn.awardservice.adapter.out;

import gp.learn.awardservice.application.out.AssignActivityPort;
import gp.learn.awardservice.application.out.LoadActivityMasterPort;
import gp.learn.awardservice.domain.Award;
import org.springframework.stereotype.Component;

@Component
public class AssignActivityAdapter implements AssignActivityPort {

    LoadActivityMasterPort loadActivityPort;

    @Override
    public void assignActivity(Award award) {

    }
}
