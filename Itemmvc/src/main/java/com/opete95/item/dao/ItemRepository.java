package com.opete95.item.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.opete95.item.domain.ItemDTO;

//클래스에 @Component를 설정하면 servlet-context.xml
//파일의 component-scan에 설정된 패키지에 속한 경우
//bean을 자동으로 생성합니다.
//@Repository, @Service, @Controller, @RestController
//를 기재하면 역할까지 부여합니다.
//@Repository
public class ItemRepository {
	
//	@Autowired
	private SqlSession sqlSession;

	//테이블의 전체 데이터를 가져오는 메서드
	public List<ItemDTO> allItem() {
		return sqlSession.selectList("item.allitem");
	}
	
	//하나의 데이터를 가져오는 메서드
	public ItemDTO getItem(Integer itemid){
		return sqlSession.selectOne("item.getitem",itemid);
	}
}
