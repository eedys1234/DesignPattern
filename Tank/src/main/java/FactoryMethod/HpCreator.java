package FactoryMethod;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("체력 물약에 대한 정보를 가져옵니다.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력 물약을 생성합니다.");		
	}

	@Override
	protected Item createItem() {
		Item item = new HpItem();
		return item;
	}

}
