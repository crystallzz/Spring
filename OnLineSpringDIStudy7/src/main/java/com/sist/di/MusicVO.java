package com.sist.di;
/*
 * ~VO
 * ~DTO
 * ~Bean
 * ======== �����͸� ��Ƽ� ����(�Ϲ� ��������)
 * ���������� �޸� �Ҵ��� ���� �ʰ� ���α׷��Ӱ� �ʿ�ø��� �޸� �Ҵ��� �Ѵ�
 * 
 */
public class MusicVO {
 public int mno;
 public String title;
 public String singer;
 public String album;
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
public String getAlbum() {
	return album;
}
public void setAlbum(String album) {
	this.album = album;
}
 
}
