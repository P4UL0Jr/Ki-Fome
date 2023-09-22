public class Restaurantes {
    private String endereço;
    private float Cnpj;
    private String email_do_restaurantes;
    private String nome_do_resteurantes;
    private String nome_do_empresário;

    public String getEnderoço() {
        return this.endereço;
    }
    public void setEndereço(String eç) {
        this.endereço = eç;
    }        
    public float getCnpj() {
        return this.Cnpj;
    } 
    public void setCnpj(float cn) {
        this.Cnpj = cn;
    } 
    public String getEmail_do_restaurantes()  {
        return this.email_do_restaurantes;
    } 
    public void setEmail_do_restaurantes(String er) {
        this.email_do_restaurantes = er;
    }
    public String getNome_do_resteurantes() {
        return this.nome_do_resteurantes;
    }
    public void setNome_do_resteurantes(String nr) {
        this.nome_do_resteurantes = nr;
    }
    public String getNome_do_empresário() {
        return this.nome_do_empresário;
    }   
    public void setNome_do_empresário(String ne) {
        this.nome_do_empresário = ne; 
    }

    public void status() { 
        System.out.println("CADASTRADO");
        System.out.println("endereço: " + this.endereço);
        System.out.println("Cnpj: " + this.Cnpj);
        System.out.println("email do restaurantes: " + this.email_do_restaurantes);
        System.out.println("nome do resteurantes: " + this.nome_do_resteurantes);
        System.out.println("nome do empresário: " + this.nome_do_empresário);
    }
}
