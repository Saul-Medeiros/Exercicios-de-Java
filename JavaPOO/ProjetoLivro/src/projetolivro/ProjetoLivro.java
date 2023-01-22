package projetolivro;

/**
 *
 * @author Saul
 */
public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2]; // 0 1
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, 'M');
        p[1] = new Pessoa("Maria", 25, 'F');
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(100); //folheia para a página 100
        l[0].avancarPag(); //avança 1 página a partir da atual
        System.out.println(l[0].detalhes()); // detalha o primeiro livro
        System.out.println("");
        System.out.println(l[1].detalhes()); // detalha o segundo livro
    }
}