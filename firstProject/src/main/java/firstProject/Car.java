package firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("car")
@Scope("singleton")
public class Car implements Vehicle{
	

	
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive(){
		Tyre t = new Tyre();
		System.out.println("i am driving a car"+t.getName());
	}

}
