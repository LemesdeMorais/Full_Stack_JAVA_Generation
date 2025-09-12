import java.util.Locale;
import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.US);
		
		float n1, n2,n3,n4, dif1,dif2;
		
		
		System.out.println("===========================");
		System.out.print("\tDigite o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println(n1);
		
		System.out.print("\tDigite o segundo número: ");
		n2 = leia.nextFloat();
		System.out.println(n2);
		
		System.out.print("\tDigite o terceiro número: ");
		n3 = leia.nextFloat();
		System.out.println(n3);

		System.out.print("\tDigite o quarto número: ");
		n4 = leia.nextFloat();
		System.out.println(n4);
		
		dif1 = (n1 * n2);
		dif2 = (n3 * n4);
		System.out.printf("\tA primeira diferença é: %.1f\n", dif1);
		System.out.printf("\tA segunda diferença é: %.1f\n", dif2);
		System.out.printf("\tO valor da subtração das diferenças é: %.1f\n", dif1 - dif2);
		System.out.println("===========================");

	}

}
