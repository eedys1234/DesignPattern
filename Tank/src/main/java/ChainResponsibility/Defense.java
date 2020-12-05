package ChainResponsibility;

import java.util.Objects;

public abstract class Defense {

	protected Defense nextDefense;
	
	public void setNextDefense(Defense defense) {
		this.nextDefense = defense;		
	}
	
	public void process(Attack attack) {
		operator(attack);
		if(!Objects.isNull(nextDefense))
			nextDefense.process(attack);
	}
	
	public abstract void operator(Attack attack);
	
}
