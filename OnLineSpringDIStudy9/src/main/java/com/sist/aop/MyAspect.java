package com.sist.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//���� ���
@Aspect
@Component //�޸� �Ҵ�
/*
 *  ȣ���� �����ϴ� ������ ����=> JoinPoint
 *  ��� �޼ҵ带 ȣ���Ҷ� ȣ������ ���� => PointCut
 *  
 */
public class MyAspect {
	@Autowired
	private MyDAO dao;
	@Before("execution(* com.sist.aop.MyDAO.db_*(..))") //db_�� ���۵Ǵ� �޼ҵ尡 ȣ��Ǳ� ���� ȣ��
	public void before()
	{
		dao.getConnection();
	}
	@After("execution(* com.sist.aop.MyDAO.db_*(..))")//db_�� ���۵Ǵ� �޼ҵ尡 ȣ��� �Ŀ� ȣ��
	public void after()
	{
		dao.disConnection();
	}
}
