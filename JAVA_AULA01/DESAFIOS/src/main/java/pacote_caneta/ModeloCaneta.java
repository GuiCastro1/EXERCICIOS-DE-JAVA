package pacote_caneta;

import java.awt.*;

public class ModeloCaneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;

    void rabiscar() {

        if (this.tampa || this.carga < 1) {
            System.out.println("A caneta esta tampada, ERRO AO RABISCAR");
        } else {
            System.out.println("A caneta esta destampada, SUCESSO AO RABISCAR");
        }
    }

    void desenhar(){
        if (this.tampa || this.carga < 1) {
            System.out.println("A caneta esta tampada, ERRO AO RABISCAR");
        } else {
            System.out.println("Monalisa");
        }
    }

    void tampar() {
        this.tampa = true;
    }

    void destampar() {
        this.tampa = false;
    }

    void estado() {
        System.out.println("Esta caneta é do modelo: " + this.modelo);
        System.out.println("Esta caneta temcor: " + this.cor);
        System.out.println("Esta caneta número da ponta: " + this.ponta);
        System.out.println("Esta caneta tem: " + this.carga + "% de carga");
        System.out.println("Esta caneta esta: " + this.tampa);
    }
}
