package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CellPhone phone);
	public void add(GallaxyNote phone);
	public void add(Iphone phone);
	public GallaxyNote[] gallaxyNoteList();
	public Iphone[] iPhoneList();
	public Phone[] phoneList();
	public CellPhone[] cellPhoneList();
	public GallaxyNote detail(GallaxyNote phone);
	public Iphone detail(Iphone phone);
	public int count();
	public void update(Phone phone);
	public void delete(Phone phone);
	
	
	
}
