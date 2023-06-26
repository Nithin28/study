package study;

public class TestBicycle {

	public static void main(String[] args) {
	
		MountainBike bicycle = new MountainBike(30, 1, 2);
	
	System.out.println("The speed of Bicycle "+ bicycle.speed);
	System.out.println("The gear of Bicycle "+ bicycle.gears);
	System.out.println("The seat height of Bicycle "+ bicycle.seatHeight);
	
	System.out.println("------------");
	
	System.out.println("applying break");
	bicycle.applybreak(5);
	bicycle.seatAdjust(5, 4);
	System.out.println("Speed of Bicycle after applying break "+ bicycle.speed +"kmph and seat adjusted to "+bicycle.seatHeight);
	
	}

}
