package aula013;

public final class Cachorro extends Lobo {
    @Override // Sobrepor
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    // Métodos Sobrecarregados (Sobrecarga)
    public void reagir(String frase) { // Reagir pelo que for dito ao cachorro
        if ("Toma comida".equals(frase) || "Olá".equals(frase)) {
            System.out.println("Abanar e Latir");
            this.emitirSom();
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min) { // Reagir de acordo com o horário do dia
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
            this.emitirSom();
        }
    }
    
    public void reagir (boolean dono) { // Reagir se for o dono do cachorro ou não
        if (dono) { // boolean = true
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
            this.emitirSom();
        }
    }
    
    public void reagir(int idade, float peso) { // Reagir de acordo com o peso e a idade
        if (idade < 5) { // novo
            if (peso < 10) { // leve
                System.out.println("Abanar");
            } else { // pesado
                System.out.println("Latir");
                this.emitirSom();
            }
        } else { // velho
            if (peso < 10) { // leve
                System.out.println("Rosnar");
            } else { // pesado
                System.out.println("Ignorar");
            }
        }
    }
}