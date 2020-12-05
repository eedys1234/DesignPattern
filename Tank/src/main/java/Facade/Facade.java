package Facade;

public class Facade {

	private Helper01 helper01; 
	private Helper02 helper02; 
	private Helper03 helper03; 
	
	public Facade() {
		helper01 = new Helper01();
		helper02 = new Helper02();
		helper03 = new Helper03();
	}
	
	public void process() {
		helper01.process();
		helper02.process();
		helper03.process();
	}
}
