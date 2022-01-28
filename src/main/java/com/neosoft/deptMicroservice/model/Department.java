package com.neosoft.deptMicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "department")
public class Department {
	
	@Id
	private int deptId;
	private String deptName;
	private String deptAddress;
	private String deptPassword;
	private String deptUsername;
	public Department(int i, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	public String getDeptPassword() {
		return deptPassword;
	}
	public void setDeptPassword(String deptPassword) {
		this.deptPassword = deptPassword;
	}
	public String getDeptUsername() {
		return deptUsername;
	}
	public void setDeptUsername(String deptUsername) {
		this.deptUsername = deptUsername;
	}

}
