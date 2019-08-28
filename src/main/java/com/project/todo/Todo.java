package com.project.todo;

import java.io.InputStream;
import java.sql.Blob;
import java.util.Arrays;

public class Todo {
	 private String Pid, Pname, Pcategory;
	   private InputStream in;

	public Todo(String pid, String pname, String pcategory) {
		super();
		Pid = pid;
		Pname = pname;
		Pcategory = pcategory;
	}

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

	}

