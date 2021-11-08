package FunctionalPrograms;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("A quadratic equation is ax^2 + bx + c ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b ");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c");
		double c = sc.nextDouble();
		
		double delta = (b*b)-(4*a*c) ;
		double Root1 = (-b + Math.sqrt(delta))/(2*a) ;
		double Root2 = (-b - Math.sqrt(delta))/(2*a) ;
		
		System.out.println("Root 1 of the equation is " +Root1);
		System.out.println("Root 2 of the equation is " +Root2);
	}
}
