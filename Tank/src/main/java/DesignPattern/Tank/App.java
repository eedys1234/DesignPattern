package DesignPattern.Tank;

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
