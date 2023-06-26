package study;

public class Bicycle {
	protected int speed;
	protected int gears;
	
	//Super constructor of super class
	public Bicycle(int startSpeed, int startGears) {
		this.speed = startSpeed;
		this.gears = startGears;
	}
	
	//methods
	
	public void setGear(int newgear) {
		gears += newgear;
	}
	public void applybreak(int breakValue) {
		speed -= breakValue;
	}
	public void speedUp(int speedValue) {
		speed += speedValue;
	}
}
