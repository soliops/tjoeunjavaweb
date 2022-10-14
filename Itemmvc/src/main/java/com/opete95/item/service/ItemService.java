package com.opete95.item.service;

import java.util.List;

import com.opete95.item.domain.ItemDTO;

public interface ItemService {
	//테이블의 전체 데이터를 가져오는 메서드
	public List<ItemDTO> allItem();
	//상세보기 처리를 위한 메서드
	public ItemDTO getItem(Integer itemid);
	
}
