package DesignPattern.Tank;

import ChainResponsibility.Armor;
import ChainResponsibility.Attack;
import ChainResponsibility.Defense;
import ChainResponsibility.Pitching;
import Facade.Facade;
import Mediator.Colleage;
import Mediator.ConcreteColleage;
import Mediator.ConcreteMediator;
import Mediator.Mediator;
import Observer.Button;
import Observer.Button.OnClickListener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	Mediator mediator = new ConcreteMediator();
    	
    	Colleage c1 = new ConcreteColleage();
    	Colleage c2 = new ConcreteColleage();
    	Colleage c3 = new ConcreteColleage();
    	
    	c1.join(mediator);
    	c2.join(mediator);
    	c3.join(mediator);
    	
    	
    	c1.SendDate("AAA");
    	c2.SendDate("BBB");
    	c3.SendDate("CCC");
	}
}
