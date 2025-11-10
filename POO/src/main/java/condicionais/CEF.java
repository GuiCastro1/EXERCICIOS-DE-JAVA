package condicionais;

import java.util.Scanner;

public class CEF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int saldo = scan.nextInt();
        int resultado;
        int taxa;

        if ((saldo > 0) && (saldo <= 500)) {
            taxa = 0;
        } else if ((saldo >= 501) && (saldo <= 1000)) {
            taxa = 30;
        } else if ((saldo >= 1001) && (saldo <= 3000)) {
            taxa = 40;
        } else {
            taxa = 50;
        }
    }
}
