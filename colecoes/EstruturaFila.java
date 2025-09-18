package colecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaFila {
    private static final String REGEX_NOME = "[a-zA-ZÀ-ÿ]+";

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        while (true) {
            System.out.println("\n===== MENU FILA =====");
            System.out.println("1) Entrar na fila");
            System.out.println("2) Sair da fila");
            System.out.println("3) Chamar próximo");
            System.out.println("4) Ver minha posição");
            System.out.println("5) Listar fila");
            System.out.println("0) Sair");
            System.out.print("Opção: ");
            String opcao = leia.nextLine().trim();

            switch (opcao) {
                case "1": { // entrar
                    String nome = lerNome(leia, "Digite seu nome para entrar: ");
                    fila.offer(nome);
                    int posicao = fila.size(); 
                    System.out.println(nome + " entrou na fila. Sua posição é: " + posicao);
                    break;
                }
                case "2": { 
                    String nome = lerNome(leia, "Digite seu nome para sair da fila: ");
                    boolean removido = removerPrimeiraOcorrencia(fila, nome);
                    if (removido) {
                        System.out.println(nome + " saiu da fila.");
                    } else {
                        System.out.println("Nome não encontrado na fila.");
                    }
                    listarFila(fila);
                    break;
                }
                case "3": { 
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia. Ninguém para chamar.");
                    } else {
                        String chamado = fila.poll();
                        System.out.println("Chamando: " + chamado);
                        if (fila.isEmpty()) {
                            System.out.println("Fila agora está vazia.");
                        } else {
                            System.out.println("Próximo será: " + fila.peek());
                            listarFila(fila);
                        }
                    }
                    break;
                }
                case "4": { 
                    String nome = lerNome(leia, "Digite seu nome para consultar a posição: ");
                    int pos = posicaoNome(fila, nome);
                    if (pos == -1) {
                        System.out.println(nome + " não está na fila.");
                    } else {
                        System.out.println(nome + " está na posição: " + pos);
                    }
                    break;
                }
                case "5": { 
                    listarFila(fila);
                    break;
                }
                case "0":
                    System.out.println("Encerrando...");
                    leia.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static String lerNome(Scanner leia, String prompt) {
        while (true) {
            System.out.print(prompt);
            String nome = leia.nextLine().trim();
            if (nome.matches(REGEX_NOME)) 
            	return nome;
            System.out.println("Entrada inválida! Digite apenas letras.");
        }
    }


    private static boolean removerPrimeiraOcorrencia(Queue<String> fila, String alvo) {
        Queue<String> aux = new LinkedList<>();
        boolean removido = false;
        while (!fila.isEmpty()) {
            String atual = fila.poll();
            if (!removido && atual.equalsIgnoreCase(alvo)) {
                removido = true; 
            } else {
                aux.offer(atual);
            }
        }
        fila.addAll(aux);
        return removido;
    }

    private static int posicaoNome(Queue<String> fila, String nome) {
        int contador = 1;
        for (String pessoas : fila) {
            if (pessoas.equalsIgnoreCase(nome)) return contador; 
            contador++;
        }
        return -1; 
    }

    private static void listarFila(Queue<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
            return;
        }
        System.out.println("\nFila atual (posição - nome):");
        int contador = 1;
        for (String pessoas : fila) {
            System.out.println(contador++ + " - " + pessoas);
        }
    }
}
