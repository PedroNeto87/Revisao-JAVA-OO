package projetofinal;

public class Video implements AcoesVideo {
    private String titulo;
    private float avalicao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avalicao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(float avalicao) {
        float nova;
        nova = ((this.avalicao + avalicao)/this.views);
        this.avalicao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
        
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public String toString() {
        return titulo 
                + "\nAvalicao: " + avalicao 
                + "\nViews: " + views 
                + "\nCurtidas: " + curtidas 
                + "\nReproduzindo: " + reproduzindo;
    }
    
}
