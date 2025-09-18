package repeticoes;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = new int[10];
		int par = 0, impar = 0;
		
		for (int i = 0; i< numeros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			numeros[i] = leia.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
		if (numeros[i] % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
			
			System.out.println("\nTotal de números pares: " + par);
	        System.out.println("Total de números ímpares: " + impar);

	        leia.close();

	}

}
