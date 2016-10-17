package com.dp.singelton;

public enum PenSingleTon {
	INSTANCE;
	
	public Pen pen = null;
	

	
	public Pen getPen(String type){
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
