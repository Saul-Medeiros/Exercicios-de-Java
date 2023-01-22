package objetoabstrato;

public class Estudo {
    int duracaoMinutos;
    boolean estudando;
    String aula;
    
    void statusEstudo() {
        System.out.println("Conteúdo do estudo: " + this.aula);
        System.out.println("Estou estudando? " + this.estudando);
        System.out.println("Qual a duração do estudo (em minutos)? " + this.duracaoMinutos);
    }
    
    void duração() {
        if (this.estudando == true) {
            this.duracaoMinutos = 60;
            System.out.println("Duração de estudo leva em média 1 hora");
        } else {
            this.duracaoMinutos = 0;
            this.aula = null;
            System.out.println("Não estou vendo nenhuma aula no momento");
        }
    }
}