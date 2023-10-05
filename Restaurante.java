public class Restaurante {
    private String endereço;
    private String Cnpj;
    private String email_do_restaurantes;
    private String nome_do_resteurantes;
    private String senha_do_restaurante;
    


    
    
    public String getSenha_do_restaurante() {
        return senha_do_restaurante;
    }
    public void setSenha_do_restaurante(String sr) {
        this.senha_do_restaurante = sr;
    }
    public String getEnderoço() {
        return this.endereço;
    }
    public void setEndereço(String eç) {
        this.endereço = eç;
    }        
    public String getCnpj() {
        return this.Cnpj;
    } 
    public void setCnpj(String cn) {
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
    


    
}
