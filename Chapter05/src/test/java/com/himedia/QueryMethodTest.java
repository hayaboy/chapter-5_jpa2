package com.himedia;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.himedia.domain.Board;
import com.himedia.persistence.BoardRepository;

@SpringBootTest
public class QueryMethodTest {
	
	@Autowired
	private BoardRepository boardRepo;

	
	
	@BeforeEach
	public void dataPrepare() {
		for (int i = 1; i <= 200; i++) {
			Board board = new Board();
			board.setTitle("테스트 제목 " + i);
//			board.setWriter("테스터");
			board.setContent("테스트 내용 " + i);			
			board.setCreateDate(new Date());	
			board.setCnt(0L);
			boardRepo.save(board);
		}
	}
	
	
//	@Test
//	public void testFindByTitle(){
//		List<Board> boardList=boardRepo.findByTitle("테스트 제목 10");
//		System.out.println("검색 결과");
//		for(Board board:boardList) {
//		System.out.println("---->" + board.toString());	
//		}
//	}
	
//	@Test
//	public void testByfindByContentContainingFindByTitle(){
//		List<Board> boardList=boardRepo.findByContentContaining("11");  
//		for(Board board:boardList) {
//		System.out.println(board.toString());	
//		}
//	}
	
//	@Test
//	public void findByTitleContainingOrContentContaining(){
//		List<Board> boardList=boardRepo.findByTitleContainingOrContentContaining("11", "17");
//		for(Board board:boardList) {
//		System.out.println(board.toString());	
//		}
//	}
	
	
//	@Test
//	public void findByTitleContainingOrderBySeqDesc(){
//		List<Board> boardList=boardRepo.findByTitleContainingOrderBySeqDesc("17");
//		for(Board board:boardList) {
//		System.out.println(board.toString());	
//		}
//	}
	
	
//	@Test
//	public void findByTitleContainingOrderBySeq(){
//		List<Board> boardList=boardRepo.findByTitleContainingOrderBySeq("17");
//		for(Board board:boardList) {
//		System.out.println(board.toString());	
//		}
//	}
	
	
	
//	@Test
//	public void findByTitleContaining(){
//		Pageable paging=PageRequest.of(1, 3);
//		
//		
//		List<Board> boardList=boardRepo.findByTitleContaining("제목",paging);
//		for(Board board:boardList) {
//		System.out.println(board.toString());	
//		}
//	}
	
	
	
//	@Test
//	public void testfindByTitleContaining(){
//		Pageable paging=PageRequest.of(0,5,Sort.Direction.DESC, "seq");
//		
//		
//		List<Board> boardList=boardRepo.findByTitleContaining("홍길동",paging);
//		for(Board board:boardList) {
//		System.out.println(board.toString());	
//		}
//	}
	
	
	
	
//	@Test
//	public void testfindByTitleContaining(){
//		Pageable paging=PageRequest.of(0,10,Sort.Direction.DESC, "seq");
//		
//		//400건
//		Page<Board> pageInfo=boardRepo.findByTitleContaining("테스트",paging);
//		
//		System.out.println(pageInfo.getSize());
//		System.out.println(pageInfo.getTotalPages());
//		System.out.println(pageInfo.getTotalElements());
//		System.out.println(pageInfo.nextPageable());
//	
//		List<Board> boardList =pageInfo.getContent();
//		
//		for(Board board:boardList) {
//		System.out.println(board.toString());	
//		}
//	}
	
	
	
	
	
	
	
	
	
}
