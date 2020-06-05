package com.afaria.practice1.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afaria.practice1.entities.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
