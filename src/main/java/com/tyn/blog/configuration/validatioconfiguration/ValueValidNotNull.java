package com.tyn.blog.configuration.validatioconfiguration;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author wangl
 * @Description todo
 * @date 12/23/2019 3:13 PM
 */
@Documented
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
//指定注解的实现类
@Constraint(validatedBy = ValueValidNotNullImpl.class)
public @interface ValueValidNotNull {
    // TODO: 2019/1/10 可以添加其它扩展的属性
    String message() default "Value cannot be null";


    // TODO: 2019/1/10 groups 和 payload 这两个parameter 必须包含
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

