package gp.learn.awardservice.adapter.in;

import gp.learn.awardservice.application.in.ExceptionDTO;
import gp.learn.awardservice.application.in.RequestDetailsDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody ExceptionDTO
    handleException(IllegalArgumentException ex, WebRequest request){
        RequestDetailsDTO requestDetailsDTO = new RequestDetailsDTO(request);
        ExceptionDTO exceptionDTO = new ExceptionDTO(ex.getClass().getSimpleName(),
                ex.getMessage(), requestDetailsDTO);
        return exceptionDTO;
    }

}
