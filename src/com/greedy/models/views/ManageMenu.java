package com.greedy.models.views;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.greedy.common.SearchCriteria;
import com.greedy.controller.MenuController;
import com.greedy.models.service.ManagementService;

public class ManageMenu {

	public void displayMenu() {

		Scanner sc = new Scanner(System.in);
		MenuController menuC = new MenuController();
		ManagementService manageS = new ManagementService();

		do {
			System.out.println("================  개발새발 매니지먼트 접속 ==============");
			System.out.println(" 1. 개발새발 소속 유튜버 전체목록 조회");
			System.out.println(" 2. 유튜버 이름으로 조회 ");
			System.out.println(" 3. 매니저 조회 ");
			System.out.println(" 4. 유튜버 관리 프로그램으로 이동 ");
			System.out.print(" -- 원하시는 메뉴 목록을 선택해주세요 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1: menuC.selectAllList();
			case 2: menuC.selectByName(inputName());
			case 3: menuC.selectManagerList(inputSearchCriteria());
			case 4: manageMentSubMenu();
			default : System.out.println("메뉴 번호를 다시 확인해주세요. ");
			}

		} while (true);
	}

	
	private void manageMentSubMenu() {

		Scanner sc = new Scanner(System.in);
		MenuController menuC = new MenuController();
		
		do {
			System.out.println("================  관리 프로그램 ==============");
			System.out.println(" 1. 신규 유튜버 추가 ");
			System.out.println(" 2. 유튜버 정보 변경  ");
			System.out.println(" 3. 유튜버 정보 삭제 ");
			System.out.print(" -- 원하시는 메뉴 목록을 선택해주세요 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1: menuC.registYoutuber(inputYoutuber());
			case 2: menuC.modifyYoutuber(inputYoutubeCode());
			case 3: menuC.selectManagerList(inputSearchCriteria());
			case 4: manageMentSubMenu();
			default : System.out.println("메뉴 번호를 다시 확인해주세요. ");
			}

		} while (true);

	}
		
	private Map<String, String> inputYoutuber() {
		Scanner sc = new Scanner(System.in);
		Map<String,String> parameter = new HashMap<>();

		System.out.print(" 신규 유튜버 계정 이름 : ");
		parameter.put("name", sc.nextLine());
		System.out.print(" 전화번호 입력 : ");
		parameter.put("num" ,sc.nextLine());
		System.out.print(" 유튜브 채널 url 입력 :  ");
		parameter.put("url", sc.nextLine());
		System.out.println(" 유튜브 등급 코드 입력");
		System.out.println("  1	브론즈");
		System.out.println("  2	실버");
		System.out.println("  3	골드");
		System.out.println("  4	다이아몬드");
		System.out.println("  5	루비");
		System.out.print(" :  ");
		parameter.put("gradeCode",sc.nextLine());
		System.out.print(" 매니저 코드 입력 : ");
		parameter.put("managerCode",sc.nextLine());
		
		return parameter;
	}

	private Map<String,String> inputYoutubeCode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 유튜버 코드 번호 : ");
		String code = sc.nextLine();
		System.out.print("변경된 유튜버 계정 이름 : ");
		String name = sc.nextLine();
		System.out.print("변경된 전화번호 입력 : ");
		String num = sc.nextLine();
		System.out.print("변경된 유튜브 등급코드 입력");
		System.out.print("  1	브론즈");
		System.out.print("  2	실버");
		System.out.print("  3	골드");
		System.out.print("  4	다이아몬드");
		System.out.print("  5	루비");
		System.out.print(" :  ");
		String gradeCode = sc.nextLine();
		//거래 유지여부
		
		/*System.out.print("변경된 매니저 코드를 입력해주세요 : ");
		String managerCode = sc.nextLine();*/
		
		Map<String,String> parameter = new HashMap<>();
		parameter.put("code",code);
		parameter.put("name",name);
		parameter.put("gradeCode",gradeCode);
		parameter.put("num",num);
		return parameter;
	}

	private static Map<String, String> inputSearchCriteria() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" 유튜버 계정이름으로 조회를 원하시면 << youtuber >> ");
		System.out.println("    매니저 이름으로 조회를 원하시면 <<  manager >> ");
		System.out.print("                   입력해주세요 :    ");
		String condition = sc.nextLine();

		Map<String, String> criteria = new HashMap<>();
		
		if ("youtuber".equals(condition)) {
			
			System.out.print(" 유튜버 계정 이름을 입력 해주세요 : ");
			String youtuberValue = sc.nextLine();
			criteria.put("youtuberValue", youtuberValue);
			
		} else if ("manager".equals(condition)) {
			
			System.out.print(" 매니저 이름 입력을 입력해주세요 : ");
			String managerValue = sc.nextLine();
			criteria.put("managerValue", managerValue);
		} 
		return criteria;
	}
	/*
	 * private static Map<String, Object> inputSearchCriteria() {
	 * 
	 * Scanner sc = new Scanner(System.in); Map<String, Object> criteria = new
	 * HashMap<>();
	 * 
	 * System.out.println(" 유튜버 계정이름으로 조회를 원하시면 << youtuber >> ");
	 * System.out.println("    매니저 이름으로 조회를 원하시면 <<  manager >> ");
	 * System.out.println("            전체 조회를 원하시면 <<  enter key >> 를 입력해주세요 ");
	 * String condition = sc.nextLine();
	 * 
	 * if ("youtuber".equals(condition)) {
	 * 
	 * System.out.print(" 유튜버 계정 이름을 입력 해주세요 : "); String youtuberValue =
	 * sc.nextLine(); criteria.put("youtuberValue", youtuberValue);
	 * 
	 * } else if ("manager".equals(condition)) {
	 * 
	 * System.out.print(" 매니저 이름 입력을 입력해주세요 : "); String managerValue =
	 * sc.nextLine(); criteria.put("managerValue", managerValue); } return criteria;
	 * }
	 */
	
	/*
	 * private static Map<String, String> inputSearchCriteria() {
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * System.out.print("검색 기준을 입력해주세요( 유튜버 계정이름 / 매니저 이름  ) : "); String condition
	 * = sc.nextLine(); System.out.print("검색어를 입력해주세요 : "); String value =
	 * sc.nextLine(); new SearchCriteria(condition, value);
	 * 
	 * Map<String, String> managerSearch = new HashMap<>();
	 * managerSearch.put("criteria", value); return managerSearch; }
	 */

	private Map<String, String> inputName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("유튜버 계정 이름을 입력해주세요 : ");
		
		Map<String,String> parameter = new HashMap<>();
		parameter.put("name", sc.nextLine());
		return parameter;
	}

}
