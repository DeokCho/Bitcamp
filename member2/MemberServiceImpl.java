package member2;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}

	@Override
	public void setMember(Member[] members) {
		this.members = members;
	}

	@Override
	public Member[] getMember() {
		return members;
	}

	@Override
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int getCount() {
		return count;
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
			if (member.getId().equals(members[i].getId()) && member.getPw().equals(members[i].getPw())) {
				login = new Member();
				login = members[i];
				break;
			}
		}return login;
	}
}
