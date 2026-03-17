
package exercicioo7;


public class AlunoCurso {
    private String nome;
    private String curso;
    private int semestre;
    private String matricula;

    public AlunoCurso(String nome, String curso, int semestre, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
        this.matricula = matricula;
    }
     public String getNome() { return nome; }
    public String getCurso() { return curso; }
}
