
package exercicioo5;


public class Exercicioo5 {

    
    public static void main(String[] args) {
        Filme filme = new Filme("Matrix", "Wachowski", 130, "14");

        filme.setClassificacao("16");

        System.out.println(filme.getTitulo());
        System.out.println(filme.getDiretor());
        System.out.println(filme.getDuracao());
        System.out.println(filme.getClassificacao());
            }
    
}
