package member2;

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
			if (member.getId().equals(members[i].getId()) && member.getPw().equals(members[i].getPw())) {
				login = new Member();
				login = members[i];
				break;
			}
		}
		return login;
	}


	@Override
	public Member[] list() {
		return null;
	}
	@Override
	public Member detail(Member member) {
		return null;
	}

	@Override
	public int Count() {
		return 0;
	}


	@Override
	public void update(Member member) {
		
	}


	@Override
	public void delete(Member member) {
		
	}

	

}
