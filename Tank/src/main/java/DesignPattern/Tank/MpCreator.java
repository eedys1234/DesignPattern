package DesignPattern.Tank;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("마나 물약에 대한 정보를 가져옵니다.");		
	}

	@Override
	protected void createItemLog() {
		System.out.println("마나 물약을 생성합니다.");				
	}

	@Override
	protected Item createItem() {
		Item item = new MpItem();
		return item;
	}

}
