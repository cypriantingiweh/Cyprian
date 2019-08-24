package com.project.todo;

import java.util.Arrays;

public class Todo {
	 private String Pid, Pname, Pcategory;
	 private byte[] rawBytes;

	public Todo(String pid, String pname, String pcategory,byte[] rawbytes ) {
		super();
		Pid = pid;
		Pname = pname;
		Pcategory = pcategory;
		rawBytes = rawbytes;
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

	public byte[] getRawBytes() {
		return rawBytes;
	}

	public void setRawBytes(byte[] rawBytes) {
		this.rawBytes = rawBytes;
	}
	 
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pcategory == null) ? 0 : Pcategory.hashCode());
		result = prime * result + ((Pid == null) ? 0 : Pid.hashCode());
		result = prime * result + ((Pname == null) ? 0 : Pname.hashCode());
		result = prime * result + Arrays.hashCode(rawBytes);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (Pcategory == null) {
			if (other.Pcategory != null)
				return false;
		} else if (!Pcategory.equals(other.Pcategory))
			return false;
		if (Pid == null) {
			if (other.Pid != null)
				return false;
		} else if (!Pid.equals(other.Pid))
			return false;
		if (Pname == null) {
			if (other.Pname != null)
				return false;
		} else if (!Pname.equals(other.Pname))
			return false;
		if (!Arrays.equals(rawBytes, other.rawBytes))
			return false;
		return true;
	}
}
