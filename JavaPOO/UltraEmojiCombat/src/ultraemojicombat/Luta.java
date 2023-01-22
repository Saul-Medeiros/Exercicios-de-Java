package ultraemojicombat;

import java.util.Random;//importação da classe que randomiza números

public class Luta {// Classe agregada a Lutador
    // Atributos
    private Lutador desafiado; // tipo abstrato de dados (agregação)
    private Lutador desafiante; // tipo abstrato de dados
    private int rounds;
    private boolean aprovada;
    
    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) 
                && l1 != l2) { // se os lutadores forem da mesma categoria e não forem a mesma pessoa
            this.setAprovada(true);//luta aprovada
            this.setDesafiado(l1);//lutador 1 vai ser o desafiado
            this.setDesafiante(l2);//lutador 2 vai ser o desafiante
        } else {
            this.setAprovada(false);//luta não aprovada
            this.setDesafiado(null);//desafiado é nulo 
            this.setDesafiante(null);//desafiante é nulo
        }
    }
    
    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("\n### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();// similar ao Math.random()
            int vencedor = aleatorio.nextInt(3);// só pode gerar 3 resultados: 0 1 2
            System.out.println("\n====== RESULTADO DA LUTA ======");
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();// soma +1 empate no seu status
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Ganhou Desafiado
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta(); // desafiado soma +1 as suas vitórias
                    this.desafiante.perderLuta(); // desafiante soma +1 as suas derrotas
                    break;
                case 2: // Ganhou Desafiante
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("===============================\n");
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
    
    // Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}