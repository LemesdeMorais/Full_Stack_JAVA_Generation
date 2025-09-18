package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, esporte,totalRespostas = 0, futebol = 0, voleiM18 = 0, basquetem18 = 0;
		long somaIdades= 0;
		double mediaIdades = 0;
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Pesquisa - Esporte Favorito");
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("Digite o seu esporte favorito: ");
			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");
			esporte = leia.nextInt();
			
			//total de pessoas que gostam de futebel
			if (esporte == 1) {
				futebol ++;
			}
			
			//total de pessoas que gostam de volei e sao maiores de 18 anos.
			if (esporte == 2 && idade >= 18) {
				voleiM18 ++;
			}
			
			//total de pessoas que gostam de basquete e sao menores de 18 anos.
			if (esporte == 3 && idade <= 18) {
				basquetem18 ++;
			}
			
			somaIdades += idade;
			
			totalRespostas ++;
			
			System.out.println("Deseja continuar (S/N)? ");
				
				leia.skip("\\R");
				continua = leia.nextLine().toUpperCase();
		
		
		mediaIdades = Math.round(somaIdades/ totalRespostas);
		
		System.out.printf("Total de pessoas que gostam de futebol: %d%n", futebol);
		System.out.printf("Total de pessoas que gostam de voleibol maiores de 18 anos: %d%n", voleiM18);
		System.out.printf("Total de pessoas que gostam de basquetebol menores de 18 anos: %d%n", basquetem18);
		System.out.printf("Média das idades: %.2f%n", mediaIdades);
		
		leia.close();

	}

	}
	}
