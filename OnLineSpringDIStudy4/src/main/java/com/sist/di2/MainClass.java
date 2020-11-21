package com.sist.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class  MainClass {
	public static void main(String[] args){
		// TODO Auto-generated constructor stub
	 ApplicationContext app=
			 new ClassPathXmlApplicationContext("app3.xml");
	// EmpDAO dao=new EmpDAO();�����ڵ�
	 EmpDAO dao=(EmpDAO)app.getBean("dao");//�������ȿ� ���õ� DAO�� �ҷ��;� ��밡��
	 List<EmpVO> list=dao.empListData();
	 for(EmpVO vo:list)
	 {
		 System.out.println(vo.getEmpno());
		 System.out.println(vo.getEname());
		 System.out.println(vo.getJob());
		 System.out.println(vo.getSal());
		 System.out.println(vo.getRegdate());
	 }
	}
}
