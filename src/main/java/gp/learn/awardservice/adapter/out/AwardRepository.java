package gp.learn.awardservice.adapter.out;

import gp.learn.awardservice.domain.Award;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AwardRepository extends JpaRepository<AwardJpaEntity,Long> {

}
