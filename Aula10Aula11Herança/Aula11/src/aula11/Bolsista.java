package aula11;

public final class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno bolsista " + this.getNome());
    }
        
}
