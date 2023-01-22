package projetopessoas;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    // Métodos
    public void fazerAniversario() {
        this.idade++; // adiciona +1 a idade
    }

    @Override
    public String toString() {
        return "===== INFORMAÇÕES DA PESSOA =====" 
                + "\nNome: " + nome + ",\nIdade: " + idade 
                + "\nSexo: " + informarGenero();
    }
    
    public String informarGenero() {
        String genero;
        switch (this.getSexo()) {
            case 'M':
                genero = "Masculino";
                break;
            case 'F':
                genero = "Feminino";
                break;
            default:
                genero = "Não Especificado";
        }
        return genero;
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

    private char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}