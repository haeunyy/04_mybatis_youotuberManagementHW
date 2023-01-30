package com.greedy.models.dto;

import java.util.List;

public class ManagerDTO {

	private int managerCode;
	private String managerName;
	private String managerNum;
	
	public ManagerDTO () {}

	public ManagerDTO(int managerCode, String managerName, String managerNum) {
		super();
		this.managerCode = managerCode;
		this.managerName = managerName;
		this.managerNum = managerNum;
	}

	public int getManagerCode() {
		return managerCode;
	}

	public void setManagerCode(int managerCode) {
		this.managerCode = managerCode;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerNum() {
		return managerNum;
	}

	public void setManagerNum(String managerNum) {
		this.managerNum = managerNum;
	}


	@Override
	public String toString() {
		return "ManagerDTO [managerCode=" + managerCode + ", managerName=" + managerName + ", managerNum="
				+ managerNum + "]";
	}

	
}