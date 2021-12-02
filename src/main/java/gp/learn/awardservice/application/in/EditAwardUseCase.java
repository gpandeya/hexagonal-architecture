package gp.learn.awardservice.application.in;

import gp.learn.awardservice.domain.Award;

public interface EditAwardUseCase {

    Award updateAward(EditAwardDTO editAwardDTO);
}
