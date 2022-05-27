package api.commons.utils;

public class ResponseUtil {

    public static SuccessResponse getHttpStatusResponse(String message, int statusCode, Object res) {
        return new SuccessResponse(res, statusCode, message);
    }
}
