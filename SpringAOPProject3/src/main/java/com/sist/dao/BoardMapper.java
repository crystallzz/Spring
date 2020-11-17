package com.sist.dao;
import java.util.*;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
public interface BoardMapper {
@Select("SELECT no,subject,name,regdate,hit,gt,num "
		+ "FROM (SELECT no,subject,name,regdate,hit,gt,rownum as num "
		+ "FROM (SELECT no,subject,name,regdate,hit,gt "
		+ "FROM spring_reply ORDER BY gi DESC,gs ASC)) "
		+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<BoardVO> boardListData(Map map);

@SelectKey(keyProperty="no",resultType=int.class,before=true,
			statement="SELECT NVL(MAX(no)+1,1) as no FROM spring_reply")
@Insert("INSERT INTO spring_reply(no,name,subject,content,pwd,gi) "
		+ "VALUES(#{no},#{name},#{subject},#{content},#{pwd},"
		+ "(SELECT NVL(MAX(gi)+1,1) FROM spring_reply))")
	public void boardInsert(BoardVO vo);
}
