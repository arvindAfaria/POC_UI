package com.afaria.practice1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afaria.practice1.entities.Member;
import com.afaria.practice1.repos.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository repo;

	public MemberRepository getMember() {
		return repo;
	}

	public void setMember(MemberRepository member) {
		this.repo = member;
	}

	@Override
	public Member saveMember(Member member) {
		return repo.save(member);
	}

	@Override
	public Member updateMember(Member member) {
		return repo.save(member);
	}

	@Override
	public void deleteMember(Member member) {
		repo.delete(member);
	}

	@Override
	public Optional<Member> getMemberById(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Member> getAllmembers() {
		// TODO Auto-generated method stub
		return null;
	}

}
