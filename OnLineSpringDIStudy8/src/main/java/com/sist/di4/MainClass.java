package com.sist.di4;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.di2.*;
import com.sist.di3.*;

@Component
/*
 * 1. Ŭ������ �о  �޸� �Ҵ� => ���� ����(Container)
 *    ApplicationContext => Map
 *    AnnotationConfigApplicationContext
 *    = MVC =>WebApplicationContext
 * 
 *    @Component("sa")
 *    ========================
 *    key          value
 *    ========================
 *    sawon       new Sawon()    ====> getBean("sa") ==> Sawon s=app.getBean("sa")
 * 															  =================
 * 																new Sawon()
 * 2.Ŭ���� ã�� : DL
 * 3. ������ ���ÿ� �ʿ��� �����Ͱ� �ִ� ���
 *     ========================= ó�� => DI setter ,constructor
 *     									 p:			c:
 * 4.Ȱ�� : ���α׷��� ��
 * 5.�Ҹ� : �޸� ����
 */
public class MainClass {
	@Resource(name="sa")
	private Sawon sa;
	@Resource(name="mem")
	private Member mem;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext app=
				new AnnotationConfigApplicationContext(AppConfig.class);
		MainClass mc=(MainClass)app.getBean("mainClass");
		System.out.println("=============�������=============");
		System.out.println(mc.sa.getName());
		System.out.println(mc.sa.getDept());
		System.out.println("===========ȸ������================");
		System.out.println(mc.mem.getName());
		System.out.println(mc.mem.getTel());
	}

}
