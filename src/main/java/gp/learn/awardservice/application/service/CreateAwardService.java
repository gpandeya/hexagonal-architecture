package gp.learn.awardservice.application.service;

import gp.learn.awardservice.application.in.AssignActivitiesToAwardUseCase;
import gp.learn.awardservice.application.in.CreateAwardUseCase;
import gp.learn.awardservice.application.in.NewAwardDTO;
import gp.learn.awardservice.application.mapper.AwardMapper;
import gp.learn.awardservice.application.out.CreateAwardPort;
import gp.learn.awardservice.domain.Award;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CreateAwardService implements CreateAwardUseCase {

    Logger logger  = LoggerFactory.getLogger(this.getClass());

    AwardMapper awardMapper;

    CreateAwardPort createAccountPort;

    AssignActivitiesToAwardUseCase assignActivitiesToAwardUseCase;

    public CreateAwardService(AwardMapper awardMapper, CreateAwardPort createAccountPort,
                              AssignActivitiesToAwardUseCase assignActivitiesToAwardUseCase) {
        this.awardMapper = awardMapper;
        this.createAccountPort = createAccountPort;
        this.assignActivitiesToAwardUseCase =  assignActivitiesToAwardUseCase;
    }

    @Override
    public Award createAward(NewAwardDTO newAwardDTO) {
        logger.info("create award request{}", newAwardDTO);
        Award award = awardMapper.fromDtoToDomain(newAwardDTO);
        award.validate();
        assignActivitiesToAwardUseCase.assignActivities(award);
        logger.info("award - > {}", award);
        return createAccountPort.createAward(award);

    }
}
