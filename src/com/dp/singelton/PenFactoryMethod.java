package com.dp.singelton;

public class PenFactoryMethod {
	
	public static Pen pen = null;
	
	private PenFactoryMethod(){
		
	}
	
	public static Pen getPen(String type){
		if(pen == null){
			if(type.toLowerCase().equals("marker")){
				pen = new Marker();
			}
			if(type.toLowerCase().equals("ballpen")){
				pen = new BallPen();
			}
		}
		System.out.println(pen.toString());
		return pen;
	}
}
