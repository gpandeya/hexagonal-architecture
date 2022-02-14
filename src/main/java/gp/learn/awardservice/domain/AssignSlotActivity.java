package gp.learn.awardservice.domain;

import org.springframework.stereotype.Component;

@Component("slot")
public class AssignSlotActivity implements AbstractActivity{

    ActivityResponse activityResponse;
    String activityKey;
    String description;
    String status;
    ActivityResponse response;
    boolean completed;

    public String getActivityKey() {
        return activityKey;
    }

    public void setActivityKey() {
        this.activityKey = "assignSlot";
    }

    public void setDescription() {
        this.description ="assign slot";
        //this.description = description;
    }




    public ActivityResponse getActivityResponse() {
        return activityResponse;
    }

    public void setActivityResponse(ActivityResponse activityResponse) {
        this.activityResponse = activityResponse;
    }

    public String getDescription() {
        return description;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ActivityResponse getResponse() {
        return response;
    }

    public void setResponse(ActivityResponse response) {
        this.response = response;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "AssignSlotActivity{" +
                "activityResponse=" + activityResponse +
                ", activityKey='" + activityKey + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", response=" + response +
                ", completed=" + completed +
                '}';
    }

    @Override
    public void initialize() {
        this.setDescription();
        this.setActivityKey();
    }

    @Override
    public void recordUserResponse(ActivityResponse response) {
        // implement rule and other business logic.
    }
}
