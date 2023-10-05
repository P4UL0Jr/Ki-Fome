import java.util.Scanner;
public class Usuario  {
    Scanner input = new Scanner(System.in);
    void Cadastro_de_cliente(){
        Cliente novo_cliente = new Cliente();
        
        System.out.println("Digite se nome: ");
        String nome_usuario;
        nome_usuario = input.nextLine();
        novo_cliente.setNome(nome_usuario);

        System.out.println("Digite seu email: ");
        String email_do_usuario;
        email_do_usuario = input.nextLine();
        novo_cliente.setEmail(email_do_usuario);

        System.out.println("Digite seu numero: ");
        String numero_do_usuario;
        numero_do_usuario = input.nextLine();
        novo_cliente.setNumero_de_telefone(numero_do_usuario);

        System.out.println("Digite seu endereço: ");
        String endereco_do_cliente;
        endereco_do_cliente = input.nextLine();
        novo_cliente.setEndereco(endereco_do_cliente);

        System.out.println("Digite seu CPF: ");
        String cpf_do_cliente;
        cpf_do_cliente = input.nextLine();
        novo_cliente.setCpf(cpf_do_cliente);

        System.out.println("Para a finalização do cadastro");
        System.out.println("Digite sua senha: ");
        String confirmacao_de_senha_do_cliente;
        confirmacao_de_senha_do_cliente = "";
        String senha_do_cliente;
        senha_do_cliente = input.nextLine();
        while(!senha_do_cliente.equals(confirmacao_de_senha_do_cliente)){
            System.out.println("Confirme sua senha: ");
            confirmacao_de_senha_do_cliente = input.nextLine();
            if(senha_do_cliente.equals(confirmacao_de_senha_do_cliente)){
                System.out.println("Você terminou o cadastro como usuário!!!");
                System.out.println("SEJA BEM VINDO(A)!!! " + novo_cliente.getNome());
            }else {
                System.out.println("Senha diferente! Tente novamente:");
            }
        
        
        }
        

        
        
        
    }
    public void cadastrar_restaurante(){
        Restaurante restaurante1 = new Restaurante();
        Empresario empresario1 = new Empresario();

/////////////cadastradno o restaurante/////////////////////////
        System.out.println("Digite o nome do restaurante: ");
        String nome_do_restaurante;
        nome_do_restaurante = input.nextLine();
        restaurante1.setNome_do_resteurantes(nome_do_restaurante);

        System.out.println("Digite o CNPJ da empresa: ");
        String cnpj_do_restaurante;
        cnpj_do_restaurante = input.nextLine();
        restaurante1.setCnpj(cnpj_do_restaurante);

        System.out.println("Digite o endereço do restaurante: ");
        String endereco_do_restaurante;
        endereco_do_restaurante = input.nextLine();
        restaurante1.setEndereço(endereco_do_restaurante);
        
        System.out.println("Digite o email do restaurante: ");
        String email_do_restaurante;
        email_do_restaurante = input.nextLine();
        restaurante1.setEmail_do_restaurantes(email_do_restaurante);

////////////////cadastrando o empresario//////////////////////////////
        System.out.println("Digite o nome do empresario: ");
        String empresario;
        empresario = input.nextLine();
        empresario1.setDono_do_restaurante(empresario);

        System.out.println("Digite o email do dono do restaurante: ");
        String email_do_dono;
        email_do_dono = input.nextLine();
        empresario1.setEmail_do_dono_restaurante(email_do_dono); 

        System.out.println("Digite o CPF do dono do restaurante: ");
        String cpf_do_empresario;
        cpf_do_empresario = input.nextLine();
        empresario1.setCpf_do_dono_restaurante(cpf_do_empresario);
//////////////////finalizando cadastro e adicionando senha//////////////////
        System.out.println("Para a finalização do cadastro");
        System.out.println("Digite a sua senha: ");
        String senha_da_empresa;
        String confirmacao_senha_da_empresa;
        senha_da_empresa = input.nextLine();
        confirmacao_senha_da_empresa = "";
        while(!senha_da_empresa.equals(confirmacao_senha_da_empresa)){
            System.out.println("Confirme sua senha: ");
            confirmacao_senha_da_empresa = input.nextLine();
            if(senha_da_empresa.equals(confirmacao_senha_da_empresa)){
                System.out.println("Você terminou seu cadastro como restaurante!!!");
                System.out.println("SEJA BEM VINDO(A)!!! " + restaurante1.getNome_do_resteurantes());
            }else {
                System.out.println("Senha diferente! Tente novamente ");
            }

        }
        Comida cardapio1 = new Comida();
        System.out.println("Quais comidas você quer adicionar em seu cardapio? ");
        System.out.println("[1]café da manha, [2]almoço,[3]sobremesa, [4]lanche, [5]janta e [6]para encerrar"); 
        int comidas_no_cardapio;
        comidas_no_cardapio = input.nextInt();
        while (comidas_no_cardapio != 6) {

            switch(comidas_no_cardapio ){
                case 1 :
                    String cafe_da_manha;
                    System.out.println("Digite o café da manhã que será adicionado ");
                    cafe_da_manha = input.nextLine();
                    cardapio1.setCafé_da_manha(cafe_da_manha);
                    break;
                case 2:
                    String almoco;
                    System.out.println("Digite o almoço que será adicionado ");
                    almoco = input.nextLine();
                    cardapio1.setAlmoço(almoco);
                    break;
                case 3:
                    String sobremesa;
                    System.out.println("Digite a sobremesa que será adicionada ");
                    sobremesa = input.nextLine();
                    cardapio1.setSobremesa(sobremesa);
                    break;
                case 4:
                    String lanche;
                    System.out.println("Digite o lanche que será adicionado ");
                    lanche = input.nextLine();
                    cardapio1.setLanche(lanche);
                    break;
                case 5:
                    String janta;
                    System.out.println("Digite a janta que sera adicionada ");
                    janta = input.nextLine();
                    cardapio1.setJanta(janta);
                    break;
            }    
            

            System.out.println("[1]café da manha, [2]almoço,[3]sobremesa, [4]lanche, [5]janta e [6]para encerrar"); 
            comidas_no_cardapio = input.nextInt();
        }
        System.out.println();


    }

    
    public void cadastrar_entregador(){
        
    }
    
}