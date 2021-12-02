package gp.learn.awardservice.application.in;

import gp.learn.awardservice.domain.Award;

public interface LoadAwardUseCase {

    Award findAwardById(Long awardId);
}
