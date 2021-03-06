package com.jse.phone;

import lombok.Data;

@Data
public class Phone {
	private String phoneNumber,name,company;

	public Phone(String phoneNumber, String name, String company) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Phone  : phoneNumber=" + phoneNumber + ", name=" + name + ", company=" + company;
	}
}
	
class CellPhone extends Phone{
	private boolean portable;
	private String move;
	
	public CellPhone(String phoneNumber,String name,String company,boolean portable) {
		super(phoneNumber,name,company);
		setPortable(portable);
		this.portable = portable;
	}
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
//		if(portable) {
//			this.move = "휴대가능";
//		}else {
//			this.move = "휴대불가능";
//			}
		this.move = (portable)?"휴대가능":"휴대불가능";
		
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	@Override
	public String toString() {
		return super.toString() + "move: "+move;
	}
}
	
class Iphone extends CellPhone {
	private String search;

	public Iphone(String phoneNumber, String name, String company, boolean portable, String search) {
		super(phoneNumber, name, company, portable);
		this.search = search;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return super.toString()+", search"+ search;
	}
}

class GallaxyNote extends Iphone{
	private String bigSize;
	public GallaxyNote(String phoneNumber, String name, String company, boolean portable, String search, String bigSize) {
		super(phoneNumber, name, company, portable, search);
		this.bigSize=bigSize;
	}
	public String getBigSize() {
		return bigSize;
	}
	public void setBigSize(String bigSize) {
		this.bigSize = bigSize;
	}

	@Override
	public String toString() {
		return super.toString()+", bigSize"+ bigSize;
	}
}
	
