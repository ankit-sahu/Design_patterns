package com.dp.factorymethod;

public class PenBasicFactory {
	
	public static Marker getMarkerPen(){
		return new Marker();
	}
	
	public static BallPen getBallPen(){
		return new BallPen();
	}

}
