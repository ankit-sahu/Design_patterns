package com.dp.builderpattern;

public class BallPenBody implements Body{
	
	public String bodyType = "BallPen";
	public int thickness = 1;
	public String color = "Blue";
	
	@Override
	public void setBodyType(String type) {
		this.bodyType = type;
		
	}

	@Override
	public String getBodyType() {
		return this.bodyType;
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
		this.color = color;
		
	}

	@Override
	public String getColor() {
		
		return this.color;
	}

}
