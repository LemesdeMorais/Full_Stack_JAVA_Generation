package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ColectionSet {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<>();
		System.out.println("-------");
		System.out.println("Digite 5 cores: ");
			for (int linha = 1; linha <= 5;) {
				System.out.println("Cor " + linha + ":");
				String cor = leia.nextLine().trim();
				
				if (cor.matches("[a-zA-ZÀ-ÿ]+")) {
					cores.add(cor);
					linha++;
				}else {
					System.out.println("Entrada inválida! Tente novamente.");
					
				}
			}
			 
			System.out.println("-------");
			System.out.println("Cores adicionadas: ");
			for (String cor : cores) {
				System.out.println(cor);
			}
			
			
			
			Collections.sort(cores, String.CASE_INSENSITIVE_ORDER); // vai ordenar mesmo iniciando com letra maiuscula ou minuscula
			//cores.sort(Comparator.reverseOrder());
			System.out.println("-------");
			System.out.println("Cores em ordem crescente: ");
			for (String cor : cores) {
				System.out.println(cor);

			}
		leia.close();
	}

}
