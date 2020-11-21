package com.sist.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*
 * �޸� �Ҵ�
 * @Component : �Ϲ�Ŭ���� (Sawon,MainClass..)
 * @Repository : DAO
 * @Controller : Model
 * @Service    : Manager,DAO+DAO
 * @RestController : ���� ���� ���� �Ϲ� ���ڿ� ����( Ajax,React....)
 * 
 * ========>Spring
 * 			=======
 * 			1. DI�� Container ����
 * 			2. AOP vs OOP
 * 			3. DAO vs Service
 * ����(Inject) (�޸𸮿� ����� ��ü �ּҸ� ������ �ö� ���),�Ϲ� ������ ����� �� ����
 * 	= @Autowired : ���������� ����� Ŭ���� �߿� �´� �ּ� ã�Ƽ� �ڵ� ����
 *    ===================
 *  = @Resource  
 *  = @Qualifier
 *  = @Inject
 *  ================= (Ư����ü ����)
 */
@Configuration
@ComponentScan(basePackages={"com.sist.di"})
public class AppConfig {
	
}
