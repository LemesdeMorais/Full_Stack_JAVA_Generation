package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> pilha = new ArrayDeque<String>();
		
		System.out.println("-------------------------------------------------------");
		pilha.push("Duna");
		pilha.push("Pai Rico Pai Pobre");
		pilha.push("Maus");
		pilha.push("Crime e Castigo");
		pilha.push("Quarto de Despejo");
		
		System.out.println(pilha);
		System.out.println("----");
		
		pilha.pop();
		
		System.out.println(pilha);
		System.out.println("----");
		System.out.printf(pilha.poll(), pilha.pop());
		System.out.printf("\n",pilha);
		System.out.println("----");
		
		System.out.println("O livro Guia do Mochileiro da Galáxia está na pilha? " + pilha.contains("O livro Guia do Mochileiro da Galáxia está na pilha?"));
		System.out.println("-------------------------------------------------------");
	}

}
