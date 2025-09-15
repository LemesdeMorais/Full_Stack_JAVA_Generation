package condicionais;

import java.util.Scanner;

public class TipoAnimal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String palavra1, palavra2, palavra3;
        String animal = "";

        System.out.println("\t===========================================");


        while (true) {
            System.out.print("\t| Escolha uma palavra 'vertebrado' ou 'invertebrado': ");
            palavra1 = leia.nextLine().trim().toLowerCase();
            if (palavra1.equalsIgnoreCase("vertebrado") || palavra1.equalsIgnoreCase("invertebrado")) {
                break;
            }
            System.out.println("\t| Entrada inválida, escolha apenas 'vertebrado' ou 'invertebrado'.");
        }


        if (palavra1.equalsIgnoreCase("vertebrado")) {
            while (true) {
                System.out.print("\t| Escolha uma palavra (ave / mamifero): ");
                palavra2 = leia.nextLine().trim().toLowerCase();
                if (palavra2.equalsIgnoreCase("ave") || palavra2.equalsIgnoreCase("mamifero")) {
                    break;
                }
                System.out.println("\t| Entrada inválida, escolha apenas 'ave' ou 'mamifero'.");
            }


            if (palavra2.equalsIgnoreCase("ave")) {
                while (true) {
                    System.out.print("\t| Escolha uma palavra (carnivoro / onivoro): ");
                    palavra3 = leia.nextLine().trim().toLowerCase();
                    if (palavra3.equalsIgnoreCase("carnivoro")) { animal = "Águia"; break; }
                    if (palavra3.equalsIgnoreCase("onivoro"))   { animal = "Pomba"; break; }
                    System.out.println("\t| Entrada inválida, escolha apenas 'carnivoro' ou 'onivoro'.");
                }
            } else { 
                while (true) {
                    System.out.print("\t| Escolha uma palavra (onivoro / herbivoro): ");
                    palavra3 = leia.nextLine().trim().toLowerCase();
                    if (palavra3.equalsIgnoreCase("onivoro"))   { animal = "Homem"; break; }
                    if (palavra3.equalsIgnoreCase("herbivoro")) { animal = "Vaca";  break; }
                    System.out.println("\t| Entrada inválida, escolha apenas 'onivoro' ou 'herbivoro'.");
                }
            }

        } else { 
            while (true) {
                System.out.print("\t| Escolha uma palavra (inseto / anelideo): ");
                palavra2 = leia.nextLine().trim().toLowerCase();
                if (palavra2.equalsIgnoreCase("inseto") || palavra2.equalsIgnoreCase("anelideo")) {
                    break;
                }
                System.out.println("\t| Entrada inválida, escolha apenas 'inseto' ou 'anelideo'.");
            }

            if (palavra2.equalsIgnoreCase("inseto")) {
                while (true) {
                    System.out.print("\t| Escolha uma palavra (hematofago / herbivoro): ");
                    palavra3 = leia.nextLine().trim().toLowerCase();
                    if (palavra3.equalsIgnoreCase("hematofago")) { animal = "Pulga";   break; }
                    if (palavra3.equalsIgnoreCase("herbivoro"))   { animal = "Lagarta"; break; }
                    System.out.println("\t| Entrada inválida, escolha apenas 'hematofago' ou 'herbivoro'.");
                }
            } else {
                while (true) {
                    System.out.print("\t| Escolha uma palavra (hematofago / onivoro): ");
                    palavra3 = leia.nextLine().trim().toLowerCase();
                    if (palavra3.equalsIgnoreCase("hematofago")) { animal = "Sanguessuga"; break; }
                    if (palavra3.equalsIgnoreCase("onivoro"))    { animal = "Minhoca";     break; }
                    System.out.println("\t| Entrada inválida, escolha apenas 'hematofago' ou 'onivoro'.");
                }
            }
        }

        System.out.println("\t===========================================");
        System.out.println("\t| Animal escolhido: " + animal);
        System.out.println("\t===========================================");

        leia.close();
    }
}
