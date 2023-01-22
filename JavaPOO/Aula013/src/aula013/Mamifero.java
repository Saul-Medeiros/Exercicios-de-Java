package aula013;

public class Mamifero extends Animal {
    // Atributos
    protected String corPelo;

    // Métodos
    @Override //Sobrepor
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    // Métodos Especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}