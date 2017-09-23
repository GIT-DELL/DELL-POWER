package com.jdc.ee.jsf.repo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.jdc.ee.jsf.entity.Member;

@SuppressWarnings("serial")
@ApplicationScoped
@Named
public class MemberRepo implements Serializable {
	
	private List<Member> members;
	
	@PostConstruct
	private void init() {
		members = new ArrayList<>();
	}
	
	public List<Member> getAll() {
		return members;
	}
	
	public void addMember(Member m) {
		members.add(m);
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

}
