package Lab2;
import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int SIZE = 5;
		 int[][] grid = new int[SIZE][SIZE];
		
		 for(int i=0;i<SIZE;i++)
		 {
			 for(int j=0;j<SIZE;j++)
				  grid[i][j] = i*SIZE+j+1;
		 }
		 
		 for(int j=0;j<SIZE;j++)
		 {
			 for(int i=0;i<SIZE;i++)
				  System.out.printf("%d ",grid[i][j]);
			 System.out.printf("\n");
		 }
		 System.out.printf("\n\n");
		 for(int i=0;i<SIZE;i++)
		 {
			 for(int j=0;j<SIZE;j++)
			 {
				  if(i%2==0)
					  System.out.printf("%d ",grid[i][j]);
				  else
					  System.out.printf("%d ",grid[i][SIZE-1-j]);
			 }
			 System.out.printf("\n");
		 }
		 
	}

}
