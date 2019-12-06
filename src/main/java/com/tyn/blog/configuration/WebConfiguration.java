package com.tyn.blog.configuration;

import com.tyn.blog.interceptor.TestInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author wangl
 * @Description 拦截器配置
 * @date 12/6/2019 2:51 PM
 */
public class WebConfiguration  extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new TestInterceptor());
    }
}
