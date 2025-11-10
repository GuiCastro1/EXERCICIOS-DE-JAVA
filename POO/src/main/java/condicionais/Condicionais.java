package condicionais;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        int um;
        int dois;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        um = scan.nextInt();

        System.out.print("Digite um número: ");
        dois = scan.nextInt();

        if (um > dois) {
            System.out.println("A variavel UM é maior " + um);
        } else if (um == dois) {
            System.out.println("Os dois números são iguais: " + um + " " + dois);
        } else {
            System.out.println("A variavel DOIS é maior " + dois);

        }
    }
}