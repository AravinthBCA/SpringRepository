package SetClass;

import java.util.List;
import java.util.Set;

public class Car {
	private String name;
	
	private Set<String> models;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getModels() {
		return models;
	}

	public void setModels(Set<String> models) {
		this.models = models;
	}

}
