package condicionais;

import java.util.Scanner;

public class CondicionaisDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe sua Idade:");
        int idade = scan.nextInt();
        if (idade < 16) {
            System.out.println("NÃO PODE VOTAR!");
        } else if ((idade >= 16) && (idade < 18)) {
            System.out.println("OPICIONAL!");
        } else if ((idade >= 18) && (idade < 70)) {
            System.out.println("OBRIGATORIO!");
        } else {
            System.out.println("NÃO PRECISA, POREM NÃO CUSTA NADA");
        }
    }
}
