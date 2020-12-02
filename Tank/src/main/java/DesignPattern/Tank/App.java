package DesignPattern.Tank;

import Composit.Component;
import Composit.CustomerFile;
import Composit.CustomerFolder;
import SingleTon.SingleTon;
import SingleTon.SingleTonTest;
import SingleTon.SingleTonTest2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	CustomerFolder root = new CustomerFolder("root");
    	CustomerFolder home = new CustomerFolder("home");
    	CustomerFolder usr = new CustomerFolder("usr");
    	CustomerFolder lee = new CustomerFolder("lee");
    	CustomerFolder music = new CustomerFolder("music");
    	CustomerFolder picture = new CustomerFolder("picture");
    	CustomerFolder doc = new CustomerFolder("doc");
    	
    	CustomerFile java = new CustomerFile("java");
    	CustomerFile track1 = new CustomerFile("track1");
    	CustomerFile track2 = new CustomerFile("track2");
    	CustomerFile pic1 = new CustomerFile("pic1");
    	CustomerFile doc1 = new CustomerFile("doc1");
    	
    	root.addComponent(home);
    		home.addComponent(lee);
    			lee.addComponent(music);
					music.addComponent(track1);
					music.addComponent(track2);
    			lee.addComponent(picture);
    				picture.addComponent(pic1);
    			lee.addComponent(doc);
    				doc.addComponent(doc1);
    				
    	root.addComponent(usr);
    		usr.addComponent(java);
    	
		show(root);
    }
    
    public static void show(Component c) {
    	System.out.println(c.getClass().getName() + "|" + c.name);
    	if(c instanceof CustomerFolder) {
    		((CustomerFolder) c).children.stream().forEach(App::show);
    	}
    }
}
