package com.tyn.blog.configuration.validatioconfiguration;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author wangl
 * @Description todo
 * @date 12/23/2019 9:07 AM
 */
@Documented
//自定义注解，指定注解的实现类
@Constraint(validatedBy = PhoneValidator.class)
@Target({METHOD,FIELD})
@Retention(RUNTIME)
public @interface Phone {
    String message() default "请输入正确的手机号";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    @Target({METHOD,FIELD,ANNOTATION_TYPE,CONSTRUCTOR,PARAMETER})
    @Retention(RUNTIME)
    @Documented
    @interface List{
        Phone[] value();
    }
}
