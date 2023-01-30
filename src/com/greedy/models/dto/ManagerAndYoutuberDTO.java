package com.greedy.models.dto;

public class ManagerAndYoutuberDTO {

	private int managerCode;
	private String managerName;
	private String managerNum;
	private YoutuberDTO youtuber;
	
	public ManagerAndYoutuberDTO () {}

	public ManagerAndYoutuberDTO(int managerCode, String managerName, String managerNum, YoutuberDTO youtuber) {
		super();
		this.managerCode = managerCode;
		this.managerName = managerName;
		this.managerNum = managerNum;
		this.youtuber = youtuber;
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

	public YoutuberDTO getYoutuber() {
		return youtuber;
	}

	public void setYoutuber(YoutuberDTO youtuber) {
		this.youtuber = youtuber;
	}

	@Override
	public String toString() {
		return "ManagerAndYoutuberDTO [managerCode=" + managerCode + ", managerName=" + managerName + ", managerNum="
				+ managerNum + ", youtuber=" + youtuber + "]";
	}
	
	
	
}
