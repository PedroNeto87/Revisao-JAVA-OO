package projetofinal;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.espectador.ganharExp();
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    public void avaliar(){
        this.filme.setAvalicao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvalicao(nota);
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if (tot <= 20){
            tot = 3;
        } else if (tot <= 50){
            tot = 5;
        } else if (tot <=90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvalicao(tot);
    }

    @Override
    public String toString() {
        return """
               *** VISUALIZAÇÃO ***
               Espectador: """ + espectador 
                + "\nFilme: " + filme;
    }
    
}
