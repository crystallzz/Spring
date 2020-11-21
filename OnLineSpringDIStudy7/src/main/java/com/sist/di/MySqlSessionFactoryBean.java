package com.sist.di;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/*
 * <bean id="ssf" class="org.mybatis.spring.SqlSessionFactoryBean"
      p:dataSource-ref="ds"
      p:configLocation="classpath:Config.xml"
   />
 */
@Component
//ID : mySqlSessionFactoryBean
public class MySqlSessionFactoryBean extends SqlSessionFactoryBean{
	//datasource를 오버라이드 해서 autowired
	//Autowired 
	// CONSTRUCTOR(생성자), FIELD(멤버변수) , METHOD(메소드) , PARAMETER(매개변수)에 사용가능
	/*
	 *  class A
	 *  {
	 *    @Autowirde
	 *    B b;
	 *    
	 *    @Autowirde
	 *    public A(B b){}
	 *    
	 *    @Autowirde
	 *    public void setB(B b){}
	 *    
	 *    @Autowirde
	 *    public void display(B b){}
	 *   B b;
	 *   public A(B b){}
	 *   public void setB(B b){}
	 *   public void display(B b){}
	 *  }
	 */
	@Autowired
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		super.setDataSource(dataSource);
	}
	public MySqlSessionFactoryBean()
	{
		try
		{
		  Resource res=new ClassPathResource("Config.xml");
		  setConfigLocation(res);
		}
		catch(Exception ex){}
	}
}
