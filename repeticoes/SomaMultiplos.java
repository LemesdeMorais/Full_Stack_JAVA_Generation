package repeticoes;

import java.util.Scanner;

public class SomaMultiplos {

	public static void main(String[] args) {
	      Scanner leia = new Scanner(System.in);

	        int numero;
	        int somaPositivos = 0;
	        int somaMultiplos3 = 0;
	        int contadorMultiplos3 = 0;

	        System.out.println("============================================");

	        do {
	            System.out.print("Digite um número: ");
	            numero = leia.nextInt();


	            if (numero > 0) {
	                somaPositivos += numero;
	            }


	            if (numero != 0 && numero % 3 == 0) {
	                somaMultiplos3 += numero;
	                contadorMultiplos3++;
	            }

	        } while (numero != 0);

	        System.out.println("--------------------------------------------");
	        System.out.println("A soma dos números positivos é: " + somaPositivos);

	        if (contadorMultiplos3 > 0) {
	            double media = (double) somaMultiplos3 / contadorMultiplos3;
	            System.out.println("A média dos múltiplos de 3 é: " + media);
	        } else {
	            System.out.println("Nenhum múltiplo de 3 foi digitado.");
	        }

	        System.out.println("============================================");

	        leia.close();
	    }
	}
