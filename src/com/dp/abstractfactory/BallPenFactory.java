package com.dp.abstractfactory;

public class BallPenFactory implements PenFactory{

	@Override
	public Cap createCap() {
		return new BallPenCap();
	}
	
	@Override
	public Body createBody() {
		return new BallPenBody();
	}
	
	@Override
	public Pen createPen() {
		return new BallPen();
	}
}
