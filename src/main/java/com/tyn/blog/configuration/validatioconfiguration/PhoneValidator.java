package com.tyn.blog.configuration.validatioconfiguration;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author wangl
 * @Description todo
 * @date 12/23/2019 9:45 AM
 */

public class PhoneValidator implements ConstraintValidator<Phone,String> {

    private static final Pattern PHONE_PATTERN = Pattern.compile(
            "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$"
    );

    @Override
    public void initialize(Phone constraintAnnotation) {

    }

    /**
     * @Description //校验的逻辑
     * @author wangl
     * @Date  12/23/2019 10:10 AM
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        //只验证手机号格式，不验证是否为空
        if(s == null || s.length()==0) {
            return true;
        }
        Matcher m = PHONE_PATTERN.matcher(s);
        return m.matches();
    }
}
