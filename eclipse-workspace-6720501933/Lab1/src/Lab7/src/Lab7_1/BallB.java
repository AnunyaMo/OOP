package Lab7_1;

public class BallB extends BallA{
	
	public BallB(String n) {
		super(n);
	}

	public void roll() {
		System.out.print(super.getTreadMark()+" rolls smoothly\n");
		
	}
}
