package com.opete95.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.opete95.item.domain.ItemDTO;
import com.opete95.item.service.ItemService;

@Controller
public class ItemViewController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="allitem",method=RequestMethod.GET)
	public String allItem(Model model) {
		//필요한 서비스 메서드 호출
		List<ItemDTO> list = itemService.allItem();
//		System.out.println(list);
		
		//뷰에 데이터를 전달
		model.addAttribute("list",list);
		
		//뷰이름 - ViewResolver와 합쳐져서 실제 뷰가 결정
		return "item/itemlist";
		
	}
	//파라미터 형태로 넘어오는 상세보기 요청 처리
	@RequestMapping(value="getitem/{itemid}",method=RequestMethod.GET)
	public String getItem(Model model,
			@PathVariable("itemid") Integer itemid) {
		ItemDTO oneitem = itemService.getItem(itemid);
		model.addAttribute("oneitem",oneitem);
		return "item/getitem";
	}
}
