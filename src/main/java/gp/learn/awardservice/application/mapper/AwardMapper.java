package gp.learn.awardservice.application.mapper;

import gp.learn.awardservice.adapter.out.AwardJpaEntity;
import gp.learn.awardservice.application.in.NewAwardDTO;
import gp.learn.awardservice.domain.Award;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AwardMapper {

    @Mapping(source="ndcNumber",target="ndcNumber.number")
    Award fromDtoToDomain(NewAwardDTO dto);

    @Mapping(source="ndcNumber.number",target="ndcNumber")
    AwardJpaEntity fromDomainToJpaEntity(Award award);

    @Mapping(source="ndcNumber",target="ndcNumber.number")
    Award fromJpaEntityToDomain(AwardJpaEntity awardJpaEntity);
}
