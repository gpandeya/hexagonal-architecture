package gp.learn.awardservice.application.out;

import gp.learn.awardservice.domain.Award;

public interface LoadAwardPort {

     Award findAwardById(Long awardId);
}
