package aula012;

/**
 *
 * @author Saul
 */
public class Aula012 {

    public static void main(String[] args) {
        // Programa Principal
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        /*
        m.setPeso(35.3f);
        m.setCorPelo("Msrrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        */
        /*
        a.locomover(); // voando
        p.locomover(); // nadando
        r.locomover(); // rastejando
        */
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        c.locomover(); // saltando
        k.locomover(); // correndo
        k.emitirSom(); // Au Au
        c.emitirSom(); // Som de mamífero
    }
}