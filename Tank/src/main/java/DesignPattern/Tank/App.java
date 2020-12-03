package DesignPattern.Tank;

import java.util.ArrayList;
import java.util.List;

import Visitor.Visitable;
import Visitor.VisitableA;
import Visitor.Visitor;
import Visitor.VisitorA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	List<Visitable> list = new ArrayList<Visitable>();
    		
    	list.add(new VisitableA(1));
    	list.add(new VisitableA(2));
    	list.add(new VisitableA(3));
    	list.add(new VisitableA(4));
    	list.add(new VisitableA(5));

    	Visitor visitor = new VisitorA();
    	list.stream().forEach((visitable)->{
    		visitable.accept(visitor);
    	});
    	
    	System.out.println(((VisitorA)visitor).getNum());
    }
}
