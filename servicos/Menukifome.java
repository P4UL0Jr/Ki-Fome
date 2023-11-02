package servicos;

import java.util.Scanner;

import lixo.Comida;

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
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    Comida novorestaurante = new Comida();
                    novorestaurante.ver_e_add_comida();

            }

    }


    }
}