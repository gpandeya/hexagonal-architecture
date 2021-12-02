package gp.learn.awardservice.application.in;

import java.time.LocalDateTime;

public class ExceptionDTO {

    private String category;
    private String details;
    private LocalDateTime errorTime;
    private RequestDetailsDTO requestDetailsDTO;

    public ExceptionDTO(String category, String details,RequestDetailsDTO requestDetailsDTO) {

        this.category = category;
        this.details = details;
        this.errorTime = LocalDateTime.now();
        this.requestDetailsDTO = requestDetailsDTO;
    }

    public String getCategory() {
        return category;
    }

    public String getDetails() {
        return details;
    }

    public RequestDetailsDTO getRequest() {
        return requestDetailsDTO;
    }

    public LocalDateTime getErrorTime() {
        return errorTime;
    }

    @Override
    public String toString() {
        return "ExceptionDTO{" +
                "category='" + category + '\'' +
                ", details='" + details + '\'' +
                ", errorTime=" + errorTime +
                ", requestDetailsDTO=" + requestDetailsDTO +
                '}';
    }
}
