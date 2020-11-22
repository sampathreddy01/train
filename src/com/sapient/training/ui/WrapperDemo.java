package com.sapient.training.ui;

public class WrapperDemo {

	public static void main(String[] args) {
		Integer x=null;
		int y=x;
		System.out.println(y);
		
		Double r1=new Double(3.5);
		//auto-boxing
		Double r2=3.5;
		//auto-unboxing
		double r3=r2;
		//same as
		double r4= Double.valueOf(r2);
		
		String s1="3.14";
		double r5= Double.parseDouble(s1);
		
	}

}
