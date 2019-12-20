package com.tyn.blog.utils;

import com.tyn.blog.constant.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangl
 * @Description todo
 * @date 12/19/2019 11:07 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResResult<T> {
    private Integer status;
    private String desc;
    private T data ;

    public static ResResult success() {
        ResResult result = new ResResult();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    /**
     * 成功，创建ResResultUtil：有data数据
     */
    public static ResResult success(Object data) {
        ResResult result = new ResResult();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    /**
     * 失败，指定status、desc
     */
    public static ResResult fail(Integer status, String desc) {
        ResResult result = new ResResult();
        result.setStatus(status);
        result.setDesc(desc);

        return result;
    }

    /**
     * 失败，指定ResultCode枚举
     */
    public static ResResult fail(ResultCode resultCode) {
        ResResult result = new ResResult();
        result.setResultCode(resultCode);
        return result;
    }

    /**
     * 把ResultCode枚举转换为ResResultUtil
     */
    private void setResultCode(ResultCode code) {
        this.status = code.code();
        this.desc = code.message();
    }



}
