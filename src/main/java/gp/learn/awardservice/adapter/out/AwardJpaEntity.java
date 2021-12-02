package gp.learn.awardservice.adapter.out;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="award")
public class AwardJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String ndcNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNdcNumber() {
        return ndcNumber;
    }

    public void setNdcNumber(String ndcNumber) {
        this.ndcNumber = ndcNumber;
    }
}
