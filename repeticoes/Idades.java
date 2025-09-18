package repeticoes;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, menor21 = 0, maior50 = 0;

		
		while (true) {
			System.out.println(" Digite a idade: ");
			idade = leia.nextInt();
			
			if (idade < 0) {
				break;
			}
			
			if (idade < 21) {
				menor21++;
			}else if
				(idade > 50){
					maior50 ++;
			}		
			
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + menor21);
		System.out.println("Total de pessoas com mais de 50 anos: " + maior50);

	}

}
