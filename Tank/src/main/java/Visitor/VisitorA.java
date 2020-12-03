package Visitor;

public class VisitorA implements Visitor {

	private int num;
	
	@Override
	public void visit(Visitable visitable) {
		if(visitable instanceof VisitableA) {
			num += ((VisitableA) visitable).numberOfMember;
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
