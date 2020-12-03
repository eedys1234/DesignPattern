package Visitor;

public class VisitableA implements Visitable {

	public int numberOfMember;

	public VisitableA(int numberOfMember) {
		this.numberOfMember = numberOfMember;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
