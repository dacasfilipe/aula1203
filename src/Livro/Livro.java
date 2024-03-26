package Livro;

public class Livro {
    String titulo;
    String autor;
    int anoDePublicacao;

    public void exibirDetalhes(){
        System.out.println("Titulo:"+this.titulo);
        System.out.println("Autor"+this.autor);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDePublicacao='" + anoDePublicacao + '\'' +
                '}';
    }
}
