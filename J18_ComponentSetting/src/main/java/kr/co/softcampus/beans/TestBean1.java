package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

// IoC 컨네이너 객체를 생성할 떄 자동으로 객체가 생성된다.(java파일, context)
//타입을 통해 등록된 Bean 객체를 가져올 수 있다.
// Singleton
@Component
public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}

}
