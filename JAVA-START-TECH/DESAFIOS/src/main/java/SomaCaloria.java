import java.util.Scanner;

public class SomaCaloria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1-vegetariano");
        System.out.println("2-peixe");
        System.out.println("3-frango");
        System.out.println("4-carne");
        System.out.print("Digite o número do prato: ");
        int prato = scan.nextInt();

//        https://www.figma.com/design/th7jOAUqIo2gtpR3PdStL8/VOUVI?node-id=31-2&p=f&t=LBmnRey7E0fw5ZHd-0

        switch (prato) {
            case 1:
                prato = 180;
                System.out.println("Calorias do prato: " + prato);
                break;
            case 2:
                prato = 230;
                System.out.println("Calorias do prato: " + prato);
                break;
            case 3:
                prato = 250;
                System.out.println("Calorias do prato: " + prato);
                break;
            case 4:
                prato = 350;
                System.out.println("Calorias do prato: " + prato);
                break;
            default:
        }

        System.out.println("1-abacaxi");
        System.out.println("2-sorvete");
        System.out.println("3-mouse");
        System.out.println("4-mouseDeChocolate");
        System.out.print("Digite o número da sobremesa: ");
        int sobremesa = scan.nextInt();
        switch (sobremesa) {
            case 1:
                sobremesa = 75;
                System.out.println("Calorias da sobremesa: " + sobremesa);
                break;
            case 2:
                sobremesa = 110;
                System.out.println("Calorias da sobremesa: " + sobremesa);
                break;
            case 3:
                sobremesa = 170;
                System.out.println("Calorias da sobremesa: " + sobremesa);
                break;
            case 4:
                sobremesa = 200;
                System.out.println("Calorias da sobremesa: " + sobremesa);
                break;
            default:
        }

        System.out.println("1-cha");
        System.out.println("2-suco");
        System.out.println("3-SucoDeUva");
        System.out.println("4-refri");
        System.out.print("Digite o número da bebida: ");
        int bebida = scan.nextInt();

        switch (bebida) {
            case 1:
                bebida = 20;
                System.out.println("Calorias da bebida: " + bebida);
                break;
            case 2:
                bebida = 70;
                System.out.println("Calorias da bebida: " + bebida);
                break;
            case 3:
                bebida = 100;
                System.out.println("Calorias da bebida: " + bebida);
                break;
            case 4:
                bebida = 65;
                System.out.println("Calorias da bebida: " + bebida);
                break;
            default:
        }
        int resultado = bebida + sobremesa + prato;
        System.out.println("Você consumiu: " + resultado);
    }
}
