package Bridge;

public class MorseCode {

	MorseCodeFunction function;
	
	public MorseCode(MorseCodeFunction function) {
		this.function = function;
	}

	protected void dot() {
		function.dot();
	}
	
	protected void dash() {
		function.dash();
	}
	
	protected void space() {
		function.space();
	}
}
