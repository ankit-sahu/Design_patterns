package com.dp.factorymethod;

public class PenDetails {
	
	public static void main(String[] args){
		Pen pen = PenFactoryMethod.getPen("BallPen");
		
		System.out.println("Below listed are the details of the selected pen:");
		System.out.println("Brand Name : " + pen.getBrand());
		System.out.println("Body Type : " + pen.getBody().getBodyType());
		System.out.println("Cap Type : " + pen.getCap().getCapType());
		System.out.println("Expity date : " + pen.getExpiryDate());
		System.out.println("Ink color : " + pen.getink());
		System.out.println("Body Color : " + pen.getBody().getColor());
		System.out.println("Cap Color : " + pen.getCap().getColor());
		System.out.println("Body Thickness : " + pen.getBody().getThickness());
		System.out.println("Cap Thickness : " + pen.getCap().getThickness());
	}
}
