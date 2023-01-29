package com.greedy.models.service;

import static com.greedy.common.YoutuberTemplate.getSqlSession;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.greedy.models.dao.ManagementMapper;
import com.greedy.models.dto.ManagerDTO;
import com.greedy.models.dto.YoutuberDTO;
import com.greedy.models.views.PrintResultView;

public class ManagementService {

	private ManagementMapper mapper;
	
	public List<YoutuberDTO> selectAllList() { // 전체 조회 기능
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ManagementMapper.class);
		
		List<YoutuberDTO> list = mapper.selectAllList();
		sqlSession.close();
		return list;
	}
	
	public YoutuberDTO selectByName(String name) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ManagementMapper.class);
		
		YoutuberDTO  ytbList = mapper.selectByName(name);
		sqlSession.close();
		return ytbList;
	}

	/*
	 * public void selectManagerList(Map<String, Object> manager) { SqlSession
	 * sqlSession = getSqlSession(); mapper =
	 * sqlSession.getMapper(ManagementMapper.class);
	 * 
	 * List<ManagerDTO> managerList = mapper.selectManagerList(manager);
	 * 
	 * if (managerList != null && !managerList.isEmpty()) { for (ManagerDTO menu :
	 * managerList) { PrintResultView.managerList(managerList); } } else {
	 * System.out.println("검색 결과가 존재하지 않습니다."); }
	 * 
	 * sqlSession.close();
	 * 
	 * }
	 */

	public ManagerDTO selectManagerList(String string) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ManagementMapper.class);
		PrintResultView printResultView = null;
		
		List<ManagerDTO> managerList = mapper.selectManagerList(managerCriteria);

		if (managerList != null && !managerList.isEmpty()) {
			for (ManagerDTO menu : managerList) {
				System.out.println(menu);
			}
		} else {
			new PrintResultView();
			printResultView.printErrorMessage("selectByName");
		}

		sqlSession.close();
	}



}