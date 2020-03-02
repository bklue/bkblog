package com.tyn.blog.configuration.datasourceconfiguration;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;

/**
 * @author wangl
 * @Description todo
 * @date 1/3/2020 3:20 PM
 */
@SpringBootConfiguration
@MapperScan(basePackages = "com.tyn.blog.dao.common",sqlSessionFactoryRef = "sqlSessionFactory1")
public class DataSourceFirst {
    @Resource(name = "dbFirst")
    DruidDataSource dbFirst;

    @Bean
    public SqlSessionFactory sqlSessionFactory1()throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dbFirst);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:mapper/common/*.xml"));
        return bean.getObject();
    }

    @Bean
    public DataSourceTransactionManager db1TransactionManager() {
        return new DataSourceTransactionManager(dbFirst);

    }


}
