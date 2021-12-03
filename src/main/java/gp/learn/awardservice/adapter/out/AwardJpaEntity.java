package gp.learn.awardservice.adapter.out;

import gp.learn.awardservice.domain.Activity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="award")
public class AwardJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String ndcNumber;

    @OneToMany(
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "awardJpaEntity",
            cascade = CascadeType.ALL)
    private List<ActivityJpaEntity> activities = new ArrayList<>();


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

    public List<ActivityJpaEntity> getActivities() {
        return activities;
    }

    public void setActivities(List<ActivityJpaEntity> activities) {
        activities.forEach(activity -> activity.setAwardJpaEntity(this));
        this.activities = activities;
    }


}
