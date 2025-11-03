import java.util.Scanner;

public class DesafioCinco {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int unidade;
        float preco;

        System.out.print("Informe o preço do produto:");
        preco = scan.nextFloat();
        System.out.print("Quantas unidades:");
        unidade = scan.nextInt();
        float total = unidade * preco;

        if (unidade >= 10){
            float desconto = total - ((total * 10) / 100);
            float valorDesconto = total - desconto;
            System.out.println("Total:" + total);
            System.out.println("Valor do Desconto:" + valorDesconto );
            System.out.println("O valor final:" + desconto );

        }else {
            System.out.println("O valor total da sua compra foi:" + total );
        }
    }
}
