package firstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnotationDependencyInjection {

	public static void main(String[] args) {
		
		ApplicationContext cxt= new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Car c=cxt.getBean(Car.class);
		System.out.println(c.hashCode());
		c.getTyre().setName("Mrf");
		c.drive();
		Car c1=cxt.getBean(Car.class);
		System.out.println(c1.hashCode());
		c1.drive();
	}

}
