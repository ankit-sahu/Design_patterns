package com.dp.abstractfactory;

public class Marker implements Pen{


	public final String brandName = "Reynolds";
	public String ink = "Red";
	public String expiryDate = "17th Sep 17";;
	public MarkerBody body = null;
	public MarkerCap cap = null;
	
	@Override
	public void setInk(String ink) {
		this.ink = ink;	
	}

	@Override
	public String getink() {
		return this.ink;
	}

	@Override
	public String getBrand() {
		return this.brandName;	
	}

	@Override
	public void setExpiryDate(String date) {
		this.expiryDate = date;	
	}

	@Override
	public String getExpiryDate() {
		return this.expiryDate;
	}
	
//	@Override
//	public Cap getCap() {
//		this.cap = new MarkerCap();
//		return this.cap;
//	}
//
//	@Override
//	public Body getBody() {
//		this.body = new MarkerBody();
//		return this.body;
//	}
	
}
