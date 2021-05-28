package nanix.spring.basic;

import nanix.spring.beans.HelloSpring5Bean01;

public class HelloSpring5App01 {

	// 첫번째 사례
    // 간단한 인삿말을 출력하는 프로그램 작성
    // 메세지를 출력하는 sayHello메서드를 만들어 그것을 호출

	// 인삿말을 출력하는 메서드가 현재 클래스안에 있기 때문에
    // 프로그램 확장성 측면에서 봤을때 제약이 존재

	// 즉, 유지보수의 어려움이 발생
    // 또한, 개발자가 여러명인 경우 업무분담의 어려움도 존재
    // 해결 : 인삿말 출력 기능을 담당하는 클래스를 따로 작성
	
	// 여기서 보듯, HelloSpring5App01을 실행하려면
    // 반드시 HelloSpring5Bean01이라는 클래스가 필수임
    // 즉, 클래스간의 의존성이 커짐
	
	// 의존성이 커짐으로 인해 발생하는 부수적인 단점은
    // 코드변경시 그것과 연관되는 다른 클래스에 영향을 미침
    // 따라서, 유지보수의 범위가 넓어짐

	// 해결 : 인터페이스를 도입해서 객체간의 의존성을 낮춰줌

	public static void main(String[] args) {
		HelloSpring5Bean01 bean = new HelloSpring5Bean01();
		
		bean.sayHello("스프링 555!!");
		bean.sayHello("Spring 555!!");
		bean.sayHello("スプリング 555!!");
		bean.sayHello("Frühling 555!!");
		bean.sayHello("बहार ह  555!!");
		
	} // main
	
	/*private void sayHello(String msg) {
		System.out.println("안녕안녕, " + msg );
	}*/

} // class
