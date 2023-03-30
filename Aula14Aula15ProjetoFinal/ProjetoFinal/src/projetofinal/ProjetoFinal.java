package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        Video[] v = new Video[2];
        v[0] = new Video("Aula 01 - POO");
        v[1] = new Video("Aula 02 - Exercicio POO");
        
        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        
        Visualizacao[] vz = new Visualizacao[3];
        vz[0] = new Visualizacao(g[0], v[0]);
        vz[0].avaliar();
        v[0].play();
        v[0].setCurtidas(1);
        
        vz[1] = new Visualizacao(g[0], v[1]);
        vz[1].avaliar(10);
        
        vz[2] = new Visualizacao(g[1], v[0]);
        vz[2].avaliar(6);
        
        
        System.out.println(vz[0].toString());
        System.out.println();
        System.out.println(vz[1].toString());
        System.out.println();
        System.out.println(vz[2].toString());
        
    }
    
}
