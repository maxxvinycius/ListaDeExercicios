
package exercicioo4;


public class FuncionarioEmpresa {
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public FuncionarioEmpresa(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
}
