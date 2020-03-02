package com.tyn.blog.vo;

import com.tyn.blog.configuration.validatioconfiguration.Phone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

/**
 * @author wangl
 * @Description 参数校验器测试实体类
 * @date 12/20/2019 1:53 PM
 */
@Data
@ApiModel(value = "测试参数实体")
public class TestValidation {

    private Integer id;
    @ApiModelProperty(value = "用户名")
    @NotNull(message = "用户名不能为空")//只能校测null
    @Length(min = 3,max = 12,message = "用户名长度为3到12之间")
    private String userName;

    @NotBlank(message = "账号不能为空")//和@empty相同,同时检测null
    @Length(min = 3,max = 12,message = "账号长度为3到12位之间")
    private String account;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 6,message = "密码长度不能小区6位")
    private String password;

    @Email(message = "邮箱格式有误")
    private String email;

    //^(\\d{18,18}|\\d{15,15}|(\\d{17,17}[x|X]))$"
    @Pattern(regexp = "/(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)/",message = "身份证格式有误")//不检测null
    private String idCard;

    @Phone
    private String phone;

}
