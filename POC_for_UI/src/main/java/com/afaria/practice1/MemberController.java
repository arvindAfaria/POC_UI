package com.afaria.practice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.afaria.practice1.entities.Member;
import com.afaria.practice1.services.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService service;

	@RequestMapping("/updateMember")
	public String showUpdate() {
		return "updateMemberStatus";
	}

	@RequestMapping("/updateMembers")
	public String updateMember(@ModelAttribute("member") Member member) {
		service.updateMember(member);
		return "updateMemberStatus";
	}
}
