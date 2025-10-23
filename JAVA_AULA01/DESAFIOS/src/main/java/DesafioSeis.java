import java.util.Scanner;

public class DesafioSeis {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Digite um número: ");
        num = scan.nextInt();
        if (num % 2 == 0){
        System.out.print(num +" Par");

        }else {

        System.out.print(num+" Impar");
        }
    }
}
