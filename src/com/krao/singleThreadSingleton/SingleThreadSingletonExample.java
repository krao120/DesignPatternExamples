package com.krao.singleThreadSingleton;

public class SingleThreadSingletonExample {
	public static void main(String[] args) {

		Preferences.getInstance().helloSingleton();

		MyPreferences.getInstance().helloSingleton();

	}
}
