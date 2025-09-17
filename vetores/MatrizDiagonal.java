package vetores;

import java.util.Scanner;

public class MatrizDiagonal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        System.out.println("Digite os elementos da matriz 3x3:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = leia.nextInt();
            }
        }


        System.out.println("\nMatriz informada:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }


        System.out.print("\nElementos da Diagonal Principal: ");
        int somaPrincipal = 0;
        for (int linha = 0; linha < 3; linha++) {
            System.out.print(matriz[linha][linha] + " ");
            somaPrincipal += matriz[linha][linha];
        }
        System.out.println("\nSoma dos elementos da Diagonal Principal: " + somaPrincipal);


        System.out.print("\nElementos da Diagonal Secundária: ");
        int somaSecundaria = 0;
        for (int linha = 0; linha < 3; linha++) {
            System.out.print(matriz[linha][2 - linha] + " ");
            somaSecundaria += matriz[linha][2 - linha];
        }
        System.out.println("\nSoma dos elementos da Diagonal Secundária: " + somaSecundaria);

        leia.close();
    }
}
