package com.sist.di5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//GenericXmlApplicationContext => XML파싱
//GenericApplicationContext => XML파싱 기능이 없다(어노테이션 용도)
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext app=
				new GenericXmlApplicationContext("app.xml");
	//	ApplicationContext app=
			//	new ClassPathXmlApplicationContext("app.xml");
		Sawon sa=(Sawon)app.getBean("sa");
		//사용 범위(scope) => 싱글톤/프로토타입
		Sawon sa2=(Sawon)app.getBean("sa");
		System.out.println("sa:"+sa);
		System.out.println("sa2:"+sa2);
		sa.print();
		app.close();
		
	}

}
