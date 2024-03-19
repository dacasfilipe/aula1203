//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor;
        //criar o objeto conta bancaria
        ContaBancaria conta1 = new ContaBancaria();
        System.out.println("Informe o valor:");
        valor = leia.nextDouble();
        conta1.depositar(valor);
        conta1.exibirSaldo();
        System.out.println("Digite o valor do saque:");
        double saque = leia.nextDouble();
        conta1.sacar(saque);
        conta1.exibirSaldo();
    }
}