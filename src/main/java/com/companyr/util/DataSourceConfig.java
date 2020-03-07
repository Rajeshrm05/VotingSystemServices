package com.companyr.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.annotation.*;

@Configuration
@EnableTransactionManagement
public class DataSourceConfig {
 
	@Bean(name="joDb2DB")
	@Primary
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource joDb2DataSource(){
		return (DataSource)DataSourceBuilder.create().build();
	}
	
	@Bean(name="joJdbcTemplate")
	public JdbcTemplate joJdbcTemplate(@Qualifier("joDb2DB") DataSource joDb2DB){
		return new JdbcTemplate((DataSource) joDb2DB);
	}
	
	@Bean(name="joNamedJdbcTemplate")
	public NamedParameterJdbcTemplate joNamedJdbcTemplate(@Qualifier("joDb2DB") DataSource joDb2DB){
		return new NamedParameterJdbcTemplate((DataSource) joDb2DB);
	}
}
