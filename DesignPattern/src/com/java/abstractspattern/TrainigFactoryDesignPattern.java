package com.java.abstractspattern;

public class TrainigFactoryDesignPattern extends AbstractFactory {

	@Override
	public Training getDetails(String topic) {
		
		if(topic.equals("java")) {
			return new JavaTraining();
		}
		else if(topic.equals("donet")) {
			return new DonetTrainig();
		}
		else if(topic.equals("react")) {
			return new ReactTrainig();
		}
		return null;
	}

	
	
	
}
