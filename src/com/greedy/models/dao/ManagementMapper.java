package com.greedy.models.dao;

import java.util.List;
import java.util.Map;

import com.greedy.models.dto.ManagerDTO;
import com.greedy.models.dto.YoutuberDTO;

public interface ManagementMapper {

	List<YoutuberDTO> selectAllList();

	YoutuberDTO selectByName(String name);

	int modifyYoutuber(YoutuberDTO ytb);

	int registYoutuber(YoutuberDTO ytb);

	int deleteYoutuber(int code);

	List<ManagerDTO> selectManagerList();

	

}
