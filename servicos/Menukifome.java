package servicos;
import java.util.Scanner;




public class Menukifome {

    
    public static void main(String[] args) {
        Scanner input_do_menu = new Scanner(System.in);
        int repeticao = 1;
        while (repeticao < 2 ){

            System.out.println("Como voce quer se cadastrar no aplicativo");
            System.out.println("[1] Cliente");
            System.out.println("[2] Entregador");
            System.out.println("[3] Restaurante");
            int forma_de_cadastro;
            forma_de_cadastro = input_do_menu.nextInt();
            switch (forma_de_cadastro){
                case 1:
                    ClienteServico c1 = new ClienteServico();
                    c1.cadastranco_cliente();
                    break;
                case 2:
                    EntregadorServico novoentregador = new EntregadorServico();
                    novoentregador.cadastro_do_entregador();
                    break;
                case 3:
                    ComidaServico novorestaurante = new ComidaServico();
                    novorestaurante.ver_e_add_comida();
                    break;

            }

    }


    }
}