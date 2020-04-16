package member2;

import javax.swing.JOptionPane;

public class MemberServiceImpl implements MemberService {
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
	public Member login(Member member) {
		Member login = null;
		for (int i = 0; i < members.length; i++) {
			if (member.getUserId().equals(members[i].getUserId())
					&& member.getPassword().equals(members[i].getPassword())) {
				login = new Member();
				login = members[i];
				break;
			}
		}
		return login;
	}

	@Override
	public Member[] list() {

		return members;
	}

	@Override
	public Member detail(String userid) {
		Member detail = null;
		for (int i = 0; i < members.length; i++) {
			if (userid.equals(members[i].getUserId())) {
				detail = new Member();
				detail = members[i];
				break;
			}
		}
		return detail;
	}

	@Override
	public int Count() {
		return 0;
	}

	@Override
	public int count(String name) {
		int returnvalue = 0;
		for (int i = 0; i < members.length; i++) {
			if (name.equals(members[i].getName())) {
				returnvalue++;
			}
		}
		return returnvalue;
	}

	@Override
	public void update(Member member) {
		for (int i = 0; i < members.length; i++) {
			if (member.getUserId().equals(members[i].getUserId())) {
				members[i].setPassword(member.getPassword());
				break;
			}
		}
	}

	@Override
	public void delete(Member member) {
		for (int i = 0; i < members.length; i++) {
			if (member.getUserId().equals(members[i].getUserId())) {

			}
		}
	}

	@Override
	public Member[] searchByName(String name) {
		return null;
	}

	@Override
	public Member name(String name) {
		Member names = new Member();
		return names;
	}

//	@Override
//	public Member[] searchByName(String name) {
//		Member[] returnMembers = null;
//		int searchCount = count(name);
//		if (searchCount != 0) {
//			returnMembers = new Member[searchCount];
//			int j = 0;
//			for (int i = 0; i < members.length; i++) {
//				if (name.equals(members[i].getName())) {
//					returnMembers[j] = members[i];
//					j++;
//					if (searchCount == j) {
//						break;
//					}
//				}
//			}
//			return returnMembers;
//		}
//	}
}
