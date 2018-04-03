package com.job.portal.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author
 */
@Configuration
@ComponentScan(basePackages = {"com.job.portal.spring"})
public class RootConfig {
   //..

   @Bean (name = "mySqlDataSource")
   public DriverManagerDataSource dataSource(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("com.mysql.jdbc.Driver");
       dataSource.setUrl("jdbc:mysql://localhost:3306/jobportal");
       dataSource.setUsername("swaran");
       dataSource.setPassword("password");
       return dataSource;
   }

   @Bean (name = "mySqlTemplate")
    public JdbcTemplate jdbcTemplate(){

       JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
       return jdbcTemplate;
   }


}
