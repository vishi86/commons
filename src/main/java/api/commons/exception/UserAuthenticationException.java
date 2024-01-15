package api.commons.exception;

import api.commons.utils.ResponseMessage;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
@Getter
public class UserAuthenticationException extends RuntimeException {

    private final ResponseMessage responseMessage;

    public UserAuthenticationException(Exception ex, ResponseMessage message) {
        super(ex);
        this.responseMessage = message;
    }
}
