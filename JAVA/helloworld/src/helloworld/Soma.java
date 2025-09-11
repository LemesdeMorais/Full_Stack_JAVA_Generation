package helloworld;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double n1, n2;
		
		System.out.println("Digite o primeiro número da soma: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número da soma: ");
		n2 = leia.nextDouble();
		
	//	System.out.println("O valor da soma é: " + (n1 + n2)); <---- também funciona
		System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 + n2);
		
		leia.close();
	}

}
