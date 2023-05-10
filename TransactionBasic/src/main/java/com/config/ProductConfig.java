package com.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class ProductConfig {
	
	@Bean
	public DataSource datasource()
	{
		String driverClassName = "jdbc:postgresql://localhost:5432/productnew";
		String username = "postgres";
		String password = "Seneca123$";
		return new DriverManagerDataSource(driverClassName,username,password);
	}
	@Bean
	//initilize the data source and connection for you
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(datasource());
	}
	
	@Bean
	public TransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}
