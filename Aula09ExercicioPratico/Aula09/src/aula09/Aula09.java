package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[1];
        Livro[] l = new Livro[1];
        
        p[0] = new Pessoa("Pedro", 35, "M");
        l[0] = new Livro("POO JAVA", "Guanabara", 100, p[0]);
        
        l[0].abrir();
        l[0].folhear(0);
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
    }
    
}
