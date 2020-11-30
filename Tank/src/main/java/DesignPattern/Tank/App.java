package DesignPattern.Tank;

import AbstractFactory.Button;
import AbstractFactory.GUIFac;
import AbstractFactory.LinuxGUIFac;
import AbstractFactory.TextArea;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        	
    	GUIFac fac = new LinuxGUIFac();
    	Button button = fac.createButton();
    	TextArea textArea = fac.createTextArea();
    	
    	button.click();
    	System.out.println(textArea.getText());
    }
}
