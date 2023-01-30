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

	public ManagerDTO selectManagerList(String parameter) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ManagementMapper.class);
		
		ManagerDTO manager = (ManagerDTO) mapper.selectManagerList(parameter);
		sqlSession.close();
		return manager;
	}

	public boolean modifyYoutuber(YoutuberDTO ytb) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ManagementMapper.class);
		
		int result = mapper.modifyYoutuber(ytb);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();

		return result > 0 ? true : false ;
	}

	public boolean registYoutuber(YoutuberDTO ytb) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ManagementMapper.class);
		
		int result = mapper.registYoutuber(ytb);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();

		return result > 0 ? true : false ;
	}



}