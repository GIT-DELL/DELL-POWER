package com.jdc.ee.jsf.repo;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.jdc.ee.jsf.entity.Member;
import com.jdc.ee.jsf.entity.Member.Interest;

@SuppressWarnings("serial")
@Named
@FlowScoped(value = "registration")
public class MemberRegisteration implements Serializable {
	
	private Member member;
	
	@Named
	@Produces
	private Interest[] interests;
	
	@Inject
	private MemberRepo repo;
	
	/*@Inject
	private Conversation conversation;*/
	
	@PostConstruct
	private void init() {
		member = new Member();
		interests = Interest.values();
		/*if(conversation.isTransient()) {
			conversation.begin();
		}*/
	}

	public String save() {
		repo.addMember(member);
		
		/*if(!conversation.isTransient()) {
			conversation.end();
		}*/
		return "/index.xhtml";
	}
	
	public String cancel() {
		/*if(!conversation.isTransient()) {
			conversation.end();
		}*/
		return "/index.xhtml?faces-redirect=true";
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
}
