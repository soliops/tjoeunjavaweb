package com.opete95.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opete95.item.dao.ItemMapper;
import com.opete95.item.dao.ItemRepository;
import com.opete95.item.domain.ItemDTO;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
//	private ItemRepository itemRepository;
	private ItemMapper itemRepository;
	@Override
	public List<ItemDTO> allItem() {
		return itemRepository.allItem();
	}

	@Override
	public ItemDTO getItem(Integer itemid) {
		return itemRepository.getItem(itemid);
	}
	
	
	
}
