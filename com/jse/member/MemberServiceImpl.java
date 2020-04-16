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
		Member[] returnName = new Member[5];
		return returnName;
	}

	@Override
	public Member[] searchByGender(String gender) {
		Member[] returnGender = new Member[5];
		return returnGender;
	}

	@Override
	public Member detail(String userid) {
		Member returnUserId = new Member();
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
		Member returnLogin = new Member();
		return returnLogin;
	}

	@Override
	public void update(Member member) {
	}

	@Override
	public void delete(Member member) {
	}
}