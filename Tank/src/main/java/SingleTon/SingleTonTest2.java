package SingleTon;

public class SingleTonTest2 {
	
	private static SingleTon instacne = new SingleTon();
	
	public static SingleTon getInstance() {
		return instacne;
	}
	
	public static void getText() {
		System.out.println("텍스트 호출");
	}
}
