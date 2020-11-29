package DesignPattern.Tank.Prototype;

public class Circle extends Shape {
	
	int x, y, r;
	
	Circle() {
		
	}
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public Circle copy() throws CloneNotSupportedException {
		Circle copy = (Circle)clone();
		copy.x += 1;
		copy.y += 1;
		
		return copy;
	}
}
