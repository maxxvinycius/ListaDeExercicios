
package exercicioo8;


public class Exercicioo8 {

    
    public static void main(String[] args) {
        CarroAluguel carro = new CarroAluguel("Civic", "Honda", 2022, 180);

        carro.setValorDiaria(200);

        System.out.println(carro.getModelo());
        System.out.println(carro.getMarca());
        System.out.println(carro.getAno());
        System.out.println(carro.getValorDiaria());
    }
    
}
