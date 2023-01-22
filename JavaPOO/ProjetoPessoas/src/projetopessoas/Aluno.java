package projetopessoas;

public class Aluno extends Pessoa {
    // Atributos
    private String curso;
    private int mat;
    
    // Métodos
    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
    }
    
    // Métodos Especiais
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
}