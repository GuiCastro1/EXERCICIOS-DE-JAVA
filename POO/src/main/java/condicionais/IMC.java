package condicionais;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Informe seu peso: ");
        double peso = scan.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("VOCÊ ESTA A BAIXO DO PESO");
        } else if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.println("PESO NORMAL");
        } else if ((imc >= 25) && (imc <= 29.9)) {
            System.out.println("SOBREPESO");
        } else if ((imc >= 30) && (imc <= 34.9)) {
            System.out.println("OBESIDADE GRAU I");
        } else if ((imc >= 35) && (imc <= 39.9)) {
            System.out.println("OBESIDADE GRAU II");
        } else {
            System.out.println("OBESIDADE GRAU III");
        }


    }
}
