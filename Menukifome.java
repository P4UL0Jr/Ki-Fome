public class Menukifome {
    public static void main(String[] args) throws Exception {
        Comidas c1 = new Comidas ();
        c1.setCafé_da_manha("Pão com Ovo");
        c1.setAlmoço("Arroz, Feijão e carne");
        c1.setSobremesa("sorvete");
        c1.setLanche("Sanduiche");
        c1.setJanta("Cuscuz");
        c1.status();
        System.out.println("------------------------------------");
        System.out.println("");
        //////////////////////////////
        Entregas pedido1 = new Entregas();
        pedido1.setLocalizacao_da_entrega("Rua Grande N° 3");
        pedido1.setPedidos_pendentes(true);
        pedido1.setPedidos_recusados(false);
        pedido1.setPedidos_entregados(false);
        pedido1.status_do_pedido();
        System.out.println("-------------------------------------");
        System.out.println("");
        ////////////////////////////////////////
        Restaurantes restaurante1 = new Restaurantes();
        //restaurante1.setCnpj(1234.1234);
        restaurante1.setEmail_do_restaurantes("CKhamburgueria@gmai.com");
        restaurante1.setEndereço("rua do forró");
        restaurante1.setNome_do_empresário("halisson");
        restaurante1.setNome_do_resteurantes("CK Hamburgueria");
        restaurante1.status();
        ///////////////////////////////////
        Entregadores entregador1 = new Entregadores();
        entregador1.setEmail_do_entregador("emaildoentregador");
        entregador1.setNome_do_entregador("nome do entregador");
        entregador1.setPagamento(true);
        entregador1.setPlaca_do_entregador("ABC-1234");
        entregador1.setVeículo_do_entregador("125 CG");
        entregador1.Status_do_entregador();
        
    }
}