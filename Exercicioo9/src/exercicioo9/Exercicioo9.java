
package exercicioo9;


public class Exercicioo9 {

    
    public static void main(String[] args) {
        PedidoRestaurante pedido = new PedidoRestaurante("João", "Pizza", "Refrigerante", 50);

        pedido.setBebida("Suco");

        System.out.println(pedido.getNomeCliente());
        System.out.println(pedido.getPrato());
        System.out.println(pedido.getBebida());
        System.out.println(pedido.getValorTotal());
    }
    
}
