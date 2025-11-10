package condicionais;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " PAR!");
        }else {

            System.out.println(num + " IM " +
                    "PAR!");
        }
    }
}
