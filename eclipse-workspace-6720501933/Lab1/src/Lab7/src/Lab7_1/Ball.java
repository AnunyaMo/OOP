package Lab7_1;

public abstract class Ball {
	private String treadMark;
	
	public Ball(String n) {
		this.treadMark = n;
	}
	 public String getTreadMark() {
		return treadMark;
	}
	public abstract void inflate(double volume);
	
	public String toString() {
		return treadMark+"is a treadMark of "+getClass().getSimpleName();
	}
}
