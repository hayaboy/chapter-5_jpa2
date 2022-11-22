package com.himedia.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;





@Entity 
public class Board {
	
	@Id
	@GeneratedValue
	private Long seq;
	private String title;
	//private String writer;
	private String content;
	@Temporal(TemporalType.TIMESTAMP) 
	private Date createDate;  //만약 변수명이 createdate이면 칼럼명은 CREATEDATE임
	private Long cnt;
	
	
	
	
	@ManyToOne  // optional 연관된 엔티티가 반드시 있어야 하는지의 여부 결정(false가 항상 있어야 함), fetch : EAGER는 연관 엔티티를 동시 조회, LAZY는 연관 엔티티를 실제 사용할 때 조회, cascade : 영속성 전이 기능 설정  
	@JoinColumn(name = "MEMBER_ID", nullable = false)  // 외래 키 칼럼 매핑   //nullable = false 내부 조인(inner join)
	private Member member;
	
	
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
//	public String getWriter() {
//		return writer;
//	}
//	public void setWriter(String writer) {
//		this.writer = writer;
//	}
	
	
	
	
	public String getContent() {
		return content;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Long getCnt() {
		return cnt;
	}
	public void setCnt(Long cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
	
		return seq + title + member + content +createDate +cnt ;
	}
	

}
