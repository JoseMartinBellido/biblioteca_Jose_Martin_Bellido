package tarea1EDGit;

import java.util.Scanner;

public class SumaDeEnteros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Recogemos los datos
		System.out.println("SUMA DE DOS ENTEROS");
		System.out.print("Introduce un primer número entero");
		int numero1 = sc.nextInt();
		
		System.out.print("Introduce un segundo número entero");
		int numero2 = sc.nextInt();
		
		// Impresión de resultado con el calculo interno en el print
		System.out.println("La suma de " + numero1 + " con " + numero2 + " da como resultado: " + (numero1 + numero2));
		
		sc.close();
	}

}
