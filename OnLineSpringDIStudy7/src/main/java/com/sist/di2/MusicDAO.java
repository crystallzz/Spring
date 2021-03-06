package com.sist.di2;
/*
 *  스프링에서 관리 대상( 여러곳에서 사용하는 기능)
 1) DAO
 2) Manager
============== web에서 사용
 3) Model
 4 ) Service
 */
import java.util.*;
/*
 *  BasicDataSource => SqlSessionFactory => MusicDAO
 *       오라클정보                       connection          => PrepareStatement,ResultSet
 */
/*
 *  <bean id="dao" class="com.sist.di2.EmpDAO"
      p:sqlSessionFactory-ref="ssf"
   />
 */

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
//ID : musicDAO
public class MusicDAO extends SqlSessionDaoSupport{
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public List<MusicVO> musicListData()
	{
		return getSqlSession().selectList("musicListData");
	}
}
