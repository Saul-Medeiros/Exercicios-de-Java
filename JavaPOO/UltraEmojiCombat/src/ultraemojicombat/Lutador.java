package ultraemojicombat;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    // Métodos Públicos
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    public void apresentar() {
        System.out.println("-----------------------------------------"
                + "\nCHEGOU A HORA! Apresentamos o lutador " + this.getNome()
                + "\nDiretamente de " + this.getNacionalidade()
                + "\nCom " + this.getIdade() + " anos" 
                + " e " + this.getAltura() + "m"
                + "\npesando " + this.getPeso() + "Kg"
                + "\n" + this.getVitorias() + " vitórias,"
                + "\n" + this.getDerrotas() + " derrotas e"
                + "\n" + this.getEmpates() + " empates!");
    }
    
    public void status() {
        System.out.println("====== STATUS DO LUTADOR ======\n" 
                + this.getNome() + " é um peso " + this.getCategoria()
                + "\nGanhou " + this.getVitorias() + " vezes"
                + "\nPerdeu " + this.getDerrotas() + " vezes"
                + "\nEmpatou " + this.getEmpates() + " vezes"
                + "\n===============================\n");
    }
    
    // Métodos Especiais
    public Lutador(String no, String na, int id, float al, 
            float pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);//esta linha recebe o peso e faz o calculo de categoria, sem ela, a categoria ia ficar null
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    // setter com alteração
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    /* 
    setter com pequenas alterações (recebe o peso e converte em categoria, além 
    de ser privado por causa de sua alteração automática)
    */
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}