package ChallengeAcademy;

/*CompareArrayNumbers: That receives two lists of numbers and returns a list with the max of both
 * 
 */
import java.util.Scanner;

public class CompareArrayNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cantidad de numeros que desea comparar en la primer lista: ");
		int cantidadNumeros = sc.nextInt();
		int numeros[] = new int[cantidadNumeros];
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Ingrese numeros: ");
			numeros[i] = sc.nextInt();
			contador += numeros[i];

		}

		System.out.println("Ingrese cantidad de numeros que desea comparar en la segunda lista: ");
		int cantidadNumeros2 = sc.nextInt();
		int numeros2[] = new int[cantidadNumeros2];
		int contador2 = 0;
		for (int i = 0; i < numeros2.length; i++) {

			System.out.println("Ingrese numeros: ");
			numeros2[i] = sc.nextInt();
			contador2 += numeros2[i];

		}
		// busqueda de maximo en array
		int count = 0;
		int maximo = numeros[count];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
		}

		System.out.println("El numero mayor de la primer lista es es: " + maximo);

		int count2 = 0;
		int maximo2 = numeros2[count2];
		for (int i = 0; i < numeros2.length; i++) {
			if (numeros2[i] > maximo2) {
				maximo2 = numeros2[i];
			}
		}

		System.out.println("El numero mayor de la segunda lista es es: " + maximo2);

	}
}
