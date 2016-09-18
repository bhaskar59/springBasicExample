package firstProject;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle{

	public void drive() {
		System.out.println("I am riding the bike");
		
	}

}
