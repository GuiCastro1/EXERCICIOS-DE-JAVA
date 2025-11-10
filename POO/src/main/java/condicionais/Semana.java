package condicionais;

import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("5 - Sabado");
        System.out.println("Informe o dia da semana: ");
        int num = scan.nextInt();
        String dia;
        switch (num) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default: dia = "Dia invalido";
        }

        System.out.println(dia + " Foi Selecionado!");
    }
}
