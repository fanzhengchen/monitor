package com.xgn.web.response;

import lombok.Builder;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-12
 * Time: 4:22 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Data
@Builder
public class BaseResponse {
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    private static final String OK_CODE = "0";

    private static final String ERROR_CODE = "1";

    private Object resultData;
    private String resultCode;
    private String resultMessage;


    public static BaseResponse ok() {
        return BaseResponse.builder()
                .resultCode(OK_CODE)
                .resultMessage(SUCCESS)
                .build();
    }

    public static BaseResponse ok(Object data) {
        return BaseResponse.builder()
                .resultCode(OK_CODE)
                .resultMessage(SUCCESS)
                .resultData(data)
                .build();
    }

    public static BaseResponse error() {
        return BaseResponse.builder()
                .resultCode(ERROR_CODE)
                .resultMessage(ERROR)
                .build();
    }

    public static BaseResponse error(String message) {
        return BaseResponse.builder()
                .resultCode(ERROR_CODE)
                .resultMessage(message)
                .build();
    }

}
