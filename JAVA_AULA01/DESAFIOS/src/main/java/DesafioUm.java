import java.util.Scanner;

public class DesafioUm {
    public static void main(String [] args){

    Scanner scan = new Scanner(System.in);
    int um;
    int dois;

    System.out.print("Digite o PRIMEIRO número:");
    um = scan.nextInt();

    System.out.print("Digite o SEGUNDO número:");
    dois = scan.nextInt();

    int soma = um + dois;
    int sub = um - dois;
    int div = um / dois;
    int mult = um * dois;

    System.out.println("A SOMA de " +um+ "+" +dois+ " = " + soma);
    System.out.println("A SUBTRAÇÃO de " +um+ " - " +dois+ " = " + sub);
    System.out.println("A DIVSÃO de " +um+ " / " +dois+ " = " + div);
    System.out.println("A MULTIPLICAÇÃO de " +um+ " X " +dois+ " = " + mult);
    }
}
