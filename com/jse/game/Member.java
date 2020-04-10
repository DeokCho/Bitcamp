package com.jse.game;

public class Member {
	private String id;  // 파란색 : 인스턴스 변수
	public Member() { 
	
	}					//	밤색 : 로컬 변수
	public void setId(String id) { 
		System.out.println("지역변수 들어옴: "+id);
		this.id = id;
		System.out.println("인스턴스 변수에 저장됨: "+this.id);
	} 
	public String getId() { //void는 리턴기능이 없음. 
		return this.id;  
		// 필드의 리턴 타입은 클래스의 타입과 일치해야함.
	}
	
}
