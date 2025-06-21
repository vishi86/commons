package api.commons.exception;

import api.commons.utils.ResponseMessage;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Getter
public class NotFoundException extends RuntimeException {

    private final ResponseMessage responseMessage;

    public NotFoundException(ResponseMessage message) {
        this.responseMessage = message;
    }
}
