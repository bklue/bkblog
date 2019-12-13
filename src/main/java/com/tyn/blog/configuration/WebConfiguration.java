package com.tyn.blog.configuration;

import com.tyn.blog.interceptor.TestInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author wangl
 * @Description 拦截器配置
 * @date 12/6/2019 2:51 PM
 */
@SpringBootConfiguration
public class WebConfiguration  extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new TestInterceptor());//addPathPatterns("/api/**")配置拦截路径，
                                    // 其中/**表示当前目录以及所有子目录（递归），/*表示当前目录，不包括子目录。
    }
}
