package gp.learn.awardservice.application.service;

import gp.learn.awardservice.application.in.LoadActivityMasterUseCase;
import gp.learn.awardservice.application.out.LoadActivityMasterPort;
import gp.learn.awardservice.domain.ActivityMaster;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadActivityMasterService implements LoadActivityMasterUseCase {

    LoadActivityMasterPort loadActivityMasterPort;

    public LoadActivityMasterService(LoadActivityMasterPort loadActivityMasterPort) {
        this.loadActivityMasterPort = loadActivityMasterPort;
    }

    @Override
    public List<ActivityMaster> findAllActivities() {
        return loadActivityMasterPort.findActivities();
    }
}
