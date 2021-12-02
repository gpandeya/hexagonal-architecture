package gp.learn.awardservice.application.out;

import gp.learn.awardservice.domain.Award;

public interface CreateAwardPort {

    Award createAward(Award award);
}
