package repeticoes;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, contador;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		for(contador = 1 /* onde começa o laço*/; contador <= 10/*até onde vai*/; contador ++ /*a atualização, nesse caso o pós incremento, menor pro maior*/) {
			System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
		}
		
		leia.close();

	}

}
