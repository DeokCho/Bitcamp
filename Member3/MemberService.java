package Member3;

public interface MemberService {
	public Member[] list();
	public Member[] searchByName(String name);
	public Member detail(String userId);
	public void add(Member member);
	public int count(String name);
	public int count();
	public void update(Member member);
	public void delete(Member member);
}
