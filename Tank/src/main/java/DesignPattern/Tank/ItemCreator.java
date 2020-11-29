package DesignPattern.Tank;

public abstract class ItemCreator {

	public Item create() {	
		
		requestItemsInfo();
		createItemLog();
		Item item = createItem();
		return item;
	}
		
	abstract protected void requestItemsInfo();
	abstract protected void createItemLog();
	abstract protected Item createItem();
}
