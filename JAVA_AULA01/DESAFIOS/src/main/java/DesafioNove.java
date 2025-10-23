import java.util.Scanner;

public class DesafioNove {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        float deposito;
        System.out.println("Insira o valor do deposito: ");
        deposito = scan.nextFloat();
        float taxa = (deposito * 5)/100;
        float valorNovo = deposito + taxa;
        System.out.println("");
    }
}
