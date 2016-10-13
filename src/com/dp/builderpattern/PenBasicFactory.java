package com.dp.builderpattern;

public class PenBasicFactory {
	
	public static Marker getMarkerPen(){
		return new Marker.MarkerBuilder("Lotto", "Yellow").setExpiryDate("yesterday").build();
	}
	
	public static BallPen getBallPen(){
		return new BallPen();
	}

}
