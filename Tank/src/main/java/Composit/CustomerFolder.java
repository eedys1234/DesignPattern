package Composit;

import java.util.List;
import java.util.ArrayList;

public class CustomerFolder extends Component {

	public List<Component> children = new ArrayList<Component>();
	
	public CustomerFolder(String name) {
		super(name);
	}

	public boolean addComponent(Component component) {
		return children.add(component);
	}

	public boolean removeComponent(Component component) {
		return children.remove(component);
	}

}
