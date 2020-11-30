package AbstractFactory;

public class LinuxGUIFac implements GUIFac {

	public Button createButton() {
		return new LinuxButton();
	}

	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}
