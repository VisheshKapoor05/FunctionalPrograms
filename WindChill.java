package FunctionalPrograms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("Calculation of the wind chill ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of temperature in fahrenheit ");
		double t = sc.nextDouble();
		System.out.println("Enter the value of wind speed in miles/hour");
		double v = sc.nextDouble();
		
		if(t>50)
		{
			System.out.println("Please enter a temperature value less than 50 Fahrenheit");
		}
		else if(3>t || t>120)
		{
			System.out.println("Please enter a valid value of speed within 3miles/hr and 120miles/hr");
		}
		else
		{
		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75)*(Math.pow(v, 0.16)) ;
		
		System.out.println("the wind chill is " +w);
		}
	}

}
