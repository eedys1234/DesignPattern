package Mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Mediator {

	protected List<Colleage> colleages = new ArrayList<>();
	
	public boolean addColleage(Colleage colleage) {

		if(!Objects.isNull(colleage))
			return colleages.add(colleage);
		
		return false;
	}
	
	public abstract void mediate(String data);
	
}
