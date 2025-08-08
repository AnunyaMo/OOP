package Lab2;
import java.util.Scanner;

public class Lab2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter sentence :");
		String s = sc.nextLine();
		s= s.replace("happy","happy :)");
		s= s.replace("sad","sad :(");
		System.out.printf(""+s);
	}

}
