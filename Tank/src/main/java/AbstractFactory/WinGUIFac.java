package AbstractFactory;

public class WinGUIFac implements GUIFac {

	public Button createButton() {
		return new WinButton();
	}

	public TextArea createTextArea() {
		return new WinTextArea();
	}

}
