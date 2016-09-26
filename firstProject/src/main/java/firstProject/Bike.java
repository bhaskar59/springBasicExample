package firstProject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bike")
@Scope("singleton")
public class Bike implements Vehicle{

	public void drive() {
		System.out.println("I am riding the bike");
		
	}

}
