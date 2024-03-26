package Produto;

public class Main {
    public static void main(String[] args) {
        Produto arroz = new Produto();
        arroz.nome = "fumacense";
        arroz.preco = 4.50;
        arroz.quantidadeEmEstoque = 5;
        System.out.println("Valor total estoque:"+arroz.calcularValorTotalEstoque());
    }
}
