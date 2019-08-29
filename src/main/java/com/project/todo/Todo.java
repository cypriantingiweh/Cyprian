package com.project.todo;

import java.io.InputStream;
import java.sql.Blob;
import java.util.Arrays;

public class Todo {
	 private String Pid, Pname, Pcategory;
	   private String baseimage;

	public String getPid() {
		return Pid;
	}

	public void setPid(String pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public String getPcategory() {
		return Pcategory;
	}

	public void setPcategory(String pcategory) {
		Pcategory = pcategory;
	}

	public String getBaseimg() {
		return baseimage;
	}

	public void setBaseimage(String baseimage) {
		this.baseimage = baseimage;
	}

	}

