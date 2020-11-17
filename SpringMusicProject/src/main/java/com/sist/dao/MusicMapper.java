package com.sist.dao;

import org.apache.ibatis.annotations.Select;
import java.util.*;
public interface MusicMapper {
	   /*
    --------- -- -------------- 
   MNO          NUMBER(3)      
   TITLE        VARCHAR2(300)  
   SINGER       VARCHAR2(100)  
   ALBUM        VARCHAR2(200)  
   POSTER       VARCHAR2(1000) 
   STATE        CHAR(6)        
   IDCREMENT    NUMBER(3)      
   KEY          VARCHAR2(50)   
   HIT          NUMBER        
    */
   @Select("SELECT mno,title,singer,poster,album,state,idcrement,key,num "
         + "FROM (SELECT mno,title,singer,poster,album,state,idcrement,key,rownum as num "
         + "FROM (SELECT mno,title,singer,poster,album,state,idcrement,key "
         + "FROM genie_music ORDER BY mno ASC ))"
         + "WHERE num BETWEEN #{start} AND #{end}")
   public List<MusicVO> musicListData(Map map);
   @Select("SELECT * FROM genie_music "
         + "WHERE mno=#{mno}")
   public MusicVO musicDetailData(int mno);
   @Select("SELECT CEIL(COUNT(*)/10.0) FROM genie_music")
   public int musicTotalPage();
   
}
