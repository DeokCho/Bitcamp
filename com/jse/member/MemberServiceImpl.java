package com.jse.member;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}
	
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public Member[] list() {
		return members;
	}

	@Override
	public Member[] searchByName(String name) {
		Member[] returnName = null;
		for(int i=0; i<count; i++) {
			if(name.equals(members[i].getName())) {
				int j=0;
				returnName[j] = members[i];
				j++;
			}
		}
		return returnName;
	}

	@Override
	public Member[] searchByGender(String gender) {
		Member[] returnGender = new Member[5];
		return returnGender;
	}

	@Override
	public Member detail(String userid) {
		Member returnUserId = null;
		for(int i=0; i<count; i++) {
			if(userid.equals(members[i].getId())) {
				returnUserId = members[i];
			}
		}
		return returnUserId;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public int count(String name) {
		int returnCount = 0;
		return returnCount;
	}

	@Override
	public Member login(Member member) {
		Member returnLogin = null;
		for(int i=0; i<count; i++) {
			if(member.getId().equals(members[i].getId()) 
					&& member.getPw().equals(members[i].getPw())) {
				returnLogin = members[i];
				break;
			}
						
		}
		return returnLogin;
	}

	@Override
	public void update(Member member) {
	}

	@Override
	public void delete(Member member) {
	}
}