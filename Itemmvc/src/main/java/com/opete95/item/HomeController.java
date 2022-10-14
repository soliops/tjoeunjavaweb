package com.opete95.item;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	//hello 라는 요청이 오면 hello라는 뷰 이름을 리턴
	//뷰는 servlet-context.xml 파일의
	//ViewResolver 의 내용을 참조해서 위치를 결정합니다.
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String home(Model model) {
			return "hello";
	}
	
}
