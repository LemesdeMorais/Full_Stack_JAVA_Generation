import java.util.Locale;
import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.US);
		
		float n1, n2,n3,n4, media;
		
		
		System.out.println("===========================");
		System.out.print("\tDigite a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println(n1);
		
		System.out.print("\tDigite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println(n2);
		
		System.out.print("\tDigite a primeira nota: ");
		n3 = leia.nextFloat();
		System.out.println(n3);

		System.out.print("\tDigite a primeira nota: ");
		n4 = leia.nextFloat();
		System.out.println(n4);
		
		media = (n1 + n2 + n3+ n4)/4;
		System.out.printf("\tA média final é: %.1f\n", media);
		
		if (media >= 6) {
			System.out.println("\t PARABÉNS! Você foi APROVADA! ✅");
		}else {
			System.out.println("\t Não foi dessa vez. Mas não desista! ");
		}
		
		System.out.println("===========================");

	}

}
