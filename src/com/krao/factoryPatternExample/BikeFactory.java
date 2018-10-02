package com.krao.factoryPatternExample;

public class BikeFactory extends TransportFactory{
	Transport create() {
		return new Bike();
	}
}
