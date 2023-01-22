package projetoyoutube;

public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // Jubileu assiste HTML
        vis[0].avaliar();
        System.out.println(vis[0]);
        System.out.println("");
        vis[1] = new Visualizacao(g[0], v[1]); // Jubileu assiste PHP
        vis[1].avaliar(87.0f);
        System.out.println(vis[1]);
        
        /*
        System.out.println("========== VÍDEOS ==========");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println("\n======== GAFANHOTOS ========");
        System.out.println(g[0]);
        System.out.println(g[1]);
        */
    }
}