import java.util.Scanner;

public class DesafioTres {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        float base;
        float altura;

        System.out.print("Digite o valor da base:");
        base = scan.nextFloat();

        System.out.print("Digite o valor da base:");
        altura = scan.nextFloat();

        float area = (base * altura) / 2;

        System.out.println("A area do seu triângulo e de: " + area);
    }
}
