package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    //Métodos Especiais
    //Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    //Getters/Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //Métodos Personalizados
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if ("CC".equals(tipo)){
            this.setSaldo(50);
        } else if ("CP".equals(tipo)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com saldo positivo.");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta com saldo negativo.");
        } else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }
    
    public void depositar(float valor){
       if (this.getStatus()){
           this.setSaldo(this.getSaldo() + valor);
           System.out.println("Depósito realizado na conta de " + this.getDono());
       } else{
           System.out.println("Impossível realizar déposito. Conta não existe.");
       }
    }
    
    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else{
                System.out.println("Saldo insuficiente.");
            }
        } else{
            System.out.println("Impossível realizar saque. Conta não exite.");
        }
    }
    
    public void pagarMensal(){
        int mensal = 0;
        if ("CC".equals(getTipo())){
            mensal = 12;
        } else if ("CP".equals(getTipo())){
            mensal = 20;
            }
        if (this.getStatus()){
            if (this.getSaldo() >= mensal){
                this.setSaldo(this.getSaldo() - mensal);
                System.out.println("Mensalidade paga com sucesso!");
                } else {
                System.out.println("Saldo insuficiente.");
                }
            } else {
            System.out.println("Impossível realizar pagamento. Conta não existe.");
        }
    }
}