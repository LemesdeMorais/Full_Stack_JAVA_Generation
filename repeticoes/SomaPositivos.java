package repeticoes;

import java.util.Scanner;

public class SomaPositivos {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("============================================");

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0); 

        System.out.println("--------------------------------------------");
        System.out.println("A soma dos números positivos é: " + soma);
        System.out.println("============================================");

        leia.close();
    }
}
