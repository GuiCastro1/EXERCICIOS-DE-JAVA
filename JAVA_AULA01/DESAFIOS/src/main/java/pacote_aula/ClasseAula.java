package pacote_aula;

public class ClasseAula {
    boolean professor;
    boolean aluno;
    String materia;
    int horario;
    String periodo;
    String local;
    String curso;
    String tipo_aula;
    int tempo_aula;

    void iniciar() {
        if (this.aluno && this.professor) {
            System.out.println("Tem aula");
        } else {
            System.out.println("NÃO TEM AULA");
        }
    }

    void pausar() {
        if (this.horario == 4) {
            System.out.println("RECREIO");
        }
    }

    void finalizar() {
        if (this.horario == 6) {
            System.out.println("ACABOU!!!");
        }
    }

    void troca() {
        if (this.tempo_aula > 45) {
            System.out.println("TROCA DE AULA");
        }else {
            int h = 45;
            int r = h - this.tempo_aula;
            System.out.println("Faltam "+r+" minutos para trocar a aula");
        }

    }


}
