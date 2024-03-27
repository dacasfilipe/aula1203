package ContaBancariaV2;
import Pessoa.Pessoa;
public class Main {
    public static void main(String[] args) {
        int numero = 12345;
        String nome = "Tom";
        int idade = 25;
        String Cpf = "123456789-09";

        ContaBancaria conta1 = new ContaBancaria(numero,nome, idade,cpf);
        System.out.println(conta1.toString());


    }
}
