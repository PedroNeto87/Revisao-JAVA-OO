package aula10;

public class Aluno extends Pessoa {
    //Atributos
    private int matr;
    private String curso;
    
    //Metodos Publico
    public void cancelarMatr(){
        System.out.println("Matricula sera cancelada.");
    }
    
    //Metodos Especiais

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
