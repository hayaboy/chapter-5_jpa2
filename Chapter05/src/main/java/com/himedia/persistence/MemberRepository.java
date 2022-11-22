package com.himedia.persistence;

import org.springframework.data.repository.CrudRepository;

import com.himedia.domain.Member;


//MemberRepository interface    
public interface MemberRepository extends CrudRepository<Member, String> {

}
