package ChainResponsibility;

public class Pitching extends Defense {

	private int def;
	
	@Override
	public void operator(Attack attack) {
		int amount = attack.getAmount();
		amount -= def;
		attack.setAmount(amount);
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}
