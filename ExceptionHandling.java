package labexam;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void divisionGame(int num1, int num2) {
		try {
			double answer = num1/num2;
			System.out.println("ANSWER = "+ answer);
		}
		catch(ArithmeticException e) {
			System.out.println("CAN NOT BE DIVISIBLE BY ZERO");
		}
		finally {
			System.out.println("PROGRAM IS TERMINATED");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("DIVISION GAME!");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ENTER NUMBER 1: ");
		int num1 = input.nextInt();
		
		System.out.print("ENTER NUMBER 2: ");
		int num2 = input.nextInt();
		
		divisionGame(num1, num2);

	}

}
