package com.dp.abstractfactory;

public class BallPen implements Pen{

	public final String brandName = "Reynolds";
	public String ink = "Green";
	public String expiryDate = "7th June 17";
	public BallPenBody body = null;
	public BallPenCap cap = null;
	
	@Override
	public void setInk(String ink) {
		this.ink = ink;;
		
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
//		this.cap = new BallPenCap();
//		return this.cap;
//	}
//
//	@Override
//	public Body getBody() {
//		this.body = new BallPenBody();
//		return this.body;
//	}

}
