package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Maria");
		fila.add("Aline");
		fila.add("Leticia");
		fila.add("Cintia");
		fila.add("Rayssa");
		
		
		System.out.println("-------------------------------------------------------");
		System.out.println(fila);
		
		fila.remove();
		
		System.out.println(fila);

		fila.add("Milena");
		fila.add("Nadia");
		
		System.out.println("");
		System.out.println(fila);
		System.out.println("");
		System.out.println("\tTamanho da fila é: " + fila.size());
		System.out.println("\tA primeira pessoa da fila é: " + fila.peek());
		System.out.println("");
		
		//for(String pessoa : fila) esse metodo é um for each {
			
		for(var pessoa : fila) {
			System.out.println("\t" + pessoa);
		}
		
		
		System.out.println("-------------------------------------------------------");
		
	}

}
