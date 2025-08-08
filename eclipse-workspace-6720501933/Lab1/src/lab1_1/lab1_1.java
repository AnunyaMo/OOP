package lab1_1;
import java.util.Scanner;
public class lab1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter triangle side:");
		double i = sc.nextDouble();
		System.out.printf("Enter prism length:");
		double j = sc.nextDouble();
		System.out.printf("%.2f",( ((Math.sqrt(3)/4)*i*i)*2)+(i*j)*3 );
	}

}
