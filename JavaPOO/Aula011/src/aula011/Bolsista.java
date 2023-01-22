package aula011;

public final class Bolsista extends Aluno { // Herda tudo que for de Aluno (inclusive o que Aluno tenha herdado)
    // Atributos
    private float bolsa;
    
    // Métodos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    @Override // @Sobrepor
    public void pagarMensalidade() { // Sobrescreve método da classe herdada (polimorfismo)
        System.out.println(this.nome + " é bolsista! Pagamento facilitado");
    }
    
    // Métodos Especiais
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}