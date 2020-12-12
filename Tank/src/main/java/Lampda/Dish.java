package Lampda;

public class Dish {

	private String type;
	private int calories;
	private String name;
	
	public Dish(String type, String name, int calories) {
		this.type = type;
		this.name = name;
		this.calories = calories;		
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
