package net.sotanobinario.boot.config;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ImportResource({"classpath:/META-INF/servlet-config.xml"})
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Bean
    public DispatcherServlet dispatcherServlet() {
    	return new DispatcherServlet();
    }
    
    @Bean
    public DispatcherServletRegistrationBean dispatcherServletRegistration() {
    	DispatcherServletRegistrationBean dispatcherServletRegistration = new DispatcherServletRegistrationBean(dispatcherServlet(), "/ui/");
    	dispatcherServletRegistration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME);
    	return dispatcherServletRegistration;
    }
}
