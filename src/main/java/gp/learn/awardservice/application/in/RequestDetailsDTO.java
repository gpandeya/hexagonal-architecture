package gp.learn.awardservice.application.in;

import org.springframework.web.context.request.WebRequest;

public class RequestDetailsDTO {
    private String userName;
    private String sessionId;
    private String source;
    private boolean includeClientInfo=false;

    public RequestDetailsDTO() {

    }
    public RequestDetailsDTO(WebRequest request) {
        this.userName = request.getUserPrincipal()!=null?
                request.getUserPrincipal().getName() :"system";
        this.sessionId = request.getSessionId();
        this.source = request.getDescription(includeClientInfo);
    }
    public String getUserName() {
        return userName;
    }
    public String getSessionId() {
        return sessionId;
    }
    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "RequestDetailsDTO [userName=" + userName + ", sessionId=" + sessionId + ", source=" + source
                +  "]";
    }


}
