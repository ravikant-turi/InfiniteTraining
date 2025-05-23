package com.java.factorydesignpatternex2;



public class MobileFactory  implements AbstractFactorys{

	@Override
	public Mobile getDetails(String topic) {
		if(topic.equals("samsung")) {
			return new Samsung();
		}
		else if(topic.equals("iphone")) {
			return new IPhone();
		}
		else if(topic.equals("onePlus")) {
			return new OnePlus();
		}
		return null;
	}
	
	
//	@Override
//	public Training getDetails(String topic) {
//		
//		if(topic.equals("java")) {
//			return new JavaTraining();
//		}
//		else if(topic.equals("donet")) {
//			return new DonetTrainig();
//		}
//		else if(topic.equals("react")) {
//			return new ReactTrainig();
//		}
//		return null;
//	}
}
