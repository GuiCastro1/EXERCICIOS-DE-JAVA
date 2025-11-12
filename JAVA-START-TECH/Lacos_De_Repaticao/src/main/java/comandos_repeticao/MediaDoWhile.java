package comandos_repeticao;

import java.util.Scanner;

public class MediaDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        int i = 1;
        do {
            System.out.print("Digite a " + i + "° nota: ");
            double num = scan.nextDouble();
            soma += num;
            i++;
        } while (i <= 4);
        double resultado = soma / 4;
        System.out.println("A média do seu aluno é:" +(soma/4));
    }
}
