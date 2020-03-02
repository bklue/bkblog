package com.tyn.blog.configuration.validatioconfiguration;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author wangl
 * @Description todo
 * @date 12/23/2019 3:14 PM
 */

public class ValueValidNotNullImpl implements ConstraintValidator<ValueValidNotNull, String> {

    @Override
    public void initialize(ValueValidNotNull constraintAnnotation) {
        // TODO: 2019/1/10 初始化操作
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        // TODO: 2019/1/10 具体逻辑
        if(value == null || value.isEmpty()){
            return false;
        }
        return true;
    }
}
