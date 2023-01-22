package aula06;

public class ControleRemoto implements Controlador {//implemento de interface na classe java
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos Especiais
    public ControleRemoto() {//definição inicial do controle remoto
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }
    
    // Métodos acessores e modificadores não podem ser acessados fora da classe
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos Abstratos da Interface

    @Override
    public void ligar() {
        /*
        quando o controle ligar o volume vai ser 50, se já estiver ligado ele 
        não fará alterações
        */
        if (!(this.isLigado())) {
            this.setLigado(true);
            this.setVolume(50);
        }    
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("----- MENU -----");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 10; i <= this.getVolume(); i+=10) {
                System.out.print("|");
            }
            System.out.println("");
        } else {
            System.out.println("Controle Remoto está desligado, impossível "
                    + "mostrar menu");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {//se ligado for true e não tocando (tocando = false)
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }
}