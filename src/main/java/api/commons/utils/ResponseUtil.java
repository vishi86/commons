package api.commons.utils;

import java.util.Date;

public class ResponseUtil {

    public static ResponseMessage getHttpResponseMessage(String message, int statusCode, Object res, String path) {
        return new ResponseMessage(statusCode, message, path, res, new Date());
    }
}
