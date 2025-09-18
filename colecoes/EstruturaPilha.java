package colecoes;

import java.util.Scanner;
import java.util.Stack;

	public class EstruturaPilha {
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        Stack<String> pilha = new Stack<>();

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1 - Adicionar um novo livro na pilha");
	            System.out.println("2 - Listar todos os livros da pilha");
	            System.out.println("3 - Retirar um livro da pilha");
	            System.out.println("0 - Sair");
	            System.out.print("Opção: ");

	            String opcao = leia.nextLine().trim();

	            switch (opcao) {
	                case "1": { 
	                    System.out.print("Digite o nome do livro: ");
	                    String livro = leia.nextLine().trim();
	                    if (livro.isEmpty()) {
	                        System.out.println("Nome inválido. Tente novamente.");
	                        break;
	                    }
	                    pilha.push(livro);
	                    System.out.println(livro + "\" adicionado ao topo da pilha.");
	                    break;
	                }
	                case "2": { 
	                    if (pilha.isEmpty()) {
	                        System.out.println("A pilha está vazia.");
	                    } else {
	                        System.out.println("\nLivros na pilha (do topo para base):");
	                        for (int posicao = pilha.size() - 1; posicao >= 0; posicao--) {
	                            String marcador = (posicao == pilha.size() - 1) ? " (topo)" : "";
	                            System.out.println("- " + pilha.get(posicao) + marcador);
	                        }
	                    }
	                    break;
	                }
	                case "3": { 
	                    if (pilha.isEmpty()) {
	                        System.out.println("A pilha está vazia. Nada a retirar.");
	                    } else {
	                        String retirado = pilha.pop();
	                        System.out.println("Retirado do topo: " + retirado);
	                        if (pilha.isEmpty()) {
	                            System.out.println("A pilha agora está vazia.");
	                        } else {
	                            System.out.println("Topo atual: " + pilha.peek());
	                        }
	                    }
	                    break;
	                }
	                case "0":
	                    System.out.println("Programa finalizado.");
	                    leia.close();
	                    return;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        }
	    }
	
}
