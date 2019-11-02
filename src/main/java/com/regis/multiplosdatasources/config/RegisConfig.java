package com.regis.multiplosdatasources.config;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(
    basePackages = "com.regis.multiplosdatasources.repository.regis",
    entityManagerFactoryRef = "regisEntityManagerFactory",
    transactionManagerRef = "regisTransactionManager"
)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
		                    DataSourceTransactionManagerAutoConfiguration.class}) 

public class RegisConfig {

	public DataSource regisDataSource() {
	    	 DataSource ds = null;  
	         try {  
	             Context ctx = new InitialContext();  
	             ds = (DataSource) ctx.lookup("java:jboss/datasources/RegisDS");  
	         }
	         catch (NamingException e) { 
	           e.printStackTrace();
	         }  
	         if (ds == null) {  
	             throw new IllegalArgumentException("No Control Database could be found");  
	         }  
	         return ds;
	    }

	    @Bean
	    public PlatformTransactionManager regisTransactionManager() {
	        EntityManagerFactory factory = regisEntityManagerFactory().getObject();
	        return new JpaTransactionManager(factory);
	    }
	
	    @Bean
	    @Primary
	    public LocalContainerEntityManagerFactoryBean regisEntityManagerFactory() {
	        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
	        factory.setPackagesToScan("com.regis.multiplosdatasources.model.regis");
	        factory.setPersistenceUnitName("RegisDS");
	        factory.setDataSource(regisDataSource());
	        factory.setPersistenceProviderClass(org.hibernate.jpa.HibernatePersistenceProvider.class);
	        return factory;
	    }
	    
}