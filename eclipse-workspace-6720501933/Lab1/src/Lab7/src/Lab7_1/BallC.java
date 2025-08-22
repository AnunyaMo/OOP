package Lab7_1;

public class BallC extends BallA{
	public BallC(String n) {
		super(n);
	}
	
	public void roll() {
		System.out.print(super.getTreadMark()+" rolls very smoothly\n");
		
	}
}
