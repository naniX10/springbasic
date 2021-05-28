package nanix.spring.beans;

public class HelloSpring5Bean03Ger implements HelloSpring5Bean03 {

	@Override
	public void sayHello(String msg) {
		System.out.println("guten Tag! " + msg);
	}
		
	
}
