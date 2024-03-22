package Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa("thor",200);
        pessoa1.setNome("Gilberto");
        //informar o nome da pessoa usando
        System.out.println("Nome:"+pessoa1.getNome());
        System.out.println("Digite o novo nome:");
        String novoNome = leia.next();
        pessoa1.setNome(novoNome);
        System.out.println("Nome atualizado:"+pessoa1.getNome());
        pessoa1.setIdade(350);
        System.out.println("Idade:"+pessoa1.getIdade());

    }
}
