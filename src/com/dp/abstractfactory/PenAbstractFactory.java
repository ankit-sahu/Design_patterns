package com.dp.abstractfactory;

public class PenAbstractFactory {
	
	public static PenFactory factory = null;
	
	public static PenFactory getFactory(String type) throws Exception{
		
		if(type.toLowerCase().equals("marker")){
			factory = new MarkerFactory();
		}
		if(type.toLowerCase().equals("ballpen")){
			factory = new BallPenFactory();
		}
		else{
			throw new Exception("We do not make " + type + " type of Pen.");
		}
		return factory;
	}
}
