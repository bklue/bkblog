package com.tyn.blog.exception;

import com.tyn.blog.constant.ResultCode;
import lombok.Data;

/**
 * @author wangl
 * @Description todo
 * @date 12/19/2019 4:15 PM
 */
@Data
public class AccountException  extends RuntimeException{
    protected Integer code;
    protected String message;

    public AccountException(ResultCode resultCode){
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public AccountException(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}
