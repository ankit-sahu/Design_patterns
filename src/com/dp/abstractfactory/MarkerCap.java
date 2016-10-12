package com.dp.abstractfactory;

public class MarkerCap implements Cap{

	public String capType = "Marker";
	public int thickness = 2;
	public String color = "Black";
	
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
		// TODO Auto-generated method stub
		return this.thickness;
	}

	@Override
	public void setColor(String color) {
		this.color= color;
		
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

}
