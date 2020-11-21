package com.sist.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*
 * 메모리 할당
 * @Component : 일반클래스 (Sawon,MainClass..)
 * @Repository : DAO
 * @Controller : Model
 * @Service    : Manager,DAO+DAO
 * @RestController : 파일 전송 없이 일반 문자열 전송( Ajax,React....)
 * 
 * ========>Spring
 * 			=======
 * 			1. DI와 Container 개념
 * 			2. AOP vs OOP
 * 			3. DAO vs Service
 * 주입(Inject) (메모리에 저장된 객체 주소를 가지고 올때 사용),일반 변수는 사용할 수 없다
 * 	= @Autowired : 스프링에서 저장된 클래스 중에 맞는 주소 찾아서 자동 주입
 *    ===================
 *  = @Resource  
 *  = @Qualifier
 *  = @Inject
 *  ================= (특정객체 지정)
 */
@Configuration
@ComponentScan(basePackages={"com.sist.di"})
public class AppConfig {
	
}
