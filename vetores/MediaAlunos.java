package vetores;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaAlunos {
	private static final int alunos= 10;     
    private static final int bimestre = 4;   

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[][] notas = new double[alunos][bimestre]; 
        double[] medias = new double[alunos]; 

        System.out.println("Digite as notas (0 a 10) de " + alunos + " alunos em " + bimestre + " bimestres.");

 
        for (int linha = 0; linha < alunos; linha++) {
            System.out.println("\nAluno " + (linha + 1) + ":");
            for (int coluna = 0; coluna < bimestre; coluna++) {
                while (true) {
                    System.out.print("Bimestre " + (coluna + 1) + ": ");
                    if (leia.hasNextDouble()) {
                        double valor = leia.nextDouble();
                        if (valor >= 0.0 && valor <= 10.0) {
                            notas[linha][coluna] = valor;
                            break;
                        } else {
                            System.out.println("Nota inválida! Digite entre 0 e 10.");
                        }
                    } else {
                        System.out.println("Entrada inválida! Digite um número.");
                        leia.next(); 
                    }
                }
            }
        }


        for (int linha = 0; linha < alunos; linha++) {
            double soma = 0.0;
            for (int coluna = 0; coluna < bimestre; coluna++) {
                soma += notas[linha][coluna];
            }
            medias[linha] = soma / bimestre;
        }


        DecimalFormat df = new DecimalFormat("0.0");
        df.setRoundingMode(RoundingMode.HALF_UP);


        System.out.println("\nNotas:");
        for (int linha = 0; linha < alunos; linha++) {
            System.out.print("Aluno " + (linha + 1) + ": ");
            for (int coluna = 0; coluna < bimestre; coluna++) {
                System.out.print(df.format(notas[linha][coluna]));
                if (coluna < bimestre - 1) {
                    System.out.print(", "); 
                }
            }
            System.out.println();
        }




        double maior = medias[0], menor = medias[0];
        int alunoMaior = 0, alunoMenor = 0;

        for (int linha = 1; linha < alunos; linha++) {
            if (medias[linha] > maior) {
                maior = medias[linha];
                alunoMaior = linha;
            }
            if (medias[linha] < menor) {
                menor = medias[linha];
                alunoMenor = linha;
            }
        }

        System.out.println("\nAluno com maior média: Aluno " + (alunoMaior + 1) + " = " + df.format(maior));
        System.out.println("Aluno com menor média: Aluno " + (alunoMenor + 1) + " = " + df.format(menor));

        leia.close();
    }
}


