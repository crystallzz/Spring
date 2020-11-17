package com.sist.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages={"com.sist.*"})
@EnableWebMvc
/*
 *  Front : Jquery
 *  Back : Spring => Oracle (Java 상용화) ==> 다른 언어가 필요 (Java,Kotlin)
 */
//HandlerMapping, HandlerAdapter, HttpRequestHandler => 셋팅
public class AppConfig implements WebMvcConfigurer {
	
@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
	configurer.enable();
}
@Bean
	public DataSource dataSource()
	{
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("hr");
		ds.setPassword("happy");
		return ds;
	}
@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception
	{
		SqlSessionFactoryBean ssf=new SqlSessionFactoryBean();
		ssf.setDataSource(dataSource());
		return ssf.getObject();
	}
/*
 *  <bean id="mapper" class="org.mybatis.spring.mapper.MapperFactoryBean"
	 	p:sqlSessionFactory-ref="ssf"
	 	p:mapperInterface="com.sist.dao.MusicMapper"
	 />
 */
@Bean
	public MapperFactoryBean mapperFactoryBean() throws Exception
	{
		MapperFactoryBean m=new MapperFactoryBean();
		m.setSqlSessionFactory(sqlSessionFactory());
		m.setMapperInterface(com.sist.dao.MusicMapper.class);
		return m;
	}
@Bean
	public ViewResolver viewResolver() 
	{
		InternalResourceViewResolver r=new InternalResourceViewResolver();
		/*
		 *  Class clsName=Class.forName("org.springframework.web.servlet.view.InternalResourceViewResolver")
		 *  Object obj=clsName.newInstance 
		 *  같은 결과
		 */
		r.setPrefix("/");
		r.setSuffix(".jsp");
		return r;
	}
}
