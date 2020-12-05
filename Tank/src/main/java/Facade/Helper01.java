package Facade;

public class Helper01 {

	public Helper01() {
		System.out.println("Call Constructor " + getClass().getSimpleName());
	}
	
	public void process() {
		System.out.println("Call process " + getClass().getSimpleName());
	}
}
