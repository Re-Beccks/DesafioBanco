public abstract class Conta {
    private static final int agenciaPadrao = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected float saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.agenciaPadrao;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public void sacar(float valor){
        saldo = saldo - valor;

    }

    public void depositar(float valor){
        saldo = saldo + valor;

    }

    public void transferir(float valor, Conta contaDestino){
      sacar(valor);
      contaDestino.depositar(valor);
    
    }

    public void imprimirExtrato(){

    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoContas(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número da conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    
}
