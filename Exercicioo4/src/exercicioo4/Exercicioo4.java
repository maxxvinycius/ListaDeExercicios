
package exercicioo4;


public class Exercicioo4 {

    
    public static void main(String[] args) {
        FuncionarioEmpresa f1 = new FuncionarioEmpresa("Ana", "Gerente", 7000, "RH");
        FuncionarioEmpresa f2 = new FuncionarioEmpresa("Carlos", "Analista", 4000, "TI");
        FuncionarioEmpresa f3 = new FuncionarioEmpresa("Maria", "Assistente", 2500, "Financeiro");

        System.out.println(f1.getNome() + " - " + f1.getCargo());
        System.out.println(f2.getNome() + " - " + f2.getCargo());
        System.out.println(f3.getNome() + " - " + f3.getCargo());
    }
    
}
