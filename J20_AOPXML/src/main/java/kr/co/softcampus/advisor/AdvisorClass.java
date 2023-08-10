package kr.co.softcampus.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

 public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	// 기존 메서드가 오류가 있던 없던 무조건 실행 후 호출
	public void afterMethod() {
		System.out.println("AfterMethod 호출");
	}

	public Object arroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("arroundMethod 호출1");
		
		// 원래의 메서드를 호출한다.
		Object obj = pjp.proceed();
		
		System.out.println("arroundMethod 호출2");
		
		return obj;
	}
	
	// 기존 메서드가 오류없이 실행됐을 떄 실행 후 호출
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	
	public void afterThrowingMethod(Throwable e1) {
		System.out.println("afterThrowingMethod 호출");
		System.out.println(e1);
	}
}
