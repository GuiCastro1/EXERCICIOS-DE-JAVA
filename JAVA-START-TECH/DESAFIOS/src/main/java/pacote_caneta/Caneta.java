package pacote_caneta;

public class Caneta {
    public static void main(String[] args) {
        ModeloCaneta caneta = new ModeloCaneta();

        caneta.modelo = "Bic";
        caneta.cor = "Azul";
        caneta.ponta = 0.7f;
        caneta.carga = 10;
        caneta.tampa = true;


        caneta.destampar();
        caneta.rabiscar();
        caneta.desenhar();
        caneta.tampar();
        caneta.rabiscar();
        caneta.desenhar();
        caneta.estado();


    }
}
