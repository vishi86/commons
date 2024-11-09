package api.commons.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TokenValidationException.class)
    public ResponseEntity<Object> tokenValidationException(TokenValidationException exception) {
        log.info("Exception {}", exception.getMessage());
        return new ResponseEntity<>(exception.getResponseMessage(), HttpStatus.FORBIDDEN);
    } 

    @ExceptionHandler(UserAuthenticationException.class)
    public ResponseEntity<Object> userAuthenticationException(UserAuthenticationException exception) {
        log.info("Exception {}", exception.getMessage());
        return new ResponseEntity<>(exception.getResponseMessage(), HttpStatus.BAD_REQUEST);
    }
}
