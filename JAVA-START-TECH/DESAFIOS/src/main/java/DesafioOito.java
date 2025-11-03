import java.util.Scanner;

public class DesafioOito {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num;
        int ndois;
        int aux;

        System.out.print("Digite um numero:");
        num = scan.nextInt();
        System.out.print("Digite outro numero:");
        ndois = scan.nextInt();

        aux = num;
        num = ndois;
        ndois = aux;

        System.out.println("O 1° número agora é: " + num);
        System.out.println("O 2° número agora é: " + ndois);
    }
}
