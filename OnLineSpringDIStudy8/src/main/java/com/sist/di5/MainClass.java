package com.sist.di5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//GenericXmlApplicationContext => XML�Ľ�
//GenericApplicationContext => XML�Ľ� ����� ����(������̼� �뵵)
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext app=
				new GenericXmlApplicationContext("app.xml");
	//	ApplicationContext app=
			//	new ClassPathXmlApplicationContext("app.xml");
		Sawon sa=(Sawon)app.getBean("sa");
		//��� ����(scope) => �̱���/������Ÿ��
		Sawon sa2=(Sawon)app.getBean("sa");
		System.out.println("sa:"+sa);
		System.out.println("sa2:"+sa2);
		sa.print();
		app.close();
		
	}

}
