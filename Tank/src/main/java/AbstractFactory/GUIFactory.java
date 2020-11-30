package AbstractFactory;

public class GUIFactory {
	
	public static GUIFac getInstance() {
		
		switch(0) {
			case 0: {
				return new LinuxGUIFac();
			}
			case 1: {
				return new WinGUIFac();
			}
		}
		
		return null;
	}
}
