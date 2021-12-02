package gp.learn.awardservice.application.service;

import gp.learn.awardservice.application.in.LoadAwardUseCase;
import gp.learn.awardservice.application.mapper.AwardMapper;
import gp.learn.awardservice.application.out.LoadAwardPort;
import gp.learn.awardservice.domain.Award;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoadAwardService implements LoadAwardUseCase {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    AwardMapper awardMapper;

    LoadAwardPort loadAwardPort;

    public LoadAwardService(AwardMapper awardMapper, LoadAwardPort loadAwardPort) {
        this.awardMapper = awardMapper;
        this.loadAwardPort = loadAwardPort;
    }

    @Override
    public Award findAwardById(Long awardId) {
        return loadAwardPort.findAwardById(awardId);

    }
}
