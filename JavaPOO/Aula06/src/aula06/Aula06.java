package aula06;

/**
 *
 * @author Saul
 */
public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();// liga o controle remoto
        c.maisVolume();//adiciona 5 ao volume
        c.ligarMudo();//define o volume como 0
        c.abrirMenu();//abre o menu mostrando o estado do controle remoto
        
    }
}