package comandos_repeticao;

public class ExercicioPares {
    public static void main(String[] args) {

        for (int i = 2; i <= 200; i += 2) {
            System.out.println(i);
        }

        int x = 2;
        while (x <= 200) {
            System.out.println(x);
            x += 2;
        }


        int y = 0;
        do {

            System.out.println(y);
            y += 2;
        } while (y <= 200);

    }
}
