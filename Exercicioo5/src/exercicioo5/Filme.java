
package exercicioo5;


public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;
    private String classificacao;

    public Filme(String titulo, String diretor, int duracao, String classificacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public String getTitulo() { return titulo; }
    public String getDiretor() { return diretor; }
    public int getDuracao() { return duracao; }
    public String getClassificacao() { return classificacao; }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
}
}