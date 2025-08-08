package lab1_2;

import java.util.Scanner;

public class lab1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Coordinates:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		if((i>0)&&(j>0)) {
			System.out.printf("Q1");
		}else if((i<0)&&(j>0)) {
			System.out.printf("Q2");
		}else if((i<0)&&(j<0)) {
			System.out.printf("Q3");
		}
		else if((i>0)&&(j<0)) {
			System.out.printf("Q4");
		}else if((i==0)&&(j==0)) {
			System.out.printf("origin");
		}else if((i==0)&&(j>0)) {
			System.out.printf("y-intercept");
		}else if((i<0)&&(j==0)) {
			System.out.printf("x-intercept");
		}

	}

}
