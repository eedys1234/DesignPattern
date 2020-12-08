package DesignPattern.Tank;

import java.util.Stack;

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
    	Stack<Memento> mementos = new Stack<Memento>();
    	
    	Originator originator = new Originator();

    	originator.setState("state 1");
    	mementos.push(originator.createMemento());
    	
    	originator.setState("state 2");
    	mementos.push(originator.createMemento());

    	originator.setState("state 3");
    	mementos.push(originator.createMemento());

    	originator.setState("state final");
    	mementos.push(originator.createMemento());

    	originator.restoreMemento(mementos.pop());
    	System.out.println(originator.getState());

    	originator.restoreMemento(mementos.pop());
    	System.out.println(originator.getState());
    	
    	originator.restoreMemento(mementos.pop());
    	System.out.println(originator.getState());
    	
    	originator.restoreMemento(mementos.pop());
    	System.out.println(originator.getState());

    }
}
