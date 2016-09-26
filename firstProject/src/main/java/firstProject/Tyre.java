package firstProject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tyre")
@Scope("singleton")
public class Tyre {
	
	private String name;
	
	public String getName() {
		return "muni";
	}
	
	public Tyre(){
		System.out.println("123");
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tyre [name=" + name + "]";
	}

}
