package com.dp.singelton;

public class PenDetails {
	
	public static void main(String[] args){
		Pen pen = PenSingleTon.INSTANCE.getPen("BallPen");
		
		System.out.println("Below listed are the details of the selected pen:");
		System.out.println("Brand Name : " + pen.getBrand());
		System.out.println("Body Type : " + pen.getBody().getBodyType());
		System.out.println("Cap Type : " + pen.getCap().getCapType());
		System.out.println("Expity date : " + pen.getExpiryDate());
		System.out.println("Ink color : " + pen.getink());
		
		Pen pen2 = PenSingleTon.INSTANCE.getPen("Marker");
		System.out.println("Below listed are the details of the selected pen:");
		System.out.println("Brand Name : " + pen2.getBrand());
		System.out.println("Body Type : " + pen2.getBody().getBodyType());
		System.out.println("Cap Type : " + pen2.getCap().getCapType());
		System.out.println("Expity date : " + pen2.getExpiryDate());
		System.out.println("Ink color : " + pen2.getink());
		
//		Pen pen1 = PenSingleTon.INSTANCE.getPen("Marker");
//		
//		System.out.println("Body Color : " + pen1.getBody().getColor());
//		System.out.println("Cap Color : " + pen1.getCap().getColor());
//		System.out.println("Body Thickness : " + pen1.getBody().getThickness());
//		System.out.println("Cap Thickness : " + pen1.getCap().getThickness());
	}
}
