package condicionais;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double saldo = 1000.00;
        int operacao;
        double valor = 0.0;

        System.out.println("===========================================");
        System.out.println("Código da Operação:");
        System.out.println("1 - Saldo");
        System.out.println("2 - Saque");
        System.out.println("3 - Depósito");
        System.out.println("===========================================");


        System.out.print("Operação: ");
        try {
            operacao = Integer.parseInt(leia.nextLine().trim());
        } catch (NumberFormatException e) {

            System.out.println("Operação Inválida!");
            leia.close();
            return;
        }


        if (operacao == 2 || operacao == 3) {
            System.out.print("Valor: R$ ");
            try {
                valor = Double.parseDouble(leia.nextLine().trim());
                if (valor <= 0) {
                    System.out.println("Operação Inválida!");
                    leia.close();
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Operação Inválida!");
                leia.close();
                return;
            }
        }


        switch (operacao) {
            case 1: 
                System.out.println("\nOperação - Saldo");
                System.out.printf("Saldo: R$ %.2f%n", saldo);
                break;

            case 2: 
                System.out.println("\nOperação - Saque");
                if (valor > saldo) {
                    System.out.println("Saldo Insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.printf("Novo saldo: R$ %.2f%n", saldo);
                }
                break;

            case 3:
                System.out.println("\nOperação - Depósito");
                saldo += valor;
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
                break;

            default:
                System.out.println("Operação Inválida!");
        }

        leia.close();
    }
}
