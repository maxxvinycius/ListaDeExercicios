
package exerciciio10;


public class Exerciciio10 {

    
    public static void main(String[] args) {
    Smartphone s1 = new Smartphone("Galaxy S23", "Samsung", 128, 4000);
        Smartphone s2 = new Smartphone("iPhone 14", "Apple", 128, 6000);

        s2.setArmazenamento(256);

        System.out.println(s1.getModelo() + " " + s1.getArmazenamento());
        System.out.println(s2.getModelo() + " " + s2.getArmazenamento());
    }
    
}
