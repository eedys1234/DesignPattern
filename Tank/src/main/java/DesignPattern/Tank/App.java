package DesignPattern.Tank;

import DesignPattern.Tank.Prototype.Circle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Circle ori = new Circle(1, 1, 3);
        try {
			Circle copy = ori.copy();
			System.out.println(ori.getX() + ", " + ori.getY() + ", " + ori.getR());
			System.out.println(copy.getX() + ", " + copy.getY() + ", " + copy.getR());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
