package repeticoes;

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int inicio, fim;

        System.out.print("Digite o primeiro número do intervalo: ");
        inicio = leia.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        fim = leia.nextInt();


        if (inicio >= fim) {
            System.out.println("Intervalo inválido! O primeiro número deve ser menor que o segundo.");
        } else {
            System.out.println("\nNo intervalo entre " + inicio + " e " + fim + ":");

            for (int i = inicio; i <= fim; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }/*else {
                	System.out.println(" Não é um multiplo de 3 e 5"); se eu deixasse essa linha de código
                													iria mostrar essa mensagem 14 vezes.
                }*/
            }
        }

        leia.close();
    }
}
