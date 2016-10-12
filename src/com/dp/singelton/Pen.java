package com.dp.singelton;

public interface Pen {
	
	public void setInk(String ink);
	public String getink();
	public String getBrand();
	public void setExpiryDate(String date);
	public String getExpiryDate();
	public Cap getCap();
	public Body getBody();

}
