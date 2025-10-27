import java.util.Scanner;

public class Tabuada {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Digite um número para exibir a tabuada: ");
        x = scan.nextInt();
        int i;
        for (i = 1; i <=10; i++){
            int tabu = x * i;
//            System.out.println(tabu);
            System.out.println(i + " X " + x + " = " + tabu);

        }

    }

}
