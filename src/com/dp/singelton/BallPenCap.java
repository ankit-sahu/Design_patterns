package com.dp.singelton;

public class BallPenCap implements Cap{
	
	public String capType = "BallPen";
	public int thickness = 1;
	public String color = "Blue";
	
	@Override
	public void setCapType(String type) {
		this.capType = type;
	}

	@Override
	public String getCapType() {
		return this.capType;
	}

	@Override
	public void setThickness(int thickness) {
		this.thickness = thickness;
		
	}

	@Override
	public int getThickness() {
		return this.thickness;
	}

	@Override
	public void setColor(String color) {
		this.color= color;
		
	}

	@Override
	public String getColor() {
		return this.color;
	}

}
