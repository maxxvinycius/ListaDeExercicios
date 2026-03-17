
package exercicioo7;


public class Exercicioo7 {

    
    public static void main(String[] args) {
        AlunoCurso a1 = new AlunoCurso("Miguel", "Engenharia", 3, "202301");
        AlunoCurso a2 = new AlunoCurso("Thaise", "Direito", 2, "202302");

        System.out.println(a1.getNome() + " - " + a1.getCurso());
        System.out.println(a2.getNome() + " - " + a2.getCurso());
    }
    
}
