package com.sist.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
public class Config1 {
	@Bean("sa")
	public Sawon sawonInfo()
	{
		Sawon s=new Sawon(); //��ü����
		s.setName("����");
		s.setDept("����");
		s.setJob("���");
		return s;
	}
}
}
