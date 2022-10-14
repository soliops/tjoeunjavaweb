package com.opete95.item.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.opete95.item.domain.ItemDTO;

@Repository
public interface ItemMapper {
	
	@Select("select * from item")
	public List<ItemDTO> allItem();
	
	@Select("select * from item where itemid=#{itemid}")
	public ItemDTO getItem(Integer itemid);
	
}
