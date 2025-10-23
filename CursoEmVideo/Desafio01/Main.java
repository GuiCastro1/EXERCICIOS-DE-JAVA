
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("===DESAFIO01===");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome");
            
            String name = scanner.next();
            
            System.out.println("Seja bem vindo ao Java " + name);
            System.out.println("End Program!");
        }
    }

}
