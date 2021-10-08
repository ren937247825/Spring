package com.itheima.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


//标志该类为核心配置类
@Configuration
@ComponentScan("com.itheima")
//@PropertySource("classpath:jdbc.properties")
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {


}
