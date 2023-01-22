package aula013;

/**
 *
 * @author Saul
 */
public class Aula013 {

    public static void main(String[] args) {
        // Programa Principal
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");            // Abanar e latir
        c.reagir("Vai apanhar");    // Rosnar
        c.reagir(11, 45);           // Abanar
        c.reagir(21, 00);           // Ignorar
        c.reagir(true);             // Abanar
        c.reagir(false);            // Rosnar e Latir
        c.reagir(2, 12.5f);         // Latir
        c.reagir(17, 4.5f);         // Rosnar
    }
}