package projetoyoutube;

// Classe pública que implementa a interface AcoesVideo
public class Video implements AcoesVideo {
    // Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // Método Construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1; // curtidas vai iniciar em 1
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    // Métodos Acessores e Modificadores
    @Override
    public void play() { // retoma o vídeo
        this.setReproduzindo(true);
    }

    @Override
    public void pause() { // pausa o video
        this.setReproduzindo(false);
    }

    @Override
    public void like() { // +1 curtida
        this.curtidas++;
    }

    // Converte o booleano de reproduzindo para texto
    public String reproduzindo(boolean reproduzindo) {
        String rep;
        if (reproduzindo) { // se reproduzindo for true
            rep = "vídeo está reproduzindo";
        } else { // se for false
            rep = "vídeo está pausado";
        }
        return rep; // retorna a variavel local como valor do método
    }
    
    /* 
     * Método toString para retornar as informações da classe em formato de 
     * texto
     */
    @Override
    public String toString() {
        return "\nVÍDEO: " + "\nTÍTULO: " + titulo 
                + "\nAVALIAÇÃO: " + avaliacao + "\nVIEWS: " + views 
                + "\nCURTIDAS: " + curtidas + "\nREPRODUZINDO: " 
                + reproduzindo(isReproduzindo());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int isAvaliacao() {
        return avaliacao;
    }

    // Declara a média de avaliações obtidas em um vídeo
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    // Métodos que não poderão ser chamados fora desta classe
    private boolean isReproduzindo() {
        return reproduzindo;
    }

    private void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}