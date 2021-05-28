package nanix.spring.beans;

public class HelloSpring5Bean01 {
	
	// 두번째 사례
	// sayHello메서드를 외부 클래스로 옮기고
    // 인삿말을 출력하는 기능을 구현했음
    // 즉, 인삿말을 출력하려면 외부 클래스를
    // 객체화한 뒤 sayHello 메서드를 호출해야 함

	
	public void sayHello(String msg) {
		System.out.println("안녕안녕, " + msg );
	}

}



