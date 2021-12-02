package gp.learn.awardservice.domain;

public class ActivityMaster {

    private Long id;
    private String description;
    private String team;


    public ActivityMaster(Long id, String description, String team) {
        this.id = id;
        this.description = description;
        this.team = team;

    }

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
        return "ActivityMasterRepository{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
