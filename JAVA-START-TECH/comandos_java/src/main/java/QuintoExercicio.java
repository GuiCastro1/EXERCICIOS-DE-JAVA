import java.util.Scanner;

public class QuintoExercicio {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        float num;
        float ndois;
        float ntres;
        float nquatro;

        System.out.print("Digite a PRIMEIRA nota:");
        num = scan.nextFloat();
        System.out.print("Digite a SEGUNDA nota:");
        ndois = scan.nextFloat();
        System.out.print("Digite a TERCEIRA nota:");
        ntres = scan.nextFloat();
        System.out.print("Digite a QUARTA nota:");
        nquatro = scan.nextFloat();

        float media = (num + ndois + ntres + nquatro) / 4;
        System.out.println("Sua media e: " +media);

        if(media >= 6){
            System.out.println("Você foi aprovado!");
        } else if (media>=5) {
            System.out.println("Você está de recuperção!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}