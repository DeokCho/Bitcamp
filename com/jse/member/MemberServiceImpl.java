package com.jse.member;

import javax.swing.JOptionPane;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
	}

	@Override
	public void setMembers(Member[] members) {
		this.members = members;
	}

	@Override
	public Member[] getMemebers() {
		return members;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public boolean login(Member member) {
		boolean ok = false;
		for (int i = 0; i < members.length; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				ok = true;
			}
		}
		return ok;
	}
}