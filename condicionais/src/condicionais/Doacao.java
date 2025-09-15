package condicionais;

import java.util.Scanner;

public class Doacao {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome,resposta;
        int idade;
        boolean primeiraDoacao;

        System.out.println("=================================================================");
        while (true) {
	        System.out.print("\tDigite o nome do doador: ");
	        nome = leia.nextLine().trim();
	        
	        if (!nome.isEmpty()) {
	        	break;
	        }else {
	        	 System.out.println("\tO nome não pode estar vazio! ");
	        }
        }  

        while (true) {
            System.out.print("\tDigite a idade do doador: ");
            String entrada = leia.nextLine().trim();

            try {
                idade = Integer.parseInt(entrada);
                if (idade < 0 || idade > 105) {
                    System.out.println("Idade fora do intervalo permitido.");
                    continue;
                }
                break; 
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas números inteiros.");
            }
        }


        while (true) {
            System.out.print("\tPrimeira doação de sangue? (S/N): ");
            resposta = leia.nextLine().trim().toUpperCase();

            if (resposta.equalsIgnoreCase("S")) { 
                primeiraDoacao = true; 
                break; 
            }
            if (resposta.equalsIgnoreCase("N")) { 
                primeiraDoacao = false; 
                break; 
            }
            System.out.println("Entrada inválida! Tente novamente.");
        }

        boolean apto = false;
        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && primeiraDoacao) {
                apto = false; 
            } else {
                apto = true;
            }
        }


        if (apto) {
            System.out.println("\t" + nome + " está apto(a) para doar sangue!");
        } else {
            System.out.println("\t" + nome + " não está apto(a) para doar sangue!");
        }
        System.out.println("=================================================================");

        leia.close();
    }
}
