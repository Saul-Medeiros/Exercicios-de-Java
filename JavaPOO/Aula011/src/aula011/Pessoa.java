package aula011;

public abstract class Pessoa { // classe abstrata (não pode ser instanciada)
    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    
    // Métodos Públicos
    public final void fazerAniversario() { // não pode ser sobreposto, apenas herdada
        this.idade++; // +1 ano para idade
        System.out.println("Parabéns! Feliz Aniversário!!!");
    }

    @Override
    public String toString() {
        return "======= DADOS =======" + "\nNome: " + nome + "\nIdade: " 
                + idade + "\nSexo: " + sexo + "\n=====================";
    }

    // Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }    
}