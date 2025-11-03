import java.util.Scanner;

public class DesafioSete {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double salario;
        System.out.print("Informe seu salario: ");
        salario = scan.nextDouble();

        double taxa = (salario * 5) / 100;

        System.out.println("Sua comissão com base no salario é:" + taxa);
        double novoS = taxa+ salario;
        System.out.println("Salario final:" + novoS);

    }
}
