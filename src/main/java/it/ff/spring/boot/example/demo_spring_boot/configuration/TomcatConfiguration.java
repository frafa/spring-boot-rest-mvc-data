package it.ff.spring.boot.example.demo_spring_boot.configuration;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class TomcatConfiguration {
//	
//	/*
//	 * Configurazione necessaria a definire una risorsa JNDI nel tomcat embedded
//	 */
//	@Bean
//	public TomcatServletWebServerFactory tomcatFactory() {
//	        return new TomcatServletWebServerFactory(9000) {
//
//	        	@Override
//	        	protected TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
//	        		tomcat.enableNaming();
//	        		return super.getTomcatWebServer(tomcat);
//	        	}
//	        	
//	            @Override
//	            protected void postProcessContext(Context context) {
//	                ContextResource resource = new ContextResource();
//	                resource.setName("jdbc/DB_Name");
//	                resource.setType(DataSource.class.getName());
//	                resource.setProperty("driverClassName",
//	                        "com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	                resource.setProperty("jdbcUrl", "jdbc:sqlserver://127.0.0.1:1401;databaseName=Test;");
//	                resource.setProperty("password", "!Passw0rd");
//	                resource.setProperty("username", "sa");
//	                resource.setProperty("factory", "com.zaxxer.hikari.HikariJNDIFactory");
//	                
//	                context.getNamingResources().addResource(resource);
//	            }
//	        };
//	}
//	
//	@Bean(destroyMethod = "")
//    public DataSource jndiDataSource() throws IllegalArgumentException,
//            NamingException {
//        JndiObjectFactoryBean bean = new JndiObjectFactoryBean();
//        bean.setJndiName("java:comp/env/jdbc/DB_Name");
//        bean.setProxyInterface(DataSource.class);
//        bean.setLookupOnStartup(false);
//        bean.afterPropertiesSet();
//        return (DataSource) bean.getObject();
//    }
//
}
