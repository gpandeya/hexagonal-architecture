package gp.learn.awardservice.application.mapper;

import gp.learn.awardservice.adapter.out.AwardJpaEntity;
import gp.learn.awardservice.application.in.NewAwardDTO;
import gp.learn.awardservice.domain.Award;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses={ActivityMapper.class})
public interface AwardMapper {

    @Mapping(source="ndcNumber",target="ndcNumber.number")
    Award fromDtoToDomain(NewAwardDTO dto);

    @Mapping(source="ndcNumber.number",target="ndcNumber")
    @Mapping(source="activities",target="activities")
    AwardJpaEntity fromDomainToJpaEntity(Award award);

    @Mapping(source="ndcNumber",target="ndcNumber.number")
    @Mapping(source="activities",target="activities")
    Award fromJpaEntityToDomain(AwardJpaEntity awardJpaEntity);
}
