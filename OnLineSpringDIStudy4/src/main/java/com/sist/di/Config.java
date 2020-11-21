package com.sist.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
public class Config1 {
	@Bean("sa")
	public Sawon sawonInfo()
	{
		Sawon s=new Sawon(); //객체생성
		s.setName("순신");
		s.setDept("개발");
		s.setJob("사원");
		return s;
	}
}
}
