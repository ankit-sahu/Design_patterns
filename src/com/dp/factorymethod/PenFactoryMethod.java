package com.dp.factorymethod;

public class PenFactoryMethod {
	
	public static Pen pen = null;
	
	public static Pen getPen(String type){
		
		if(type.toLowerCase().equals("marker")){
			pen = new Marker();
		}
		if(type.toLowerCase().equals("ballpen")){
			pen = new BallPen();
		}
		return pen;
	}

}
