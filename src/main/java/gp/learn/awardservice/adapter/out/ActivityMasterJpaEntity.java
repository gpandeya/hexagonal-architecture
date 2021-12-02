package gp.learn.awardservice.adapter.out;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activity_master")
public class ActivityMasterJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private String team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "ActivityMasterJpaEntity{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
