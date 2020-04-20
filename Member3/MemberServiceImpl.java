package Member3;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
	}
	@Override
	public Member[] list() {
		return members;
	}
	
	@Override
	public Member[] searchByName(String name) {
		Member[] returnName = null;
		int searchCount = count(name);
		for(int i=0; i<count; i++) {
			if(searchCount!=0) {
				int j=0;
				if(name.equals(members[i].getName())) {
					returnName[j] = members[i];
					if(searchCount==j) {
						break;
					}
				}
			}
		}
		return returnName;
	}

	@Override
	public int count(String name) {
		int returnCount = 0;
		for(int i=0; i<count; i++) {
			if(name.equals(members[i].getName())) {
				returnCount++;
			}
		}
		return returnCount;
	}
	
	@Override
	public Member detail(String userId) {
		Member returnDetail = null;
		for(int i=0; i<count; i++) {
			if(userId.equals(members[i].getUserId())) {
				returnDetail = members[i];
			}
		}
		return returnDetail;
	}

	@Override
	public void add(Member member) {
		members[count]=member;
		count++;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public void update(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserId().equals(members[i].getUserId()) && member.getUserPw().equals(members[i].getUserPw())) {
				members[i].setUserPw(member.getUserPw());
			}
		}
	}

	@Override
	public void delete(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserId().equals(members[i].getUserId()) && member.getUserPw().equals(members[i].getUserPw())) {
				members[i] = members[count-1];
				members[count-1]=null;
				count--;
			}
		}
	}

	

}
