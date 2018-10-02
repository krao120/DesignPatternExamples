package com.krao.factoryPatternExample;

public class CarFactory extends TransportFactory{
	Transport create() {
		return new Car();
	}
}
