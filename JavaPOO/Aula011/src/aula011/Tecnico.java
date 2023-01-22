package aula011;

public final class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar() {
        System.out.println(this.nome + " está praticando a função.");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}