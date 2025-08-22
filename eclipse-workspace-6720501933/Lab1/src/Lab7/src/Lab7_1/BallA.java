package Lab7_1;

public class BallA extends Ball implements RollAble{
	
	public BallA(String n) {
		super(n);
	}

	@Override
	public void roll() {
		System.out.print(super.getTreadMark()+" rolls rather smoothly\n");
	}


	@Override
	public void inflate(double volume) {
		System.out.print(super.getTreadMark()+"'s ball is inflated "+volume+" cu.ft.\n");
	}

	
}
