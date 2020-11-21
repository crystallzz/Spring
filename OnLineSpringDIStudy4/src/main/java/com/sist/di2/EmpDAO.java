package com.sist.di2;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class EmpDAO extends SqlSessionDaoSupport{
   public List<EmpVO> empListData()
   {
      return getSqlSession().selectList("empListData");
   }
   
}