package repositorios;
import java.util.ArrayList;
import entidades.Prato;
import java.util.Scanner;

public class PratoRepositorio {
    private Scanner input_doprato = new Scanner(System.in);
    
    ArrayList <Prato> Cafe_da_manhalist = new ArrayList<>();
    ArrayList <Prato> Almocolist = new ArrayList<>();
    ArrayList <Prato> Sobremesalist = new ArrayList<>();
    ArrayList <Prato> Lanchelist = new ArrayList<>();
    ArrayList <Prato> Jantalist = new ArrayList<>();

    public void salvarcafedamanha(Prato pratocdm){
        Cafe_da_manhalist.add(pratocdm);
    }
    public void salvaralmoco(Prato pratoalmoco){
        Almocolist.add(pratoalmoco);
    }
    public void salvarsobremesa(Prato pratosbms){
        Sobremesalist.add(pratosbms);
    }
    public void salvarlanche(Prato pratolanche){
        Lanchelist.add(pratolanche);
    }
    public void salvarjanta(Prato pratojanta){
        Jantalist.add(pratojanta);
    }
/////////////////////////mostrando arrays list's/////////////////////
    public void mostrando_cafedamanha(){
        System.out.println("MOSTRANDO CAFE DA MANHA");
        for (int i = 0; i< Cafe_da_manhalist.size(); i++){
            System.out.println(i+1 + "º__"+Cafe_da_manhalist.get(i).getNome_do_prato()+ "__R$:"+ Cafe_da_manhalist.get(i).getValor());
            }
    }
    public void mostrando_almoco(){
        System.out.println("MOSTRANDO ALMOÇO");
        for (int i = 0; i< Almocolist.size(); i++){
            System.out.println(i+1 + "º__"+Almocolist.get(i).getNome_do_prato()+ "__R$:"+ Almocolist.get(i).getValor());
        }
    }
    public void mostrando_sobremesa() {
        System.out.println("MOSTRANDO SOBREMESA");
        for (int i = 0; i < Sobremesalist.size(); i++) {
            System.out.println(i+1 + "º__"+Sobremesalist.get(i).getNome_do_prato()+ "__R$:"+ Sobremesalist.get(i).getValor());

        }
    }
    public void mostrando_lanche(){
        System.out.println("MOSTRANDO LANCHE");
        for (int i = 0; i< Lanchelist.size(); i++){
            System.out.println(i+1 + "º__"+Lanchelist.get(i).getNome_do_prato()+ "__R$:"+ Lanchelist.get(i).getValor());
        }
    }

    public void mostrando_janta(){
        System.out.println("MOSTRANDO JANTA");
        for (int i =0; i < Jantalist.size(); i++){
            System.out.println(i+1 + "º__"+Jantalist.get(i).getNome_do_prato()+ "__R$:"+ Jantalist.get(i).getValor());
        }
    }
///////////////removendo objeto de array///////////


public void excluindo_cafedamanha(){
    System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
    String excluindo_comida = input_doprato.nextLine();
    for (Prato p : Cafe_da_manhalist){
        if(p.getNome_do_prato().equalsIgnoreCase(excluindo_comida)){
            System.out.println("Encontrado no -CAFE DA MANHA-");
            Cafe_da_manhalist.remove(p);
            System.out.println("Excluido com sucesso");
        }
    }
            
}
            
public void excluindo_almoco(){    
    System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
    String excluindo_comida = input_doprato.nextLine();
    for (Prato q : Almocolist){
            if(q.getNome_do_prato().equalsIgnoreCase(excluindo_comida)){
                System.out.println("Encontrado no -CAFE ALMOCO-");
                Almocolist.remove(q);
                System.out.println("Excluido com sucesso");
            }
    }
            
}
        ////
            
public void excluindo_sobremesa(){
    System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
    String excluindo_comida = input_doprato.nextLine();
    for (Prato r : Sobremesalist){
        if(r.getNome_do_prato().equalsIgnoreCase(excluindo_comida)){
            System.out.println("Encontrado na -SOBRE MESA-");
            Sobremesalist.remove(r);
            System.out.println("Excluido com sucesso");
        }
    }
}
        ////////////
            
public void excluindo_lanche(){
    System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
    String excluindo_comida = input_doprato.nextLine();
    for (Prato s : Lanchelist){
        if(s.getNome_do_prato().equalsIgnoreCase(excluindo_comida)){
        System.out.println("Encontrado no -LANCHE-");
        Lanchelist.remove(s);
        System.out.println("Excluido com sucesso");
        }
    }
}
       
        //////
            
public void excluindo_janta(){
    System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
    String excluindo_comida = input_doprato.nextLine();
    for (Prato t : Jantalist){
    if(t.getNome_do_prato().equalsIgnoreCase(excluindo_comida)){
        System.out.println("Encontrado na -JANTA-");
        Jantalist.remove(t);
        System.out.println("Excluido com sucesso");
        }
    }
}
  


    }


