package comandos_repeticao;

import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            System.out.println("Hello World");
        }

        int x = 1;
        int im = 0;
        int pa = 0;
        do {

            System.out.println(x);
            System.out.print("Digite um número: ");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                pa++;
            } else {
                im++;
            }
            x++;
        } while (x <= 3);

        System.out.println("Você digitou " + pa + " números PARES");
        System.out.println("Você digitou " + im + " números IMPARES");


    }
}
