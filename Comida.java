import java.util.Scanner;
public class Comida {
    public String café_da_manha;
    public String almoço;
    public String sobremesa;
    public String lanche;
    public String janta;
    
    Scanner input_comida = new Scanner(System.in);
    public String getCafé_da_manha() {
       return this.café_da_manha;
 
    }
    public void setCafé_da_manha(String cf) {
       this.café_da_manha = cf;
 
    }
    public String getAlmoço() {
       return this.almoço;
 
    }
    public void setAlmoço(String al) {
       this.almoço = al;
    }
      
    public String getSobremesa(){
       return this.sobremesa;
    }
    public void setSobremesa(String so) {
       this.sobremesa = so;
    }
    public String getLanche() {
       return this.lanche;
    }
    public void setLanche(String la) {
       this.lanche = la;
    }
    public String getJanta() {
       return this.janta;
    }
    public void setJanta(String ja) {
       this.janta = ja;
    }
    
    public void adicionar_cafe_da_manha() {
      String cafe_da_manha;
      System.out.println("Digite o café da manhã que será adicionado ");
      cafe_da_manha = input_comida.nextLine();
      this.setCafé_da_manha(cafe_da_manha);
      
    }
    public void adicionar_almoco(){
      String almoco;
      System.out.println("Digite o almoço que será adicionado ");
      almoco = input_comida.nextLine();
      setAlmoço(almoco);
    }
    public void adicionar_sobremesa(){
      String sobremesa;
      System.out.println("Digite a sobremesa que será adicionada ");
      sobremesa = input_comida.nextLine();
      setSobremesa(sobremesa);
    }
    public void adicionar_lanche(){
      String lanche;
      System.out.println("Digite a lanche que será adicionada ");
      lanche = input_comida.nextLine();
      setSobremesa(lanche);
    }
    public void adicionar_janta(){
      String janta;
      System.out.println("Digite a janta que será adicionada ");
      janta = input_comida.nextLine();
      setSobremesa(janta);
    }
    void status_do_cardapio(){
      System.out.println("Cafés da manhã oferecidos: "+ this.getCafé_da_manha());
      System.out.println("Almoços oferecidos: "+ this.getAlmoço());
      System.out.println("Sobremesas oferecidas: "+ this.getSobremesa());
      System.out.println("Lanches oferecidos: "+ this.getLanche());
      System.out.println("Jantas oferecidas: "+ this.getJanta());
    }
    
    
 
    
}
