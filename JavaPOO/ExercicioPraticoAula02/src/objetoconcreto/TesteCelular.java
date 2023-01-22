package objetoconcreto;

/**
 *
 * @author Saul
 */
public class TesteCelular {

    public static void main(String[] args) {
        Celular lixo = new Celular();
        lixo.nome = "LG K10";
        lixo.ligado = false;
        lixo.carga = 0;
        lixo.celularStatus();
        lixo.ligar();
        lixo.carregar();
        
        System.out.println("");
        
        Celular bom = new Celular();
        bom.nome = "Redmi Note 11";
        bom.ligado = true;
        bom.carga = 100;
        bom.celularStatus();
        bom.desligar();
        bom.carregar();
    }
}