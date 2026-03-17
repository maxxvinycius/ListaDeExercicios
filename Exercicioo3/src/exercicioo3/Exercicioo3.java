
package exercicioo3;


public class Exercicioo3 {

    
    public static void main(String[] args) {
        Computador pc = new Computador("HP", "i7", 16, 4500);

        pc.setPreco(4200);

        System.out.println("Marca: " + pc.getMarca());
        System.out.println("Processador: " + pc.getProcessador());
        System.out.println("RAM: " + pc.getMemoriaRAM());
        System.out.println("Preço: " + pc.getPreco());
    }
    
}
