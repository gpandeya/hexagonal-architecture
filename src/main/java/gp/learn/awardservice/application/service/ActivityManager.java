package gp.learn.awardservice.application.service;

import gp.learn.awardservice.domain.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ActivityManager {

    List<AbstractActivity> activities =  new ArrayList<>();
    private final Map<String, AbstractActivity> activitiesMap;

    public ActivityManager(Map<String, AbstractActivity> activitiesMap) {
        this.activitiesMap = activitiesMap;
    }

    public List<AbstractActivity> determineActivityForAChoice(String choice){
        List<String> activityIdentifiers = new ArrayList<>();

        if("addOS".equalsIgnoreCase(choice)){
            activityIdentifiers.add("supplier");
            activityIdentifiers.add("slot");


        }else if("addMS".equalsIgnoreCase(choice)){
            activityIdentifiers.add("supplier");
        }

        activityIdentifiers.forEach(key->{
            AbstractActivity activity = activitiesMap.get(key);
            activity.initialize();
            activities.add(activity);
        });

//        SupplierActivityResponse supplierActivityResponse = new SupplierActivityResponse();
//        supplierActivityResponse.setSupplierId("test supplier");
//
//        SlotActivityResponse slotActivityResponse = new SlotActivityResponse();
//        Map<String, String> slots = new HashMap<>();
//        slots.put("A","123456");
//        slots.put("B","66956548");
//        slotActivityResponse.setSlots(slots);


        return activities;
    }
}
