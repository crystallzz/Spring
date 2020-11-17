package com.sist.dao;

/*
 * 						DispatcheServlet => HandlerMappping
 * 												 | ==> RequestMapping("list.do")
 * ==========요청 ==========================>MusicController  <=========> DAO
 * 											  List,VO
 * 												 | => Model
 * 												   => List, VO , JSON(ajax,react,vue)
 * 																	{}[]
 * 																	VO List
 * 													ViewResolver =>< Model을 request로 변환 => JSP
 */
public class MusicVO {
	private int mno;
	private String title;
	private String singer;
	private String poster;
	private String album;
	private String state;
	private int idcrement;
	
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	private String key;
	private int hit;
	
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	
}
