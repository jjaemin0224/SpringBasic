package kr.co.softcampus.beans;

public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}
	
	// 객체 생성 시 자동 호출
	public void bean1_init() {
		System.out.println("TestBean1의 init 메서드");
	}
	
	// 객체 소멸 시 자동 호출
	public void bean1_destroy() {
		System.out.println("TestBean1의 destory 메서드");
	}
}
