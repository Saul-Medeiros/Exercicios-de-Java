package objetoconcreto;

public class Celular {
    int carga;
    boolean ligado;
    String nome;
    
    void celularStatus() {
        System.out.println("Nome do celular: " + this.nome);
        System.out.println("Está ligado? " + this.ligado);
        System.out.println("Qual a porcentagem da bateria? " + this.carga);
    }
    
    void carregar() {
        if (this.carga == 0) {
            System.out.println("Tenho que carregar o meu celular");
        } else {
            System.out.println("Celular disponível para uso!");
        }
    }
    
    void ligar() {
        if (this.ligado == true) {
            System.out.println("Celular já está ligado");
        } else {
            System.out.println("Ligando o celular");
            this.ligado = true;
        }
    }
    
    void desligar() {
        if (this.ligado == false) {
            System.out.println("Celular está desligado");
        } else {
            System.out.println("Desligando o celular");
            this.ligado = false;
        }
    }
}