package gp.learn.awardservice.domain;

public class Activity {

    private Long id;
    private Long activityMasterId;
    private boolean completed;

    private Activity(Long id, Long activityMasterId, boolean completed) {
        this.id = id;
        this.activityMasterId = activityMasterId;
        this.completed = completed;
    }

    private Activity(Long activityMasterId, boolean completed) {
        this.activityMasterId = activityMasterId;
        this.completed = completed;
    }

    public static Activity initializeNewActivity(ActivityMaster activityMaster){
        return new Activity(activityMaster.getId(),false);
    }
    public void completeActivity(){
        this.completed=true;
    }
    public void restartActivity(){
        this.completed=false;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", activityMasterId=" + activityMasterId +
                ", completed=" + completed +
                '}';
    }
}
