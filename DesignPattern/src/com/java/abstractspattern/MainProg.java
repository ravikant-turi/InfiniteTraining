package com.java.abstractspattern;

public class MainProg {
	
	public static void main(String[] args) {
		
		String topic="react";
		
		AbstractFactory obj=new TrainigFactoryDesignPattern();
		 
		Training result=obj.getDetails(topic);
		
		System.out.println(result.getClass().getSimpleName());
		
		System.out.println(result.getTarinigDetaisl());
	}

}
