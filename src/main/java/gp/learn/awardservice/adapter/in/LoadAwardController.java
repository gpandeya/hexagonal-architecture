package gp.learn.awardservice.adapter.in;

import gp.learn.awardservice.application.in.LoadAwardUseCase;
import gp.learn.awardservice.domain.Award;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadAwardController {

    @Autowired
    LoadAwardUseCase loadAwardUseCase;

    @GetMapping("/awards/{awardId}")
    public Award loadAwardById(Long awardId){
        Award found = loadAwardUseCase.findAwardById(awardId);
        return found;
    }
}
