package DesignPattern.Tank;

import java.util.Stack;

import Flyweight.Flyweight;
import Flyweight.FlyweightManager;
import Memento.Memento;
import Memento.Originator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	FlyweightManager flyweightManager = new FlyweightManager();
    	Flyweight flyweight = flyweightManager.getFlyweight("A");

    	System.out.println(flyweight.getData());

    	flyweight = flyweightManager.getFlyweight("B");
    	System.out.println(flyweight.getData());
    	flyweight = flyweightManager.getFlyweight("B");
    	System.out.println(flyweight.getData());

    }
}
