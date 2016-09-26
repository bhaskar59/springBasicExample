package firstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjection {

	public static void main(String[] args) {
		ApplicationContext cxt= new ClassPathXmlApplicationContext("Spring.xml");
		Car car =(Car) cxt.getBean("car");
		car.drive();
		
//		Bike bike =(Bike) cxt.getBean("bike");
//		bike.drive();
//		
//		Tyre tyre1 =(Tyre) cxt.getBean("tyre");
//		System.out.println(tyre1);
		//Car c=new Car();
	    //c.drive();
 
	}

}
