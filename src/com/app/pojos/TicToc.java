package com.app.pojos;

import java.io.Serializable;

public class TicToc implements Serializable{

	private String id;
	private String date;
	private String title;
	private String desc;
	private String presentor;
	public TicToc() {
		super();
	}
	
	
	public TicToc(String id, String date, String title, String desc, String presentor) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.desc = desc;
		this.presentor = presentor;
	}


	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getPresentor() {
		return presentor;
	}


	public void setPresentor(String presentor) {
		this.presentor = presentor;
	}


	@Override
	public String toString() {
		return "TicToc [id=" + id + ", date=" + date + ", title=" + title + ", desc=" + desc + ", presentor="
				+ presentor + "]";
	}
	
	
}
