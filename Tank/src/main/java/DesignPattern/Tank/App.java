package DesignPattern.Tank;

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
		System.out.println("메인함수 실행");

		SingleTonTest2.getInstance();

		System.out.println("메인함수 종료");
    }
}
