package com.java.factorydesignpatternex2;

public class MainProgram {
	
	public static void main(String[] args) {
		String topic="onePlus";
		
		AbstractFactorys obj=new MobileFactory();
		
		Mobile res=obj.getDetails(topic);
		
		System.out.println(res.getClass().getSimpleName());
		System.out.println(res.getClass());
        res.model();
        res.name();
        res.price();
	}

}


