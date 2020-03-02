package com.tyn.blog.configuration.datasourceconfiguration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * @author wangl
 * @Description 配置注册多数据源
 * @date 1/3/2020 2:11 PM
 */
@SpringBootConfiguration
public class DataSource {
    @Bean(name = "dbFirst")
    @ConfigurationProperties(prefix = "spring.datasource.druid.first")

    public DruidDataSource dbFirst(){
        return  DruidDataSourceBuilder.create().build();
    }

    @Bean(name="dbSecond")
    @ConfigurationProperties(prefix = "spring.datasource.druid.second")
    @Primary
    public DruidDataSource dbSecond(){
        return DruidDataSourceBuilder.create().build();
    }


}
