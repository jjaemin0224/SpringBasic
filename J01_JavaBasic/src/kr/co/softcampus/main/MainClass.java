package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorldEn;

public class MainClass {

	public static void main(String[] args) {
		HelloWorldEn hello1 = new HelloWorldEn();
		callMethod(hello1);
		
		HelloWorldEn hello2 = new HelloWorldEn();
		callMethod(hello2);

	}
	
	public static void callMethod(HelloWorldEn hello) {
		hello.sayHello();
	}

}
