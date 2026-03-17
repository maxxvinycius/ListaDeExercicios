
package exercicioo6;


public class Exercicioo6 {

    
    public static void main(String[] args) {
         ContaEnergia conta = new ContaEnergia("Pedro", 12345, 200, 180);

        conta.setConsumoKwh(250);

        System.out.println(conta.getNomeCliente());
        System.out.println(conta.getNumeroInstalacao());
        System.out.println(conta.getConsumoKwh());
        System.out.println(conta.getValorConta());
    }
    
}
