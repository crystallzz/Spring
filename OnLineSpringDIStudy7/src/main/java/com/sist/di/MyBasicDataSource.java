package com.sist.di;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;

/*
 *   <bean id="ds" class="org.apache.commons.dbcp.BasicDataSource"
      p:driverClassName="oracle.jdbc.driver.OracleDriver"
      p:url="jdbc:oracle:thin:@211.238.142.183:1521:XE"
      p:username="hr"
      p:password="happy"
   />
   
 */
/*
 *  메모리 할당
 *   @Component : 일반 클래스
 *   @Repository : 저장소 (DataBase와 관련) => DAO
 *   =========================================
 *   @Controller  : Model  =======> return 사이트 주소 (JSP파일명)
 *   @RestController : Model =====> return 일반 문자열  (ajax,json...)
 *   =====================================web
 *   @Service : Manager,DAO가 여러개일 경우 묶어서 사용
 */
//DB 정보
//기능은 없고 정보만 가짐 => 일반 클래스
@Component
//ID 설정값이 없으면 클래스 이름=ID
public class MyBasicDataSource extends BasicDataSource{
	public MyBasicDataSource()
	{
		setDriverClassName("oracle.jdbc.driver.OracleDriver");
		setUrl("jdbc:oracle:thin:@211.238.142.183:1521:XE");
		setUsername("hr");
		setPassword("happy");
		
	}
//메모리 할당
}
