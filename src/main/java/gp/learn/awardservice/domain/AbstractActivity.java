package gp.learn.awardservice.domain;

public interface AbstractActivity {

    public void initialize();

    public void recordUserResponse(ActivityResponse response);
}
