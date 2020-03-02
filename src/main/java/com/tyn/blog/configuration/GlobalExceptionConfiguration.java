package com.tyn.blog.configuration;

import com.tyn.blog.constant.ResultCode;
import com.tyn.blog.exception.AccountException;
import com.tyn.blog.utils.ErrorResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author wangl
 * @Description todo
 * @date 12/19/2019 3:21 PM
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionConfiguration {
    //规定返回网络状态码
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    //统一处理某一类异常
    @ExceptionHandler(Throwable.class)
    public ErrorResult exceptionHandler(Throwable e, HttpServletRequest request){
        ErrorResult error = ErrorResult.fail(ResultCode.SYSTEM_ERROR,e);
        log.error("请求路径"+request.getRequestURL()+"异常"+e);
        return error;
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(AccountException.class)
    public ErrorResult accountExHandler(AccountException e,HttpServletRequest request){
        ErrorResult error = ErrorResult.builder().status(e.getCode())
                .message(e.getMessage())
                .exception(e.getClass().getName()).build();
        log.warn("请求路径"+request.getRequestURL()+"异常"+e);
        return error;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResult MethodArgumentNotValidExHandler(MethodArgumentNotValidException e,HttpServletRequest request){
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        StringBuilder message = new StringBuilder();
        fieldErrors.forEach(s ->{
            String defaultMessage = s.getDefaultMessage();
            message.append(defaultMessage).append(";");
        });
        log.warn("请求路径"+request.getRequestURL()+"异常"+e);
        return ErrorResult.fail(ResultCode.PARAM_IS_INVALID,e,message.toString());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ErrorResult IllegalArgumentExHandler(IllegalArgumentException e,HttpServletRequest request){
        ErrorResult error = ErrorResult.builder().status(2000)
                .message(e.getMessage())
                .exception(e.getClass().getName())
                .build();
        log.warn("请求路径"+request.getRequestURL()+"异常"+e);
        return error;
    }

}
