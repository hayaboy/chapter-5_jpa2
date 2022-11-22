package com.himedia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.himedia.domain.Board;
import com.himedia.domain.QBoard;
import com.himedia.persistence.DynamicBoardRepository;
import com.querydsl.core.BooleanBuilder;

@SpringBootTest
public class DynamicQueryTest {
	
	@Autowired
	private DynamicBoardRepository boardRepo;
	

	@Test
	public void testDynamicQuery() {
		String searchCondition = "CONTENT";
		String searchKeyword = "내용 2";

		
		BooleanBuilder builder = new BooleanBuilder();
		
		QBoard qboard = QBoard.board;
		
		if(searchCondition.equals("TITLE")) {
			builder.and(qboard.title.like("%" + searchKeyword + "%"));
		}else if(searchCondition.equals("CONTENT")) {
			builder.and(qboard.content.like("%" + searchKeyword + "%"));
		}
		
		Pageable paging = PageRequest.of(0, 5);
		
		
		
		Page<Board> boardList = boardRepo.findAll(builder, paging);
		
		System.out.println("검색 결과");
		for (Board board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
