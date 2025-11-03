import java.util.Scanner;

public class DesafioQuatro {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        float notaUm;
        float notaDois;
        float notaTres;

        System.out.print("Insira a 1° nota:");
        notaUm = scan.nextFloat();
        System.out.print("Insira a 2° nota:");
        notaDois= scan.nextFloat();
        System.out.print("Insira a 3° nota:");
        notaTres = scan.nextFloat();
        float media = (notaUm * 2 + notaDois * 3 + notaTres * 5)/(2+3+5f);

        System.out.println("A media parcial é: "+ media);



    }
}
