package net.sotanobinario.boot.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class MyBatisConfig {
	
	@Value("classpath:/mybatis/mybatis-config.xml")
	private Resource configFile;
	
	@Bean
	public PooledDataSource dataSource() {
		PooledDataSource dataSource;
		
		dataSource = new PooledDataSource();
		dataSource.setDriver("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://servidor:puerto/baseDeDatos");
		dataSource.setUsername("usuario");
		dataSource.setPassword("password");
		
		return dataSource;
	}
	
}
