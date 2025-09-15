package condicionais;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        int codigoCargo = 0;
        float salario = 0;
        String cargo = "";
        float percentual = 0;

        System.out.println("===========================================");

        while (true) {
            System.out.print("Digite o nome do colaborador: ");
            nome = leia.nextLine().trim();
            if (!nome.isEmpty()) break;
            System.out.println("⚠️ Nome não pode estar vazio!");
        }


        while (true) {
        	System.out.println("============================================");
            System.out.println("Digite o código do cargo (1 a 6): ");
            System.out.println("1 - Gerente ");
            System.out.println("2 - Vendedor ");
            System.out.println("3 - Supervisor ");
            System.out.println("4 - Motorista");
            System.out.println("5 - Estoquista");
            System.out.println("6 - Técnico de TI");
            System.out.println("============================================");
            try {
                codigoCargo = Integer.parseInt(leia.nextLine().trim());
                if (codigoCargo >= 1 && codigoCargo <= 6) break;
                System.out.println("Código inválido, escolha um número entre 1 e 6.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, digite apenas números.");
            }
        }


        while (true) {
            System.out.print("Digite o salário do colaborador: R$ ");
            try {
                salario = Float.parseFloat(leia.nextLine().trim());
                if (salario > 0) break;
                System.out.println("⚠️ O salário deve ser maior que zero.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, digite apenas números (use ponto para decimais).");
            }
        }


        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                percentual = 0.10f;
                break;
            case 2:
                cargo = "Vendedor";
                percentual = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                percentual = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                percentual = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                percentual = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                percentual = 0.08f;
                break;
            default:
                System.out.println("Código inválido!"); 
                break;
        }


        float novoSalario = salario + (percentual * salario);


        System.out.println("===========================================");
        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f%n", novoSalario);
        System.out.println("===========================================");

        leia.close();
    }
}
