package Mediator;

import java.util.Objects;

public abstract class Colleage {
	
	private Mediator mediator;
	
	public boolean join(Mediator mediator) {
		if(!Objects.isNull(mediator)) {
			this.mediator = mediator;			
			return this.mediator.addColleage(this);
		}
		return false;
	}
	
	public void SendDate(String data) {
		if(!Objects.isNull(mediator)) {
			this.mediator.mediate(data);
		}
	}
	
	abstract void handle(String data);
	
}
