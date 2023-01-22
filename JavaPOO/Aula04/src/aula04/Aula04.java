package aula04;

/**
 *
 * @author Saul
 */
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Faber Castell", "Amarelo", 0.4f);
        /*
        c1.setModelo("BIC");
        //c1.modelo = "BIC";//consegue alterar pois o acesso está público em Caneta
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;//não consegue alterar pois o acesso está privado em Caneta
        
        System.out.println("Tenho uma caneta " + c1.modelo + " de ponta " 
                + c1.getPonta());
        */
        c1.status();
        
        System.out.println("");
        
        Caneta c2 = new Caneta("BIC", "Laranja", 1.5f);
        c2.status();
    }
}