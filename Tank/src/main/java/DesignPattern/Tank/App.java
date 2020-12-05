package DesignPattern.Tank;

import ChainResponsibility.Armor;
import ChainResponsibility.Attack;
import ChainResponsibility.Defense;
import ChainResponsibility.Pitching;
import Facade.Facade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	Facade facade = new Facade();
    	
    	facade.process();
	}
}
