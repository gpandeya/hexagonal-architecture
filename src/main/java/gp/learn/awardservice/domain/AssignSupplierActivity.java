package gp.learn.awardservice.domain;

import org.springframework.stereotype.Component;

@Component("supplier")
public class AssignSupplierActivity implements AbstractActivity{

    ActivityResponse activityResponse;
    String description;
    String activityKey;
    String status;
    ActivityResponse response;
    boolean completed;

    public ActivityResponse getActivityResponse() {
        return activityResponse;
    }

    public void setActivityResponse(ActivityResponse activityResponse) {
        this.activityResponse = activityResponse;
    }

    public void setDescription() {
        this.description = "assign supplier id";
    }

    public String getActivityKey() {
        return activityKey;
    }

    public void setActivityKey() {
        this.activityKey = "assignSupplier";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public ActivityResponse getResponse() {
        return this.response;
    }

    public void setResponse(ActivityResponse response) {
        this.response = response;
    }
    public String getDescription() {
        return description;
    }


    public String getStatus() {
        return status;
    }


    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "AssignSupplierActivity{" +
                "activityResponse=" + activityResponse +
                ", description='" + description + '\'' +
                ", activityKey='" + activityKey + '\'' +
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
