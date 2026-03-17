
package exerciciio10;


public class Smartphone {
     private String modelo;
    private String fabricante;
    private int armazenamento;
    private double preco;

    public Smartphone(String modelo, String fabricante, int armazenamento, double preco) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.armazenamento = armazenamento;
        this.preco = preco;
    }

    public String getModelo() { return modelo; }
    public String getFabricante() { return fabricante; }
    public int getArmazenamento() { return armazenamento; }
    public double getPreco() { return preco; }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
}
}