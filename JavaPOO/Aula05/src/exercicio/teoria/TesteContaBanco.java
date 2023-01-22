package exercicio.teoria;

/**
 *
 * @author Saul
 * 
 * atividade independente
 */
public class TesteContaBanco {

    public static void main(String[] args) {
        ContaBanco cc = new ContaBanco();
        cc.setNumConta(1);//muda o número da conta
        cc.setTipo("cc");//escolhe o tipo de conta
        cc.abrirConta();//escolhe se quer abrir ou fechar conta
        cc.setDono("Saul");//nome do dono dessa conta
        cc.depositar(100);//quanto será adicionado a conta
        cc.pagarMensal();//taxa de pagamento mensal
        cc.statusConta();//mostra status da conta
        
        System.out.println("");
        
        ContaBanco cp = new ContaBanco();
        cp.setNumConta(2);
        cp.setTipo("cp");
        cp.fecharConta();
        cp.setDono("Glauder");
        cp.sacar(20);
        cc.pagarMensal();
        cp.statusConta();
    }
}