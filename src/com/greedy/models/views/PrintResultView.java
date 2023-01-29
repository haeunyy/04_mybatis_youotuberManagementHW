package com.greedy.models.views;

import java.util.List;

import com.greedy.models.dto.ManagerDTO;
import com.greedy.models.dto.YoutuberDTO;

public class PrintResultView {

	public void printList(List<YoutuberDTO> allList) {
		
		for(YoutuberDTO list : allList) {
			System.out.println(list);
		}
	}

	public void printErrorMessage(String errorCode) {
		String errorMessage = null;
		switch(errorCode) {
		case "selectList" : errorMessage = "유튜버 목록 조회에 실패하였습니다. "; break;
		case "selectByName" : errorMessage = "유튜버 조회에 실패하였습니다. \n계정 이름을 다시 확인해주세요." ; break;
		case "selectManager": errorMessage = " 매니저 목록 조회에 실패하였습니다 "; break;
		case "  ": break;
		default : break;
		}
		System.out.println(errorMessage);
	}

	
	  public void printYoutuberList(YoutuberDTO ytb) { //유튜버의 이름으로 해당 유튜버 조회
	  System.out.println(ytb); }
	  
	  public void printManagerList (ManagerDTO manager) {
		  System.out.println(manager); 
		  }



}
