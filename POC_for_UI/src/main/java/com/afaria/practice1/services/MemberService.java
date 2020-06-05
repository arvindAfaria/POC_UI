package com.afaria.practice1.services;

import java.util.List;
import java.util.Optional;

import com.afaria.practice1.entities.Member;

public interface MemberService {

	Member saveMember(Member member);

	Member updateMember(Member member);

	void deleteMember(Member member);

	Optional<Member> getMemberById(int id);

	List<Member> getAllmembers();
}
