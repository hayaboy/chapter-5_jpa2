package com.himedia;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.himedia.domain.Board;
import com.himedia.domain.Member;
import com.himedia.persistence.BoardRepository;
import com.himedia.persistence.MemberRepository;

@SpringBootTest
public class RelationMappingTest {
	
	
	@Autowired
	private BoardRepository boardRepo;
	
	@Autowired
	private MemberRepository memberRepo;


	
//	@Test
//	public void testManyToOneInsert(){
//		
//		Member member1 = new Member();
//		member1.setId("member1");
//		member1.setPassword("member111");
//		member1.setName("둘리");
//		member1.setRole("User");
//		memberRepo.save(member1);
//		
//		
//		Member member2 = new Member();
//		member2.setId("member2");
//		member2.setPassword("member222");
//		member2.setName("도우너");
//		member2.setRole("Admin");
//		memberRepo.save(member2);
//		
//		
//		for (int i = 1; i <= 3; i++) {
//			Board board = new Board();
//			board.setMember(member1);
//			board.setTitle("둘리가 등록한 게시글 " + i);
//			board.setContent("둘리가 등록한 게시글 내용 " + i);
//			board.setCreateDate(new Date());
//			board.setCnt(0L);
//			boardRepo.save(board);
//		}
//		
//		
//		for (int i = 1; i <= 3; i++) {
//			Board board = new Board();
//			board.setMember(member2);
//			board.setTitle("도우너가 등록한 게시글 " + i);
//			board.setContent("도우너가 등록한 게시글 내용 " + i);
//			board.setCreateDate(new Date());
//			board.setCnt(0L);
//			boardRepo.save(board);
//		}
//		
//		
//		
//	}
	
	
	
	
	@Test
	public void testManyToOneSelect() {
		
		Board board=boardRepo.findById(5L).get();
		System.out.println(board.toString());
		
		//@ManyToOne 어노테이션의 fetch 속성이 기본값이 EAGER, 조인이 실행되어 연관관계에 있는 회워정보까지 같이 조회됨
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
