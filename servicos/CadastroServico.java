package servicos;

import java.util.Scanner;

public abstract class CadastroServico {
    
    Scanner input_do_cadastro = new Scanner(System.in);
    private String nome;
    private String email;
    private String cpf;
    private  String senha;


    public void cadastro() {
        
        System.out.println("Digite seu Nome");
        this.nome = input_do_cadastro.nextLine();
        System.out.println("Digite seu Email");
        this.email = input_do_cadastro.nextLine();
        System.out.println("Digite seu CPF");
        this.cpf = input_do_cadastro.nextLine();
        System.out.println("-----------------------------");
        System.out.println("PARA FINALIZAR O CADASTRO");
        System.out.println("-----------------------------");
        System.out.println("Digite sua senha: ");
        this.senha = input_do_cadastro.nextLine();
        System.out.println("Confirme a sua senha: ");
        String confirmarsenha;
        confirmarsenha = input_do_cadastro.nextLine();
        while (!this.senha.equals(confirmarsenha)) {
            System.out.println("Senhas diferentes");
            System.out.println("tente novamente");
            confirmarsenha = input_do_cadastro.nextLine();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "CadastroServico [nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", senha=" + senha + "]";
    }
    
}

    

