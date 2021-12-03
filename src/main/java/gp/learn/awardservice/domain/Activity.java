package gp.learn.awardservice.domain;

public class Activity {

    private Long id;
    private Long activityMasterId;
    private boolean completed;

    public Activity(){

    }
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

    public Long getActivityMasterId() {
        return activityMasterId;
    }

    public void setActivityMasterId(Long activityMasterId) {
        this.activityMasterId = activityMasterId;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
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
