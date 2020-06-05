package com.afaria.practice1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
	private int id;
	@Column(name = "MemberId")
	private int memberId;
	@Column(name = "MemberName")
	private String memberName;
	@Column(name = "Certified")
	private String certified;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getCertified() {
		return certified;
	}

	public void setCertified(String certified) {
		this.certified = certified;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", memberId=" + memberId + ", memberName=" + memberName + ", certified=" + certified
				+ "]";
	}
}
