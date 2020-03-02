package com.tyn.blog.configuration.datasourceconfiguration;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wangl
 * @Description todo
 * @date 1/3/2020 3:58 PM
 */
@SpringBootConfiguration
@MapperScan(basePackages = "com.tyn.blog.dao.admin",sqlSessionFactoryRef = "sqlSessionFactory2")
public class DataSourceSecond {
    @Autowired
    @Qualifier("dbSecond")
    DruidDataSource dbSecond;

    @Bean
    @Primary
    SqlSessionFactory sqlSessionFactory2()throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dbSecond);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:mapper/admin/**/*.xml"));
        return bean.getObject();
    }


    /**
     * @Description //指定事务管理器。不指定则使用默认的
     * @author wangl
     * @Date  1/6/2020 11:18 AM
     */
    @Bean
    @Primary
    public DataSourceTransactionManager db2TransactionManager() {
        return new DataSourceTransactionManager(dbSecond);
    }

}
