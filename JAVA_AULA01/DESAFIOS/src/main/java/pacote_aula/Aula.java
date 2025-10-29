package pacote_aula;

public class Aula {
    public static void main(String[] args) {
        ClasseAula au = new ClasseAula();
        au.professor = true;
        au.aluno = true;
        au.materia = "História";
        au.horario =6;
        au.periodo = "Tarde";
        au.local = "Sala 5";
        au.curso = "Back-end Java";
        au.tipo_aula = "Presencial";
        au.tempo_aula = 46;


        au.iniciar();
        au.pausar();
        au.finalizar();
        au.troca();
    }
}
