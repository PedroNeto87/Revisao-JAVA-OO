package aula09;

public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Metodos Publico

    public String detalhes() {
        return "Livro \n" + "Titulo: " + titulo + ", autor: " + autor 
                        + "\nTotal de Paginas: " + totPaginas + ", pagina atual: " 
                        + pagAtual + "\nAberto: " + aberto + "\nLeitor: " 
                        + leitor.getNome() + ", idade " + leitor.getIdade()
                        + ", sexo " + leitor.getSexo() + ".";
    }
    
    //Metodos Especiais
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setLeitor(leitor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Metodos Abstratos
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas){
            this.setPagAtual(0);
        } else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual()+1 > this.getTotPaginas()){
            System.out.println("Você chegou no final do livro.\n");
        } else {
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() <= 0){
            System.out.println("Você já está no inicio do livro.\n");
        } else {
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
}
