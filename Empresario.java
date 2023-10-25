import java.util.Scanner;

public class Empresario extends Restaurante{
    Scanner input_do_empresario = new Scanner(System.in);
    private String nome_do_dono;
    private String email_do_dono;
    private String cpf_do_dono;
    private  String senha_do_restaurante;


    public void cadastro_do_empresario() {
        Cadastro_do_restaurante();
        System.out.println("Digite o Nome do Empresário");
        this.nome_do_dono = input_do_empresario.nextLine();
        System.out.println("Digite o Email do Empresário");
        this.email_do_dono = input_do_empresario.nextLine();
        System.out.println("Digite o CPF do Ampresário");
        System.out.println("-----------------------------");
        System.out.println("PARA FINALIZAR O CADASTRO");
        System.out.println("-----------------------------");
        System.out.println("Digite sua senha: ");
        this.senha_do_restaurante = input_do_empresario.nextLine();
        System.out.println("Confirme a sua senha: ");
        String confirmarsenha;
        confirmarsenha = input_do_empresario.nextLine();
        while (!this.senha_do_restaurante.equals(confirmarsenha)) {
            System.out.println("Senhas diferentes");
            System.out.println("tente novamente");
            confirmarsenha = input_do_empresario.nextLine();
        }
    }

    public String getNome_do_dono() {
        return nome_do_dono;
    }

    public void setNome_do_dono(String nome_do_dono) {
        this.nome_do_dono = nome_do_dono;
    }

    public String getEmail_do_dono() {
        return email_do_dono;
    }

    public void setEmail_do_dono(String email_do_dono) {
        this.email_do_dono = email_do_dono;
    }

    public String getCpf_do_dono() {
        return cpf_do_dono;
    }

    public void setCpf_do_dono(String cpf_do_dono) {
        this.cpf_do_dono = cpf_do_dono;
    }

    public String getSenha_do_restaurante() {
        return senha_do_restaurante;
    }

    public void setSenha_do_restaurante(String senha_do_restaurante) {
        this.senha_do_restaurante = senha_do_restaurante;
    }
}
