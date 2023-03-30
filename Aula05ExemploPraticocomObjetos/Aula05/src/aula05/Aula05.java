package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CP");
        p1.depositar(100);
        p1.pagarMensal();
        p1.sacar(230);
        p1.fecharConta();
        p1.estadoAtual();
    }
    
}
