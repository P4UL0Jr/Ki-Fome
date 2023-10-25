import java.util.Scanner;

public class Restaurante {
    Scanner input_do_restaurante = new Scanner(System.in);

    private String endereco;
    private String Cnpj;
    private String email_do_restaurante;
    private String nome_do_resteurante;




    public void Cadastro_do_restaurante() {
        System.out.println("Digite o Nome do restaurante: ");
        this.nome_do_resteurante = input_do_restaurante.nextLine();
        System.out.println("Digite o Email do restaurante: ");
        this.email_do_restaurante = input_do_restaurante.nextLine();
        System.out.println("Digite o Endereço do restaurante:");
        this.endereco = input_do_restaurante.nextLine();
        System.out.println("Digite p CNPJ do restaurante:");
        this.Cnpj = input_do_restaurante.nextLine();

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public String getEmail_do_restaurante() {
        return email_do_restaurante;
    }

    public void setEmail_do_restaurante(String email_do_restaurante) {
        this.email_do_restaurante = email_do_restaurante;
    }

    public String getNome_do_resteurante() {
        return nome_do_resteurante;
    }

    public void setNome_do_resteurante(String nome_do_resteurante) {
        this.nome_do_resteurante = nome_do_resteurante;
    }




    
}
