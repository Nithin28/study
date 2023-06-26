package study;

public class MountainBike extends Bicycle{
	public int seatHeight;

	//constructor passes value for super and current class
	public MountainBike(int startSpeed, int startGears,int setSeatHeight) {
		super(startSpeed, startGears);
		seatHeight = setSeatHeight;
	}
//	mehods 
	
	public void seatAdjust(int up,int down) {
		seatHeight += up;
		seatHeight -= down;
	}
	

}
