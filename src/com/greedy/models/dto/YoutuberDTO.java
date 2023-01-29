package com.greedy.models.dto;

public class YoutuberDTO {
//	YOUTUBER_CODE	NUMBER(10,0)
//	YOUTUBER_USERNAME	VARCHAR2(30 BYTE)
//	YOUTUBER_NUMBER	VARCHAR2(30 BYTE)
//	YOUTUBER_URL	VARCHAR2(150 BYTE)
//	GRADE_CODE	NUMBER(2,0)
//	MANAGER_CODE	NUMBER(10,0)
//	DEAL_YN	CHAR(1 BYTE)
	
	private int youtuberCode;
	private String youtuberName;	// 유튜버 계정 이름
	private String youtuberNum;		// 유튜버 전화번호
	private String youtuberUrl;		// 유튜트 주소
	private int gradeCode;
	private int managerCode;
	private String dealYN;			// 계약 유지여부
	
	public YoutuberDTO() {}

	public YoutuberDTO(int youtuberCode, String youtuberName, String youtuberNum, String youtuberUrl, int gradeCode,
			int managerCode, String dealYN) {
		super();
		this.youtuberCode = youtuberCode;
		this.youtuberName = youtuberName;
		this.youtuberNum = youtuberNum;
		this.youtuberUrl = youtuberUrl;
		this.gradeCode = gradeCode;
		this.managerCode = managerCode;
		this.dealYN = dealYN;
	}

	public int getYoutuberCode() {
		return youtuberCode;
	}

	public void setYoutuberCode(int youtuberCode) {
		this.youtuberCode = youtuberCode;
	}

	public String getYoutuberName() {
		return youtuberName;
	}

	public void setYoutuberName(String youtuberName) {
		this.youtuberName = youtuberName;
	}

	public String getYoutuberNum() {
		return youtuberNum;
	}

	public void setYoutuberNum(String youtuberNum) {
		this.youtuberNum = youtuberNum;
	}

	public String getYoutuberUrl() {
		return youtuberUrl;
	}

	public void setYoutuberUrl(String youtuberUrl) {
		this.youtuberUrl = youtuberUrl;
	}

	public int getGradeCode() {
		return gradeCode;
	}

	public void setGradeCode(int gradeCode) {
		this.gradeCode = gradeCode;
	}

	public int getManagerCode() {
		return managerCode;
	}

	public void setManagerCode(int managerCode) {
		this.managerCode = managerCode;
	}

	public String getDealYN() {
		return dealYN;
	}

	public void setDealYN(String dealYN) {
		this.dealYN = dealYN;
	}

	@Override
	public String toString() {
		return "YoutuberDTO [youtuberCode=" + youtuberCode + ", youtuberName=" + youtuberName + ", youtuberNum="
				+ youtuberNum + ", youtuberUrl=" + youtuberUrl + ", gradeCode=" + gradeCode + ", managerCode="
				+ managerCode + "]";
	}
	
	
	
	
}
