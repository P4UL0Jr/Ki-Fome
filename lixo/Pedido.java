package lixo;

import entidades.Comida;

public class Pedido {
    private Comida tipos_comida;
    private String localizacao_da_entrega;
    private boolean pedidos_pendentes;
    private boolean pedidos_a_caminho;
    private boolean pedidos_entregados;
    private boolean pedidos_recusados;
    

//////////////////////status do pedido///////////////////////////////////////////
    void status_do_pedido(){
        System.out.println("Localização da entrega: "+ this.localizacao_da_entrega);
        System.out.println("O pedido está pendente? "+ this.pedidos_pendentes);
        System.out.println("O pedido está a caminho? "+ this.pedidos_a_caminho);
        System.out.println("O pedido já foi entregue? "+ this.pedidos_entregados);
        System.out.println("O pedido foi recusado? "+ this.pedidos_recusados);
    }
////////////////////status da localização da entrega/////////////
    void localizaçâo_da_entrega(){
        this.localizacao_da_entrega = ("");
    }
////////////////////status do pedido feito///////////////////////
    void pedido_feito(){
        this.pedidos_pendentes = true;
    }
///////////////////status do encaminhamento do pedido///////////////////////
    void entrega_dos_pedidos(){
        this.pedidos_a_caminho = false;
    }
///////////////////status de pedidos entregue////////////////////////
    void entregas_aceitas(){
        this.pedidos_entregados = false;
    }
//////////////////status de pedidos recusados/////////////////////
    void pedidos_devolvidos(){
        this.pedidos_recusados = false;
    }
///////////////// getter e setter////////////////////////////

////////////////localização do cliente//////////////////////
    public String getLocalizacao_da_entrega(){
        return this.localizacao_da_entrega;
    }
    public void setLocalizacao_da_entrega(String le){
        this.localizacao_da_entrega = le;
    }
/////////////////pedidos pendentes///////////////////////////
    public boolean getPedidos_pendentes() {
        return this.pedidos_pendentes;
    }
    public void setPedidos_pendentes(boolean pp) {
        this.pedidos_pendentes = pp;
    }
////////////////pedidos a caminho//////////////////////
    public boolean getPedidos_a_caminho() {
        return this.pedidos_a_caminho;
    }
    public void setPedidos_a_caminho(boolean pc) {
        this.pedidos_a_caminho = pc;
    }
///////////////pedidos entregados///////////////////////////
    public boolean getPedidos_entregados() {
        return this.pedidos_entregados;
    }
    public void setPedidos_entregados(boolean pe) {
        this.pedidos_entregados = pe;
    }
//////////////pedidos recusados///////////////////////////////////
    public boolean getPedidos_recusados() {
        return this.pedidos_recusados;
    }
    public void setPedidos_recusados(boolean pr) {
        this.pedidos_recusados = pr;
    }
    public Comida getTipos_comida() {
        return tipos_comida;
    }
    public void setTipos_comida(Comida tipos_comida) {
        this.tipos_comida = tipos_comida;
    } 
}
