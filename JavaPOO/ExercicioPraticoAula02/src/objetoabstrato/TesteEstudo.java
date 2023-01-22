package objetoabstrato;

/**
 *
 * @author Saul
 */
public class TesteEstudo {

    public static void main(String[] args) {
        Estudo preguicoso = new Estudo();
        preguicoso.estudando = false;
        preguicoso.aula = "Nenhum";
        preguicoso.duração();
        preguicoso.statusEstudo();
        
        System.out.println("");
        
        Estudo proativo = new Estudo();
        proativo.estudando = true;
        proativo.aula = "Programação Orientada a Objetos em Java";
        proativo.duração();
        proativo.statusEstudo();
        
    }
}