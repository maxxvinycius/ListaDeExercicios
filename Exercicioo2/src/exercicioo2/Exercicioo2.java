
package exercicioo2;


public class Exercicioo2 {

    
    public static void main(String[] args) {
        LivroBiblioteca livro = new LivroBiblioteca("Java Básico", "João Silva", 250, 2018);

        livro.setAnoPublicacao(2022);

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Páginas: " + livro.getNumeroPaginas());
        System.out.println("Ano: " + livro.getAnoPublicacao());
    }
    
}
