public class Comidas {
    public String café_da_manha;
    public String almoço;
    public String sobremesa;
    public String lanche;
    public String janta;
    
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
    
    public void status() {
       System.out.println("TEMOS AS SEGUINTES REFEIÇÕES");
       System.out.println("Café da manha: " + this.café_da_manha);
       System.out.println("Almoço: " + this.almoço);
       System.out.println("Sobremesa: " + this.sobremesa);
       System.out.println("Lanche: " + this.lanche);
       System.out.println("Cuscuz: " + this.janta);
    }
 
    
}
