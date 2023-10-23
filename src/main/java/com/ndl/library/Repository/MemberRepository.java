package com.ndl.library.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ndl.library.Model.Member;

public interface MemberRepository extends CrudRepository<Member, Integer>{
    
}
