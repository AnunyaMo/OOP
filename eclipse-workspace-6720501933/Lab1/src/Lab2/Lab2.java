package Lab2;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Please input the number :");
		int value = sc.nextInt();
		int i,j,size=5,Ans=0;
		int[] arr=new int[size];
		System.out.printf("%d = ",value);
		for(i=0;value>0;i++)
		{
			arr[i]=value%10;
			value = value/10;
			Ans=Ans+arr[i];
		}
		for(j=i-1;j>=0;j--)
		{
			System.out.printf("%d ",arr[j]);
			if(j!=0)
				System.out.printf(" + ");
		}
		System.out.printf(" = %d", Ans);
	}

}
