package gp.learn.awardservice.adapter.out;

import gp.learn.awardservice.application.mapper.AwardMapper;
import gp.learn.awardservice.application.out.CreateAwardPort;
import gp.learn.awardservice.application.out.LoadAwardPort;
import gp.learn.awardservice.application.out.UpdateAwardPort;
import gp.learn.awardservice.domain.Award;
import org.springframework.stereotype.Component;


@Component
public class AwardPersistenceAdapter implements CreateAwardPort, LoadAwardPort, UpdateAwardPort {

    AwardRepository awardRepository;

    AwardMapper awardMapper;

    public AwardPersistenceAdapter(AwardRepository awardRepository, AwardMapper awardMapper) {
        this.awardRepository = awardRepository;
        this.awardMapper = awardMapper;
    }

    @Override
    public Award createAward(Award award) {
        AwardJpaEntity awardJpaEntity = awardMapper.fromDomainToJpaEntity(award);
        AwardJpaEntity saved = awardRepository.save(awardJpaEntity);
        return awardMapper.fromJpaEntityToDomain(saved);
    }

    @Override
    public Award findAwardById(Long awardId) {
        AwardJpaEntity found= awardRepository.findById(awardId).orElseThrow();
        return awardMapper.fromJpaEntityToDomain(found);
    }

    @Override
    public Award updateAward(Award award) {
        return null;
    }
}
