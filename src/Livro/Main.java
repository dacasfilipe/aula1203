package Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Harry Potter";
        livro.autor = "J.K.R";
        livro.anoDePublicacao = 2002;

        System.out.println(livro.toString());
    }

}
