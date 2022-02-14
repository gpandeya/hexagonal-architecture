package gp.learn.awardservice.domain;

public class SupplierActivityResponse implements ActivityResponse{

    String supplierId;

    public SupplierActivityResponse(){

    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
}
