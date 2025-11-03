import java.util.Scanner;

public class DesafioDois {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        float raio;

        System.out.print("Informe o valor do Raio");
        raio = scan.nextFloat();

        float area = (raio * raio) * 3.1416f;
        float perimetro =  (2 * 3.1416f * raio);

        System.out.println("A area do raio é:" + area);
        System.out.println("O perímetro do raio é:" + perimetro);

    }
}
