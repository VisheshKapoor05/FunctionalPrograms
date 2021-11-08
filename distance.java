package FunctionalPrograms;
import java.util.Scanner;
public class distance {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//First Line
		System.out.print("x: ");
		double x = sc.nextDouble();
		System.out.print("y: ");
		double y = sc.nextDouble();

		double distance = linelength(x, 0, y, 0);
		System.out.println("distance = " +distance);

		}

		static double linelength(double x1, double x2, double y1, double y2)
		{
		double X = Math.pow((x2-x1),2);
		double Y = Math.pow((y2-y1),2);
		double distance = (Math.sqrt(X+Y));
		return distance;
		}
	}
