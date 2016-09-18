package firstProject;

import org.springframework.stereotype.Component;

@Component("tyre")
public class Tyre {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tyre [name=" + name + "]";
	}

}
