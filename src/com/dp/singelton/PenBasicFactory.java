package com.dp.singelton;

public class PenBasicFactory {
	
	public static Marker getMarkerPen(){
		return new Marker();
	}
	
	public static BallPen getBallPen(){
		return new BallPen();
	}

}
