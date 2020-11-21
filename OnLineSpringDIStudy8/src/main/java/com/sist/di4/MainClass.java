package com.sist.di4;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.di2.*;
import com.sist.di3.*;

@Component
/*
 * 1. 클래스를 읽어서  메모리 할당 => 저장 공간(Container)
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
 * 2.클래스 찾기 : DL
 * 3. 생성과 동시에 필요한 데이터가 있는 경우
 *     ========================= 처리 => DI setter ,constructor
 *     									 p:			c:
 * 4.활용 : 프로그래머 몫
 * 5.소멸 : 메모리 해제
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
		System.out.println("=============사원정보=============");
		System.out.println(mc.sa.getName());
		System.out.println(mc.sa.getDept());
		System.out.println("===========회원정보================");
		System.out.println(mc.mem.getName());
		System.out.println(mc.mem.getTel());
	}

}
