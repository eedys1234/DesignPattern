package DesignPattern.Tank;

import DesignPattern.Tank.FactoryMethod.HpCreator;
import DesignPattern.Tank.FactoryMethod.Item;
import DesignPattern.Tank.FactoryMethod.ItemCreator;
import DesignPattern.Tank.FactoryMethod.MpCreator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ItemCreator creator = new HpCreator();
        Item item = creator.create();
        item.use();
        
        creator = new MpCreator();
        item = creator.create();
        item.use();
        
    }
}
