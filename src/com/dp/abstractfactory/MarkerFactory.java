package com.dp.abstractfactory;

public class MarkerFactory implements PenFactory{

	@Override
	public Cap createCap() {
		return new MarkerCap();
	}

	@Override
	public Body createBody() {
		return new MarkerBody();
	}
	
	@Override
	public Pen createPen() {
		return new Marker();
	}

}
