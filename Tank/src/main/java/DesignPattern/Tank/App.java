package DesignPattern.Tank;

import AbstractFactory.Button;
import AbstractFactory.GUIFac;
import AbstractFactory.LinuxGUIFac;
import AbstractFactory.TextArea;
import Bridge.DefaultMCF;
import Bridge.PrintMorseCode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PrintMorseCode printMorse = new PrintMorseCode(new DefaultMCF());
    	printMorse.g().a().r().a().m();
   
    }
}
