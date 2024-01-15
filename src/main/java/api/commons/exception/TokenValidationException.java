package api.commons.exception;

import api.commons.utils.ResponseMessage;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
@Getter
public class TokenValidationException extends RuntimeException {

    private final ResponseMessage responseMessage;

    public TokenValidationException(Exception ex, ResponseMessage message) {
        super(ex);
        this.responseMessage = message;
    }
}
