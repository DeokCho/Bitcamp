package member2;

public interface MemberService {
	
	
	public void add(Member member);
	public Member[] list();
	public Member[] searchByName(String name);
	public Member[] searchByGender(String Gender);
	public Member detail(String userid);
	public Member name(String name);
	public int Count();
	public int count(String name);

	public Member login(Member member);
	public void update(Member member);
	public void delete(Member member);
	
}
