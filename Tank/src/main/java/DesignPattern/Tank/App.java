package DesignPattern.Tank;

import ChainResponsibility.Armor;
import ChainResponsibility.Attack;
import ChainResponsibility.Defense;
import ChainResponsibility.Pitching;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	Armor armor = new Armor();
    	armor.setDef(30);
    	Pitching pitching = new Pitching();
    	pitching.setDef(10);
    	
    	Attack attack = new Attack(100);
    	armor.setNextDefense(pitching);
    	
    	armor.process(attack);
    	
    	System.out.println("amount = " + attack.getAmount());
    }
}
