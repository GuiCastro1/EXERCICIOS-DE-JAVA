package comandos_repeticao;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a " + i + "° nota: ");
            double num = scan.nextDouble();
            soma += num;
        }

        System.out.println("A média do seu aluno é:" + (soma/4));
    }
}
