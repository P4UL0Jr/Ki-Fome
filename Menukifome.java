public class Menukifome {
    public static void main(String[] args) throws Exception {
        Entregas pedido1 = new Entregas();
        pedido1.setPedidos_recusados(true);
        pedido1.setPedidos_entregados(false);
        pedido1.status_do_pedido();
       
    }
}