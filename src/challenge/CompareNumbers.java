package ChallengeAcademy;

/*CompareNumbers: That receives three numbers and return the max of them
 * 
 */
import java.util.Scanner;

public class CompareNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number1, number2, number3;

		System.out.println("Introduce el primer número:");
		number1 = sc.nextDouble();
		System.out.println("Introduce el segundo número:");
		number2 = sc.nextDouble();
		System.out.println("Introduce el tercer número:");
		number3 = sc.nextDouble();

		if (number1 > number2 && number1 > number3) {
			System.out.println("El numero mayor es: " + number1);
		} else {
			if (number2 > number1 && number2 > number3) {
				System.out.println("El numero mayor es: " + number2);
			} else {
				System.out.println("El numero mayor es: " + number3);
			}
		}
	}

}
