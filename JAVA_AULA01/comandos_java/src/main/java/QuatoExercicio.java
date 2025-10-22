import java.util.Scanner;

public class QuatoExercicio {
    public static void main(String [] args) {


        float peso;
        float altura;
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual seu peso: ");
        peso = scan.nextFloat();

        System.out.print("Qual sua altura:");
        altura = scan.nextFloat();

        float imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magro de Ruim");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso Ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obeso nilvel 1");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obeso nilvel 2");
        } else {
            System.out.println("Obesidade mórbida");
        }

//        if (imc < 18.5) {
//            System.out.println("Magro de Ruim");
//        }
//        if (imc >= 18.6 && imc <= 24.9) {
//            System.out.println("Peso Ideal");
//        }
//        if (imc >= 25.0 && imc <= 29.9) {
//            System.out.println("Levemente acima do peso");
//        }
//        if (imc >= 30 && imc <= 34.9) {
//            System.out.println("Obeso nilvel 1");
//        }
//        if (imc >= 35.0 && imc <= 39.9) {
//            System.out.println("Obeso nilvel 2");
//        }
//        if(imc > 40.0){
//            System.out.println("Obesidade mórbida");
//        }

    }
}
