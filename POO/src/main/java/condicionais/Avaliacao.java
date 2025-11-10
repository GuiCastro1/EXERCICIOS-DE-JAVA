package condicionais;

import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Péssimo!");
        System.out.println("2 - Ruim, Não recomendo!");
        System.out.println("3 - Legalzinho");
        System.out.println("4 - Muito bom!, Assistiria de novo!");
        System.out.println("5 - Excelente! Recomendo!");
        System.out.print("Informe a nota de 1 a 5 ⭐:");
        int avalicacao = scan.nextInt();
        String parametro;
        switch (avalicacao) {
            case 1:
                parametro = "Péssimo!";
                break;
            case 2:
                parametro = "Ruim, Não recomendo!";
                break;
            case 3:
                parametro = "Legalzinho";
                break;
            case 4:
                parametro = "Muito bom!, Assistiria de novo!";
                break;
            case 5:
                parametro = "Excelente! Recomendo!";
                break;
            default:
                parametro = "Nota inválida";
        }
        System.out.println(parametro);
    }
}
