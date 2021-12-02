package gp.learn.awardservice.adapter.in;

import gp.learn.awardservice.application.in.CreateAwardUseCase;
import gp.learn.awardservice.application.in.NewAwardDTO;
import gp.learn.awardservice.application.mapper.AwardMapper;
import gp.learn.awardservice.domain.Award;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AwardController {

    @Autowired
    CreateAwardUseCase createAwardUseCase;

    @Autowired
    AwardMapper awardMapper;

    @GetMapping("/awards/hello")
    public String sayHello(){
        return "hello!";
    }

    @PostMapping("/awards")
    @ResponseStatus(HttpStatus.CREATED)
    public Award createAward(@RequestBody NewAwardDTO newAwardDTO){

        Award created = createAwardUseCase.createAward(newAwardDTO);
        return created;
    }


}
