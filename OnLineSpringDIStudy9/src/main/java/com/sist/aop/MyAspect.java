package com.sist.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//공통 모듈
@Aspect
@Component //메모리 할당
/*
 *  호출을 시작하는 지점을 지정=> JoinPoint
 *  어느 메소드를 호출할때 호출할지 지정 => PointCut
 *  
 */
public class MyAspect {
	@Autowired
	private MyDAO dao;
	@Before("execution(* com.sist.aop.MyDAO.db_*(..))") //db_로 시작되는 메소드가 호출되기 전에 호출
	public void before()
	{
		dao.getConnection();
	}
	@After("execution(* com.sist.aop.MyDAO.db_*(..))")//db_로 시작되는 메소드가 호출된 후에 호출
	public void after()
	{
		dao.disConnection();
	}
}
