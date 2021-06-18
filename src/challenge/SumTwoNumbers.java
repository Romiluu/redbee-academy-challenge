package ChallengeAcademy;

//SumTwoNumbers: That receives two numbers and returns the sum of both

import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args) {
		float number1, number2, sum;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer número:");
		number1 = sc.nextFloat();
		System.out.println("Introduce el segundo número:");
		number2 = sc.nextFloat();

		sum = number1 + number2;
		System.out.println("El resultado de la suma entre " + number1 + " y " + number2 + " es: " + sum);

	}

}
