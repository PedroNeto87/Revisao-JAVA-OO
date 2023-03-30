package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.destampar();
        c1.rabiscar();
        
        c2.modelo = "BIC";
        c2.cor = "Vermelho";
        c2.ponta = 0.7f;
        c2.carga = 100;
        c2.tampar();
        c2.rabiscar();
    }
}
