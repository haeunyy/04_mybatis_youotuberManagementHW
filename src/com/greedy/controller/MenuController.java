package com.greedy.controller;

import java.util.List;
import java.util.Map;

import com.greedy.models.dto.ManagerDTO;
import com.greedy.models.dto.YoutuberDTO;
import com.greedy.models.service.ManagementService;
import com.greedy.models.views.PrintResultView;


public class MenuController {
	
	private final ManagementService managementService;
	private final PrintResultView resultView;
	
	public MenuController () {
		managementService = new ManagementService();
		resultView = new PrintResultView();
	}

	public void selectAllList() {	
		List<YoutuberDTO> list = managementService.selectAllList();
		if( list != null ) {
			resultView.printList(list);
		} else {
			resultView.printErrorMessage("selectList");
		}
	}

	public void selectByName(Map<String, String> parameter) {	

		String name = parameter.get("name");
		YoutuberDTO ytb = managementService.selectByName(name);  
		
		if(ytb != null) {
			resultView.printYoutuberList(ytb);
		} else {
			resultView.printErrorMessage("selectByName");
		}
	}

	public void selectManagerList (Map<String, String> parameter) {	
		
		if(parameter.containsKey("youtuberValue")) {
			ManagerDTO manager = managementService.selectManagerList(parameter.get("youtuberValue"));
			if(manager != null) resultView.printManagerList(manager);
			
		} else if(parameter.containsKey("managerValue")){
			ManagerDTO manager = managementService.selectManagerList(parameter.get("managerValue"));
			if(manager != null) resultView.printManagerList(manager);
			
		} else {
			resultView.printErrorMessage("selectManager");
		}
	}
	
	/*
	 * public void selectManagerList(Map<String, Object> criteria) {
	 * 
	 * List<ManagerDTO> managerList=
	 * managementService.selectManagerList("youtuberValue");
	 * 
	 * if( managerList != null) { resultView.printManagerList(managerList); } else {
	 * resultView.printErrorMessage("selectManager"); } }
	 */




	

	
	
	
	
	
	
	
	
	
}
