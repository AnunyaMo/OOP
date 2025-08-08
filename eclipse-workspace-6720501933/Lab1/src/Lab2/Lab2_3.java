package Lab2;
import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter started day :");
		int day = sc.nextInt();
		System.out.printf("Su	Mo	Tu	We	Th	Fr	Sa\n");
		int j=day,nl=1,i,k=1;
		for(i=1;i<=100;i++)
		{
			if(nl!=day)
			{
				System.out.printf("	");
				nl++;
				continue;
			}
			System.out.printf("%d	",k);
			k++;
			if(i%7==0)
				System.out.printf("\n");
			if(k==32)
				break;
			
		}
	}

}
