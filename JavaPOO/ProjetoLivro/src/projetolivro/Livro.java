package projetolivro;

public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // agregação
    
    // Métodos
    public String detalhes() {
        return ("======== DADOS DO LIVRO ========"
                + "\nTítulo: " + titulo + "\nAutor: " + autor 
                + "\nO livro possui " + totPaginas + " páginas e "
                + "\nvocê está atualmente na página " + pagAtual 
                + "\nO livro se encontra " + statusLivro(aberto) 
                + ".\n======== DADOS DO LEITOR ======="
                + "\nNome: " + leitor.getNome() 
                + "\nIdade: " + leitor.getIdade() 
                + "\nSexo: " + leitor.generoPessoa() 
                + "\n================================");
    }
    
    // Método para informar se o livro está aberto ou fechado
    public String statusLivro(boolean OorC) {
        String statusL;
        if (OorC) {
            statusL = "aberto";
        } else {
            statusL = "fechado";
        }
        return statusL;
    }

    //Métodos Especiais
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false; // livro vai iniciar fechado
        this.pagAtual = 0; // página vai iniciar em 0
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Métodos implementados da Interface
    @Override
    public void abrir() {
        if (!(this.isAberto())) {
            System.out.println("Livro já está aberto!");
        } else {
        this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            System.out.println("Livro já está fechado");
        } else {
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(int p) { // ir para a página desejada
        if (p > (this.getTotPaginas())) { // se folhear para uma página que não exista
            this.setPagAtual(0);
        } else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        if (this.getTotPaginas() >= (this.getPagAtual() + 1)) { // se a pagina atual for menor ou igual ao total de páginas
            this.setPagAtual(this.getPagAtual() + 1); // soma +1 a página atual
        } else { // se a página atual for maior qu o total de páginas
            System.out.println("Parabéns, você chegou ao final do livro!");
            this.setPagAtual(0);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() > 0) { // se a página atual for maior que 0
            this.setPagAtual(this.getPagAtual() - 1);
        } else { // se a página atual for igual a 0
            System.out.println("Você está no início do livro!");
            this.setPagAtual(0);
        }
    }    
}