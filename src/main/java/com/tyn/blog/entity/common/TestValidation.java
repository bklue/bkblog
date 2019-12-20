package com.tyn.blog.entity.common;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author wangl
 * @Description 参数校验器测试实体类
 * @date 12/20/2019 1:53 PM
 */
@Data
public class TestValidation {

    private Integer id;

    @NotNull(message = "不能为空")
    @Length(min = 3,max = 12,message = "用户名长度为3到12之间")
    private String userName;

    @NotEmpty(message = "账号长度为3到12之间")
    @Length(min = 3,max = 12,message = "长度不能")
    private String account;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 6,message = "密码长度不能小区6位")
    private String password;

    @Email(message = "邮箱格式有误")
    private String email;

    //^(\\d{18,18}|\\d{15,15}|(\\d{17,17}[x|X]))$"
    @Pattern(regexp = "/(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)/",message = "身份证格式有误")
    private String idCard;
}
