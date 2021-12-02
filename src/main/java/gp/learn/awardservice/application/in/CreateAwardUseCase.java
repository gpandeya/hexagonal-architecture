package gp.learn.awardservice.application.in;

import gp.learn.awardservice.domain.Award;

public interface CreateAwardUseCase {

    Award createAward(NewAwardDTO newAwardDTO);
}
