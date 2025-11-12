package comandos_repeticao;

import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int impar = 0;
//        int par = 0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            System.out.print("Digite um número: ");
//            int num = scan.nextInt();
//            if (num % 2 == 0) {
//                par++;
//            } else {
//                impar++;
//            }
//        }
//        System.out.println("Você digitou " + par + " números PARES");
//        System.out.println("Você digitou " + impar + " números IMPARES");

        int x = 1;
        int im = 0;
        int pa = 0;
        while (x <= 10) {
            System.out.println(x);
            System.out.print("Digite um número: ");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                pa++;
            } else {
                im++;
            }
            x++;
        }
        System.out.println("Você digitou " + pa + " números PARES");
        System.out.println("Você digitou " + im + " números IMPARES");
    }
}
