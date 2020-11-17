package com.sist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc // MVC구조활성화
@ComponentScan(basePackages={"com.sist.*"})
/*
 *  DispatcherServlet ==> HandlerMapping (클래스 찾기)
 *  				  ==> ViewResolver(JSP찾기)
 */
public class AppConfig implements WebMvcConfigurer{

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
		configurer.enable();
	}
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver v=new InternalResourceViewResolver();
		v.setPrefix("/main/");
		v.setSuffix(".jsp");
		return v;
	}
}
