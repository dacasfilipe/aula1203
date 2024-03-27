package ContaBancariaV2;
import Pessoa.Pessoa;
public class ContaBancaria {
    private int numero;
    private double saldo;
    private Pessoa titular;
    // titular.nome titular.cpf titular.idade
    //construtor

    public ContaBancaria(int numero, String nome, int idade, String cpf) {
        this.numero = numero;
        titular.setNome(nome);
    }

    public Pessoa.Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa.Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Novo saldo:"+this.saldo);
    }

    public void sacar(double valor){
        if(saldo>0 && saldo>=valor){
            this.saldo = this.saldo - valor;
            System.out.println("Novo saldo:"+this.saldo);
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente:"+this.saldo);
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }
}
