package exercicio.teoria;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void abrirConta() {
        this.status = true;
        if (this.tipo.equals("cc")) {
            this.saldo += 50;//se for conta corrente é adicionado 50 reais ao saldo da conta
        } else if (this.tipo.equals("cp")) {
            this.saldo += 150;//se for conta poupança é adicionado 150 reais ao saldo da conta
        }
    }
    
    public void fecharConta() {
        if (this.status == true) {//se a conta estiver aberta
            if (this.saldo == 0) {//se o saldo for igual a 0
                this.status = false;
            } else if (this.saldo >0) {//se o saldo for maior que 0
                System.out.println("Não foi possível fechar a sua conta pois "
                        + "ainda existe saldo na mesma.");
            } else {//se o saldo for menor que 0
                System.out.println("Não foi possível fechar a sua conta pois "
                        + "há pendências na mesma.");
            }
        } else {//se a conta estiver fechada
            System.out.println("Sua conta já está fechada");
        }
    }
    
    public void depositar(float deposito) {
        if (this.status == true) {//se a conta estiver aberta
            this.saldo += deposito;//soma o valor de deposito ao saldo da conta
            System.out.println("Foi feito um depósito de: " + deposito);
        } else {//se a conta estiver fechada
            System.out.println("Não foi possível fazer um depósito pois a sua "
                    + "conta está fechada.");
        }
    }
    
    public void sacar(float saque) {
        if (this.status == true) {//se a conta estiver aberta
            if (this.saldo > 0) {//se o saldo for maior que 0
                if (this.saldo >= saque) {//se o saldo for maior ou igual ao saque
                    this.saldo -= saque;//subtrai o saque do saldo atual
                    System.out.println("Foi feito um saque de: " + saque);
                } else {//se o saldo for menor que o saque
                    System.out.println("Não é possível sacar pois o "
                            + "saque desejado é maior que o seu saldo.");
                }
            } else if (this.saldo==0) {//se o saldo for nulo
                System.out.println("Não é possível sacar pois você está com o "
                        + "saldo zerado.");
            } else {//se o saldo for menor que 0
                System.out.println("Não é possível sacar pois há pendências em "
                        + "sua conta.");
            }
        } else {//se a conta estiver fechada
            System.out.println("Não é possível sacar pois você não possui uma "
                    + "conta aberta.");
        }
    }
    
    public void pagarMensal() {
        if (this.tipo.equals("cc")) {//se o tipo da conta for "conta corrente"
            this.saldo -= 12;//tira 12 reais do saldo atual
        } else if (this.tipo.equals("cp")){//se o tipo da conta for "conta poupança"
            this.saldo -= 20;//tira 20 reais do saldo atual 
        }
    }
    
    /*mostra os dados da conta do usuário*/
    public void statusConta() {
        System.out.println("DADOS DA CONTA:\nNúmero da Conta: "
                + this.getNumConta() + "\nDono: " + this.getDono() 
                + "\nTipo: " + this.tipoConta(this.tipo) + "\nSaldo: " 
                + this.getSaldo() + "\nStatus: " + this.isStatus());
    }

    //converte o caractere informado para o tipo da conta
    public String tipoConta(String tipo) {
        String nomeConta = "";
        if (tipo.equals("cc")) {
            nomeConta = "Conta Corrente";
        } else if (tipo.equals("cp")) {
            nomeConta = "Conta Poupança";
        }
        return nomeConta;
    }
    
    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}