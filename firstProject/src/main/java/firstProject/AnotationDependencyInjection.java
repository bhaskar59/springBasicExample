package firstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnotationDependencyInjection {

	public static void main(String[] args) {
		
		ApplicationContext cxt= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car c=cxt.getBean(Car.class);
		c.drive();
	}

}
