package api.commons.exception;

import api.commons.utils.ResponseMessage;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
@Getter
public class NoDataException extends RuntimeException {

    private final ResponseMessage responseMessage;

    public NoDataException(ResponseMessage message) {
        this.responseMessage = message;
    }
}
