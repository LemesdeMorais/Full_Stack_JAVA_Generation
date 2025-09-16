package repeticoes;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero, contador=1;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		
		do {
			
			System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
			contador ++;
			
		}while(contador <= 10);
		
		leia.close();
	}

}
