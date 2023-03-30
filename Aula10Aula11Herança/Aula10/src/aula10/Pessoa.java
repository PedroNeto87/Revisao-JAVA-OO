package aula10;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //Metodos Publico
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }
    
    //Metodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa" 
                + "\nNome: " + nome 
                + "\nIdade: " + idade 
                + "\nSexo: " + sexo + "\n";
    }
        
}
