package gp.learn.awardservice.domain;


import gp.learn.awardservice.domain.vo.NDCNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Award {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private Long id;

    private NDCNumber ndcNumber;

    private List<Activity> activities = new ArrayList<>();

    List<AbstractActivity> abstractActivities = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NDCNumber getNdcNumber() {
        return ndcNumber;
    }

    public void setNdcNumber(NDCNumber ndcNumber) {
        this.ndcNumber = ndcNumber;
    }

    public void validate(){
        logger.info("validate started");
        logger.info("NDC number {}", this.ndcNumber.getNumber());
    }

    public void addActivities(List<Activity> inActivities){
        activities.clear();
        activities.addAll(inActivities);
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<AbstractActivity> getAbstractActivities() {
        return abstractActivities;
    }

    public void setAbstractActivities(List<AbstractActivity> inAbstractActivities) {
        logger.info("abstractActivities : {}", abstractActivities);
        abstractActivities.clear();
        abstractActivities.addAll(inAbstractActivities);
       // this.abstractActivities = abstractActivities;
    }

    @Override
    public String toString() {
        return "Award{" +
                "id=" + id +
                ", ndcNumber=" + ndcNumber +
                ", abstractActivities=" + abstractActivities +
                '}';
    }
}
