package gp.learn.awardservice.domain;

import java.util.HashMap;
import java.util.Map;

public class SlotActivityResponse implements ActivityResponse{

    Map<String, String> slots = new HashMap<>();

    public SlotActivityResponse() {
    }

    public Map<String, String> getSlots() {
        return slots;
    }

    public void setSlots(Map<String, String> slots) {
        this.slots = slots;
    }
}
