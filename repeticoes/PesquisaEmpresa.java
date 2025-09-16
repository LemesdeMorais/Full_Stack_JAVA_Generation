package repeticoes;

import java.util.Scanner;

public class PesquisaEmpresa {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int tBackend = 0;
        int tMFrontend = 0;       
        int tHMobilem40 = 0;    
        int tNBFullstackMaior30 = 0;     
        int totalPessoas = 0;
        long somaIdades = 0;

        boolean continuar = true;

        while (continuar) {

            int idade;
            while (true) {
                System.out.print("Idade: ");
                String s = leia.nextLine().trim();
                try {
                    idade = Integer.parseInt(s);
                    if (idade >= 17 && idade <= 90) break; 
                } catch (NumberFormatException ignore) {}
                System.out.println("Entrada inválida! Digite uma idade válida!");
            }

            System.out.print("""
                    Identidade de Gênero (1 a 6):
                      1 - Mulher Cis
                      2 - Homem Cis
                      3 - Não Binário
                      4 - Mulher Trans
                      5 - Homem Trans
                      6 - Outros
                    """);

            int genero;
            while (true) {
                System.out.print("Opção: ");
                String s = leia.nextLine().trim();
                try {
                    genero = Integer.parseInt(s);
                    if (genero >= 1 && genero <= 6) break;
                } catch (NumberFormatException ignore) {}
                System.out.println("Entrada inválida! Digite um número de 1 a 6.");
            }


            System.out.print("""
                    Pessoa Desenvolvedora (número):
                      1 - Backend
                      2 - Frontend
                      3 - Mobile
                      4 - Fullstack
                    """);

            int area;
            while (true) {
                System.out.print("Opção: ");
                String s = leia.nextLine().trim();
                try {
                    area = Integer.parseInt(s);
                    if (area >= 1 && area <= 4) break;
                } catch (NumberFormatException ignore) {}
                System.out.println("Entrada inválida! Digite um número de 1 a 4.");
            }

            totalPessoas++;
            somaIdades += idade;

            switch (area) {
                case 1: 
                    tBackend++;
                    break;

                case 2: 
                    if (genero == 1 || genero == 4) {
                        tMFrontend++;
                    }
                    break;

                case 3: 
                    if (idade < 40 && (genero == 2 || genero == 5)) { 
                        tHMobilem40++;
                    }
                    break;

                case 4: 
                    if (idade > 30 && genero == 3) {
                        tNBFullstackMaior30++;
                    }
                    break;
            }


            while (true) {
                System.out.print("Deseja continuar? (S/N): ");
                String resp = leia.nextLine().trim();
                if (resp.equalsIgnoreCase("S")) { 
                    continuar = true; 
                    break; 
                }
                if (resp.equalsIgnoreCase("N")) { 
                    continuar = false; 
                    break; 
                }
                System.out.println("Entrada inválida! Responda com S ou N.");
            }

            System.out.println("-------------------------------------");
        }


        System.out.println("=========== Resultados ===========");
        System.out.println("Total de pessoas desenvolvedoras Backend: " + tBackend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + tMFrontend);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile menores de 40 anos: " + tHMobilem40);
        System.out.println("Total de Não Bináries desenvolvedores Fullstack maiores de 30 anos: " + tNBFullstackMaior30);
        System.out.println("Total de pessoas que responderam à pesquisa: " + totalPessoas);

        double mediaIdade;
        if (totalPessoas > 0) {
            mediaIdade = (double) somaIdades / totalPessoas;
        } else {
            mediaIdade = 0.0;
        }

        System.out.printf("Média de idade dos participantes: %.1f anos%n", mediaIdade);
        System.out.println("==================================");

        leia.close();
    }
}
