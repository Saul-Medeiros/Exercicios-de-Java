package projetolivro;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    // Métodos
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);//o this é substituído pela classe chamadora
    }
    
    // Conversão de char para String
    public String generoPessoa() {
        String genero;
        switch (this.getSexo()) {
            case 'M':
                genero = "Masculino";
                break;
            case 'F':
                genero = "Feminino";
                break;
            default:
                genero = "Não especificado";
        }
        return genero;
    }
    
    // Métodos Especiais
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
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

    /*
    acesso privado para a classe main, mas public para as classes do mesmo 
    pacote para que a conversão seja possível
    */
    protected char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}