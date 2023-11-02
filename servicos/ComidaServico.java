package servicos;

import java.util.Scanner;


public class ComidaServico extends EmpresarioServico {
    Scanner input_da_comida = new Scanner(System.in);

    PratoServico servicoprato = new PratoServico();
    BebidaServico servicobebida = new BebidaServico();


    


    public void ver_e_add_comida(){
        cadastro_do_empresario();
        String cadastro_de_repeticao = "8";
        while (!cadastro_de_repeticao.equals("4")) {

            System.out.println("Para ver seu cardapio");
            System.out.println("DIGITE [1]");
            System.out.println("Para adicionar comida ao cardapio");
            System.out.println("DIIGTE [2]");
            System.out.println("Para excluir comida do cardapio");
            System.out.println("DIGITE [3]");
            System.out.println("Para sair da Conta");
            System.out.println("DIGITE [4]");

            String variavel = input_da_comida.nextLine();
            switch (variavel) {
                case "1":
                    servicoprato.mostrando_cafe_da_manha();
                    servicoprato.mostrando_almoco();
                    servicoprato.mostrando_sobremesa();
                    servicoprato.mostrando_lanche();
                    servicoprato.mostrando_janta();
                    servicobebida.mostrando_bebida();

                    break;
                case "2":
                    System.out.println("Qual comida quer adicionar em seu cardapio");
                    System.out.println("[1]CAFE DA MANHA [2]ALMOÇO [3]SOBREMESA [4]LANCHE [5]JANTA [6]BEBIDA [7]SAIR");
                    String tipo_de_comida = input_da_comida.nextLine();
                    while (!tipo_de_comida.equals("7")){
                        switch (tipo_de_comida){
                            case "1":
                                
                                servicoprato.adcionando_cafedamanha();
                                break;
                            case "2":
                                servicoprato.adicionando_almoco();
                                break;
                            case "3":
                                servicoprato.adicionando_sobremesa();
                                break;
                            case "4":
                                servicoprato.adicionando_lanche();
                                break;
                            case "5":
                                servicoprato.adicionando_janta();
                                break;
                            case "6":
                                servicobebida.cadastrar();
                                break;

                        }

                        System.out.println("Qual comida quer adicionar em seu cardapio");
                        System.out.println("[1]CAFE DA MANHA [2]ALMOÇO [3]SOBREMESA [4]LANCHE [5]JANTA [6]BEBIDA [7]SAIR");
                        tipo_de_comida = input_da_comida.nextLine();

                    }
                    break;
                case "3":
                    
                    System.out.println("DE QUAL PARTE DO CARDAPIO VOCE QUER EXCLUIR");
                    System.out.println("[1]Cafe da manha [2]Almoco  [3]Sobremesa  [4]Lanche  [5]Janta  [6]Bebida ");
                    String caseexcluir = input_da_comida.nextLine();
                    switch (caseexcluir) {
                        case "1":
                            servicoprato.excluindocafedamanha();
                            break;
                        case"2":
                            servicoprato.excluindoalmoco();
                            break;
                        case "3":
                            servicoprato.excluindosobremesa();
                            break;
                        case "4": 
                            servicoprato.excluindolanche();
                            break;
                        case "5": 
                            servicoprato.excluindojanta();
                            break;
                        case "6": 
                            servicobebida.removendo_bebida();
                            break;


                    }
                    
                break;
                case "4":
                    cadastro_de_repeticao = variavel;
                    break;
            }
        }




    }

///////////////////////////////////////////////////////////////////////
    

    
 

    

   
        /////////
            
    
           
        ////
            
    }
    


        
    
    



