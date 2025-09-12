import java.util.Scanner;

public class Atividade_1 {


		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			float salario, abono;
			
			
			System.out.println("===========================");
			System.out.println("\tDigite seu salário: ");
			salario = leia.nextFloat();
			
			System.out.println("\tDigite o valor do Abono: ");
			abono = leia.nextFloat();
			
			System.out.printf("O valor total do seu salário será de:\n R$ %.2f\n", salario + abono);
			System.out.println("===========================");
			
			

		}

}
