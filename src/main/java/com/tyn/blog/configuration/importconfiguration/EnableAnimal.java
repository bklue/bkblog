package com.tyn.blog.configuration.importconfiguration;


import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author wangl
 * @Description todo
 * @date 12/25/2019 10:14 AM
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RUNTIME)
@Import(AnimalSelector.class)
public @interface EnableAnimal {

}
