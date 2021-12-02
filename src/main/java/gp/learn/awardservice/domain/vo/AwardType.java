package gp.learn.awardservice.domain.vo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AwardType {

    private String type;

    private final List<String> VALID_TYPES = Arrays.asList("MAIN","LIMITED_BACKUP","LIMITED_CUSTOM","VARIABLE");


    private Logger logger = LoggerFactory.getLogger(AwardType.class);

    protected AwardType() {

    }

    public AwardType(String type) {
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AwardType awardType = (AwardType) o;
        return type.equals(awardType.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "AwardType{" +
                "type='" + type + '\'' +
                '}';
    }
}
