import java.util.Scanner;

public class Menukifome {

    
    public static void main(String[] args) {
        boolean cadastro;
        cadastro = false;
        while(cadastro == false){
            System.out.println("COMO VOCÊ QUER SE CADASTRAR");
            System.out.println("____________________________");
            System.out.println("[1] Para se cadastrar como usuário");
            System.out.println("[2] Para se cadastrar como entregador");
            System.out.println("[3] Para se cadastrar como restaurante");
            Scanner input_do_menu = new Scanner(System.in);       
            int escolha_do_cadastro;
            escolha_do_cadastro = input_do_menu.nextInt();
            switch(escolha_do_cadastro ){
                case 1:
                    Usuario Usuario1 = new Usuario();
                    Usuario1.Cadastro_de_cliente();
                    cadastro = true;
                    break;
                case 2:
                    Usuario Usuario2 = new Usuario();
                    Usuario2.cadastrar_restaurante();
                    cadastro = true;
                    break;
                default:
                    System.out.println("nada a declarar");

        
            }
        input_do_menu.close();
        }    
        
    }
}