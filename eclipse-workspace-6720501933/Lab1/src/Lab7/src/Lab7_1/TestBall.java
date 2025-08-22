package Lab7_1;

public class TestBall {
	public static void testBall(Ball t,double v) {
		System.out.println(t);
		t.inflate(v);
		RollAble c =(RollAble)t;
		c.roll();
		
		
	}

	public static void main(String[] args) {
		BallA a = new BallA("Zentia");
		BallB b = new BallB("Zapphire");
		BallC c = new BallC("Zenith");
		testBall(a,1.0);
		testBall(b,1.1);
		testBall(c,1.2);
	}

}
