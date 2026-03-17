
package exercicioo8;


public class CarroAluguel {
    private String modelo;
    private String marca;
    private int ano;
    private double valorDiaria;

    public CarroAluguel(String modelo, String marca, int ano, double valorDiaria) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    public String getModelo() { return modelo; }
    public String getMarca() { return marca; }
    public int getAno() { return ano; }
    public double getValorDiaria() { return valorDiaria; }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
}
}