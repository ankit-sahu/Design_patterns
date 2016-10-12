package com.dp.abstractfactory;

public class PenDetails {
	
	public static void main(String[] args) throws Exception{
		try{
		PenFactory factory = PenAbstractFactory.getFactory("ballpenwer");
		Cap cap = factory.createCap();
		Body body = factory.createBody();
		Pen pen = factory.createPen();
		
		System.out.println("Below listed are the details of the selected pen:");
		System.out.println("Brand Name : " + pen.getBrand());
		System.out.println("Expity date : " + pen.getExpiryDate());
		System.out.println("Ink color : " + pen.getink());
		System.out.println("Body Type : " + body.getBodyType());
		System.out.println("Cap Type : " + cap.getCapType());
		System.out.println("Body Color : " + body.getColor());
		System.out.println("Cap Color : " + cap.getColor());
		System.out.println("Body Thickness : " + body.getThickness());
		System.out.println("Cap Thickness : " + cap.getThickness());
	}
		catch(Exception e){
			System.err.println("As it says :");
			e.printStackTrace();
		}
	}
}
