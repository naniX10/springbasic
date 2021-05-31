package nanix.spring.annotation;

import org.springframework.stereotype.Component;

import nanix.spring.beans.HelloSpring5Bean03;

@Component("ger")
public class HelloSpring5Bean07Ger implements HelloSpring5Bean03 {

	@Override
	public void sayHello(String msg) {
		System.out.println("guten Tag! " + msg);
	}
		
	
}
