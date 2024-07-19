import java.util.*;

public class Banco{
    private String nome;
    protected List<Conta> Conta;


    public String getNome() {
        return nome;
    }

   public static void main(String[] args) {
        Cliente Rebecca = new Cliente();
        Rebecca.setNome("Rebecca");

       Conta cc = new ContaCorrente(Rebecca);
       Conta poupanca = new ContaPoupanca(Rebecca);

       cc.depositar(100);
       cc.transferir(75, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();       
    

   }
    
}
