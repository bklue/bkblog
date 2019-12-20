package com.tyn.blog.utils;

import com.tyn.blog.constant.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangl
 * @Description todo
 * @date 12/19/2019 3:03 PM
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResult {
    private Integer status;
    private String message;
    private String exception;

    public static ErrorResult fail(ResultCode resultCode, Throwable e, String message){
        ErrorResult result = ErrorResult.fail(resultCode,e);
        result.setMessage(message);
        return result;
    }
    public static ErrorResult fail(ResultCode resultCode, Throwable e){
        ErrorResult result = new ErrorResult();
        result.setStatus(resultCode.code());
        result.setMessage(resultCode.message());
        result.setException(e.getClass().getName());
        return result;
    }

}
