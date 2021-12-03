package gp.learn.awardservice.adapter.out;

import javax.persistence.*;

@Entity
@Table(name="activity")
public class ActivityJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Long activityMasterId;

    @ManyToOne(optional = false)
    @JoinColumn(name="award_id")
    private AwardJpaEntity awardJpaEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityMasterId() {
        return activityMasterId;
    }

    public void setActivityMasterId(Long activityMasterId) {
        this.activityMasterId = activityMasterId;
    }

    public AwardJpaEntity getAwardJpaEntity() {
        return awardJpaEntity;
    }

    public void setAwardJpaEntity(AwardJpaEntity awardJpaEntity) {
        this.awardJpaEntity = awardJpaEntity;
    }
}
