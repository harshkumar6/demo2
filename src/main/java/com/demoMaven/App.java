package com.demoMaven;

public class App {

	public String test() {
		return "hello";
	}
	
	
	public static void main(String[] args) {
		App1 app = new App1();
		System.out.println(app.test());
	}
}
