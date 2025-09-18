package colecoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {
	
	public static void main(String[]args) {
		Set<String> frutas = new HashSet<String>();
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("banana");
		
		
		System.out.println(frutas);
		
		for(String fruta : frutas) {
		System.out.println(fruta.hashCode());
		}
		
		frutas.remove("Abacate");
		
		System.out.println(frutas);
		
		System.out.println("A fruta Amora está presente no set? " + frutas.contains("Amora"));
		System.out.println("O set está vazio? " + frutas.isEmpty());
		
		frutas.add("Kiwi");// depoos do iterator, vai dar erro, ele não vai reconhecer!
		
		
		Iterator<String> itFrutas = frutas.iterator();	
		
		while(itFrutas.hasNext()) {
			System.out.println(itFrutas.next());
		}
		
		
		ArrayList<String> frutasList= new ArrayList<String>();
		
		frutasList.addAll(frutas);
		
		frutasList.sort(null);
		
		System.out.println(frutasList);
		
		frutasList.sort(Comparator.reverseOrder());
		
		System.out.println(frutasList);
		
		
		
		
	}
}