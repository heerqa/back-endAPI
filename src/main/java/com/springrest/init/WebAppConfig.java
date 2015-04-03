package com.springrest.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.resource.DefaultServletHttpRequestHandler;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@ComponentScan(basePackages={"com.spring.controller","com.service"})
@EnableWebMvc
@ImportResource({ "/WEB-INF/security.xml" })
public class WebAppConfig {
	@Bean
	public DefaultServletHttpRequestHandler defaultServletHttpRequestHandler() {
	  return new DefaultServletHttpRequestHandler();
	}
	
	
	@Bean
    public InternalResourceViewResolver internalResourceViewResolver() {  
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
        resolver.setPrefix("/WEB-INF/view/");  
        resolver.setSuffix(".jsp");  
        
        return resolver;  
    }  
}
