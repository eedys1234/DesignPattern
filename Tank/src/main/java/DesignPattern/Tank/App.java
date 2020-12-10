package DesignPattern.Tank;

import java.util.LinkedList;
import java.util.List;

import Command.UserInterface;
import Proxy.ProxyClass;
import Proxy.ProxyInterface;
import Proxy.ServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	ProxyInterface proxyInterface = new ProxyClass(new ServiceImpl());
    	proxyInterface.execute();
    }
}
