package aula10;

public class Aula10 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p4.setNome("Pedro");
        p4.setIdade(35);
        p4.fazerAniv();
        p4.mudarTrabalho();
        p4.setSexo("M");
        
        p1.setNome("Ashia");
        p1.setIdade(31);
        p1.fazerAniv();
        p1.setSexo("F");
        
        System.out.println(p4.toString());
        System.out.println(p1.toString());
    }
    
}
