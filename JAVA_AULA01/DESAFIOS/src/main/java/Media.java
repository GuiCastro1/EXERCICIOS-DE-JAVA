import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = 0;
        for(int i = 1; i <=5; i++ ){
            System.out.println("Informe"+i+"º numero: ");
            int numero = scan.nextInt();
            s += numero;
        }
        int media = s / 5;
        System.out.println(media);
    }
}