package ChallengeAcademy;

/*SumArrayNumbers: That receives a list and return the sum of entire list
 * 
 */
import java.util.Scanner;

public class SumArrayNumbers {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de numeros que desea sumar: ");
		int cantidadNumeros = sc.nextInt();
		int numeros[] = new int[cantidadNumeros];
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Ingrese numeros: ");
			numeros[i] = sc.nextInt();
			contador += numeros[i];
		}

		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		System.out.println("La suma total es: " + suma);
	}

}
