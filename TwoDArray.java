package FunctionalPrograms;
import java.util.Scanner;
//import java.io.PrintWriter;

public class TwoDArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows M for 2D array");
		int M = scanner.nextInt();
		System.out.println("Enter the number of colums N for 2D array");
		int N = scanner.nextInt();
		
		int arr[][] = new int[M][N];
		
		for(int i=0; i<M; i++)
		{
			for(int j=0; j<N; j++)
			{
				System.out.println("Enter the value of element: row" +i +" & column" +j);
				arr[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<M; i++)
		{
			for(int j=0; j<N; j++)
			{
				System.out.print(arr[i][j] +" ");
				
				/*PrintWriter writer = new PrintWriter(System.out);
				writer.write(arr[i][j] +" ");
				writer.flush();
				writer.close();
				*/
			}
			System.out.println();
		}
		
	}
}
