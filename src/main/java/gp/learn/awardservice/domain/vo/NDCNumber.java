package gp.learn.awardservice.domain.vo;

import java.util.Objects;

public class NDCNumber {

    private String number;


    public NDCNumber(){

    }

    public NDCNumber(String number) {
        if(number!=null && number.length()>3)
            this.setNumber(number);
        else{
            throw new IllegalArgumentException(String.format("Invalid NDC # %s",number));
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NDCNumber ndcNumber = (NDCNumber) o;
        return Objects.equals(number, ndcNumber.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "NDCNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
