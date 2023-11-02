package entidades;
public class Cliente  {

    private String Nome;
    private String Cpf;
    private String Cartao_de_credito;
    private String Edereco;
    private String Numero_de_telefone;
    private String Email;
    private String Senha_do_cliente;


    void status_do_cliente(){
      System.out.println("Sobre o cliente: ");
      System.out.println(getNome());
      System.out.println(getCpf());
      System.out.println(getEndereco());
      System.out.println(getNuero_de_telefone());
    }

    public String getNome() {
       return this.Nome;
 
    }
    public void setNome (String no) {
       this.Nome = no;

    }
    public String getCpf() {
       return this.Cpf;
 
    }
    public void setCpf (String cp) {
       this.Cpf = cp;

    }
    public String getCartao_de_credito() {
       return this.Cartao_de_credito;
 
    }

  public void setCartao_de_credito (String ca) {
       this.Cartao_de_credito = ca;

    }
    public String getEndereco() {
       return this.Edereco;
 
    }
    public void setEndereco (String ed) {
       this.Edereco = ed;

    }
    public String getNuero_de_telefone() {
       return this.Numero_de_telefone;
 
    }
    public void setNumero_de_telefone (String nu) {
       this.Numero_de_telefone = nu;

    }
    public String getEmail() {
       return this.Email;
 
    }
    public void setEmail (String em) {
       this.Email = em;
   }
   public String getSenha_do_cliente(){
      return this.Senha_do_cliente;
   }
   public void setSenha_do_cliente(String sc){
      this.Senha_do_cliente = sc;
   }


}