package State;

public class Light {
	
	private LightState lightState;

	private LightState offLightState = new LightState() {
		
		public void on() {
			System.out.println("Light on");
			lightState = onLightState;
		}
		
		@Override
		public void off() {
			System.out.println("Noting");
		}
	};
	
	private LightState onLightState = new LightState() {
		
		public void on() {
			System.out.println("Noting");		
		}
		
		@Override
		public void off() {
			System.out.println("Light off");
			lightState = offLightState;
		}
	};
	
	public Light() {
		this.lightState = offLightState;
	}
	
	public void on() {
		lightState.on();
	}
	
	public void off() {
		lightState.off();		
	}
	
	
	interface LightState {
		void on();
		void off();
	}

}


