package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public Phone[] list();
	public Phone detail(Phone phone);
	public int count();
	public void update(Phone phone);
	public void delete(Phone phone);
}
