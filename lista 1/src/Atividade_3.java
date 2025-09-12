import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salarioB, adicional,horas, desconto, salarioL;
		
		
		System.out.println("===========================");
		System.out.println("\tDigite seu salário bruto: ");
		salarioB = leia.nextFloat();
		
		System.out.println("\tDigite o adicional noturno: ");
		adicional = leia.nextFloat();
		
		System.out.println("\tDigite as horas extras: ");
		horas = leia.nextFloat();
		
		System.out.println("\tDigite o valor total de descontos: ");
		desconto = leia.nextFloat();
		
		salarioL = (salarioB + adicional + (horas * 5)) - desconto;
		
		System.out.printf("O valor total do seu salário líquido será de:\n R$ %.2f\n", salarioL);
		
		if (salarioL >= 1518) {
			System.out.println("\t Salário acima do mínimo!");
		}else {
			System.out.println("\t Seu salário esta abaixo do mínimo! ");
		}
		
		System.out.println("===========================");

	}

}
