package SingleTon;

public class SingleTonTest {
		
	private SingleTonTest() {
		
	}
	
	public static SingleTon getInstance() { 
		return SingleTonHelper.instacne;
	}
	
	private static class SingleTonHelper {
		
		public static SingleTon instacne = new SingleTon();
		
//		public static SingleTon getIntacne() {
//			System.out.println("Helper 클래스 로딩");
//			return instacne;
//		}
	}
	
	public static void getText() {
		System.out.println("텍스트 호출");
	}

}
