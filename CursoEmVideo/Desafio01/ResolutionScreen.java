
import java.awt.Dimension;
import java.awt.Toolkit;

public class  ResolutionScreen {
    public static void main(String[] args) {
        Toolkit tolk = Toolkit.getDefaultToolkit();
        Dimension screen = tolk.getScreenSize();

        System.out.println(tolk);
        System.out.println(tolk.getScreenSize());
        System.out.println("Largura " + screen.width);
        System.out.println("Altura " + screen.height);

    }
}