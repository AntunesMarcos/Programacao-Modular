public class Conta {
    private String cpf;
    private String numeroConta;
    private double saldo;
    private double limite = 100;


    public Conta(String cpf, String conta) {
        this.cpf = cpf;
        this.numeroConta = conta;
    }

    private  boolean autorizarSaque(double valor){
        if(valor > saldo + limite){
            return false;
        }
        return true;
    }
    public void sacar(double valor){
        if(autorizarSaque(valor)){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public double taxaNegativo(){
            double taxa = saldo * 1.03;
            return taxa;
    }

    public boolean negativo(){
        if(this.saldo < 0){
            return true;
        }
        return false;
    }
    public void depositar(double valor){
        if(negativo()){
            saldo =  valor  + taxaNegativo();
        }else {
            saldo += valor;
        }

    }

    public double getSaldo(){
        return this.saldo;
    }
    public void imprimir(){
        System.out.println("CPF: " + cpf);
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite de Conta: " + limite);
    }
}
