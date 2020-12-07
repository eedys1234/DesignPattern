package Mediator;

public class ConcreteMediator extends Mediator {

	@Override
	public void mediate(String data) {
		
		for(Colleage colleage : colleages) {
			colleage.handle(data);
		}
		
	}

}
