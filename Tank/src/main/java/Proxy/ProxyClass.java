package Proxy;

public class ProxyClass implements ProxyInterface {

	private ProxyInterface proxyInterface;
	
	public ProxyClass(ProxyInterface proxyInterface) {
		this.proxyInterface = proxyInterface;		
	}
	
	@Override
	public void execute() {
		System.out.println("AAAA");
		this.proxyInterface.execute();
		System.out.println("BBBB");		
	}

}
