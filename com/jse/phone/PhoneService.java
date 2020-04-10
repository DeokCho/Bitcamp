package com.jse.phone;

public class PhoneService {
	private Phone[] phones;
	private CellPhone[] cellPhones;
	private Iphone[] iphones;
	private GallaxyNote[] gallaxyNotes;
	private int count;
	
	public PhoneService() {
		phones = new Phone[3];
		cellPhones = new CellPhone[3];
		iphones = new Iphone[3];
		gallaxyNotes = new GallaxyNote[3];
		count = 0;
	}
	
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	public void add(CellPhone phone) {
		cellPhones[count] = phone;
		count++;
	}
	public void add(Iphone phone) {
		iphones[count] = phone;
		count++;
	}
	public void add(GallaxyNote phone) {
		gallaxyNotes[count] =  phone;
		count++;
	}
	
	public void setPhone(Phone[] phones) {
		this.phones = phones;
	}
	
	public Phone[] getPhone() {
		return phones;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public CellPhone[] getCellPhones() {
		return cellPhones;
	}

	public void setCellPhones(CellPhone[] cellPhones) {
		this.cellPhones = cellPhones;
	}

	public Iphone[] getIphones() {
		return iphones;
	}

	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}

	public GallaxyNote[] getGallaxyNote() {
		return gallaxyNotes;
	}

	public void setGallaxyNote(GallaxyNote[] gallaxyNotes) {
		this.gallaxyNotes = gallaxyNotes;
	}

	
	
	
}
