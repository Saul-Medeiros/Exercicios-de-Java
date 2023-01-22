package aula011;

public final class Professor extends Pessoa { // classe final (folha) não pode ter herdeiros e herda de Pessoa
    // Atributos
    private String especialidade;
    private float salario;
    
    // Métodos
    public void receberAumento(float aumento) {
        System.out.println("Foi feito um aumento de " + aumento + " no salário de " + this.nome);
        this.salario += aumento; //acrescenta o aumento e atualiza o salário
    }
    
    // Métodos Especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}