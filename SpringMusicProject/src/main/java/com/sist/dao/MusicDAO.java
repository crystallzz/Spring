package com.sist.dao;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class MusicDAO {
	@Autowired
	private MusicMapper mapper;
	public List<MusicVO> musicListData(Map map)
	{
		return mapper.musicListData(map);
	}
	public MusicVO musicDetailData(int mno)
	{
		return mapper.musicDetailData(mno);
	}
	public int musicTotalPage()
	{
		return mapper.musicTotalPage();
	}
}
