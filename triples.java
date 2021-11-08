package FunctionalPrograms;
import java.util.Scanner;

public class triples {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of total number of integers N");
		int N = scanner.nextInt();
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)
		{
			System.out.print("Enter the value of number " +(i+1) +" ");
			arr[i] = scanner.nextInt();
		}
		
		int TotalTriples=0;
		for(int i=0; i<N-2; i++)
		{
			for(int j=i+1; j<N-1; j++)
			{
				for(int k=j+1; k<N; k++)
				{
					if(arr[i] + arr[j] + arr[k] == 0)
					{
						System.out.println(arr[i] +"," +arr[j] +"," +arr[k]);
						TotalTriples++;
					}
				}
			}
		}
		
		System.out.println("Total number of triples are " +TotalTriples);
	}

}
