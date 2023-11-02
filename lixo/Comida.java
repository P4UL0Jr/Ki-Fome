package lixo;
import java.util.Scanner;

import servicos.EmpresarioServico;

import java.util.ArrayList;

public class Comida extends EmpresarioServico {
    Scanner input_da_comida = new Scanner(System.in);
    ArrayList <Bebida> bebidalist = new ArrayList<>();
    ArrayList <Prato> Cafe_da_manhalist = new ArrayList<>();
    ArrayList <Prato> Almocolist = new ArrayList<>();
    ArrayList <Prato> Sobremesalist = new ArrayList<>();
    ArrayList <Prato> Lanchelist = new ArrayList<>();
    ArrayList <Prato> Jantalist = new ArrayList<>();

    


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
                    mostrando_cafedamanha();
                    mostrando_almoco();
                    mostrando_sobremesa();
                    mostrando_lanche();
                    mostrando_janta();
                    mostrando_bebida();

                    break;
                case "2":
                    System.out.println("Qual comida quer adicionar em seu cardapio");
                    System.out.println("[1]CAFE DA MANHA [2]ALMOÇO [3]SOBREMESA [4]LANCHE [5]JANTA [6]BEBIDA [7]SAIR");
                    String tipo_de_comida = input_da_comida.nextLine();
                    while (!tipo_de_comida.equals("7")){
                        switch (tipo_de_comida){
                            case "1":
                                
                                adcionando_cafedamanha();
                                break;
                            case "2":
                                adicionando_almoco();
                                break;
                            case "3":
                                adicionando_sobremesa();
                                break;
                            case "4":
                                adicionando_lanche();
                                break;
                            case "5":
                                adicionando_janta();
                                break;
                            case "6":
                                adicionando_bebida();
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
                            excluindo_cafedamanha();
                            break;
                        case"2":
                            excluindo_almoco();
                            break;
                        case "3":
                            excluindo_sobremesa();
                            break;
                        case "4": 
                            excluindo_lanche();
                            break;
                        case "5": 
                            excluindo_janta();
                            break;
                        case "6": 
                            excluindo_bebida();
                            break;


                    }
                    
                break;
                case "4":
                    cadastro_de_repeticao = variavel;
                    break;
            }
        }




    }



    private void adcionando_cafedamanha(){
        
        System.out.println("Digite o Cafe Da Manhã que será adicionado");
        String cdm = input_da_comida.nextLine();
        System.out.println("Digite o valor do Cafe Da Manhã que será adiiconado");
        String vcdm = input_da_comida.nextLine();
        Cafe_da_manhalist.add(new Prato(cdm, vcdm ));
        System.out.println("CAFÉ DA MANHA ADICIONADO COM SUCESSO!!!");

    }
    private  void adicionando_almoco(){
        
        System.out.println("Digite o Almoço que será adicionado");
        String adcionando_almoco = input_da_comida.nextLine();
        System.out.println("Digite o valor do Almoço que será adicioando");
        String adicionando_valor_almoco = input_da_comida.nextLine();
        Almocolist.add(new Prato(adcionando_almoco, adicionando_valor_almoco));
        System.out.println("ALMOÇO ADICIONADO COM SUCESSO!!!");

    }
    private void adicionando_sobremesa(){
        
        System.out.println("Digite a Sobremesa que será adicionada");
        String adicionanddo_sobremesa = input_da_comida.nextLine();
        System.out.println("Digite o valor da Sobremesa que será adicionada");
        String adicionando_valor_sonbremesa = input_da_comida.nextLine();
        Sobremesalist.add(new Prato(adicionanddo_sobremesa, adicionando_valor_sonbremesa));
        System.out.println("SOBREMESA ADICIONADA COM SUCESSO!!!");
    }
    private void adicionando_lanche(){
        
        System.out.println("Digite o Lanche que será adicionado");
        String adicionando_lanche = input_da_comida.nextLine();
        System.out.println("Digite o valor do Lanche que será adicionado");
        String adicionando_valor_lanche = input_da_comida.nextLine();
        Lanchelist.add(new Prato(adicionando_lanche, adicionando_valor_lanche));
        System.out.println("LANCHE ADICIONADO COM SUCESSO!!!");
    }
    private void adicionando_janta(){
        
        System.out.println("Digite a Janta que será adicionada");
        String adicionando_janta = input_da_comida.nextLine();
        System.out.println("Digite o valor do Lanche que será adicionado");
        String adicionando_valor_janta = input_da_comida.nextLine();
        Jantalist.add(new Prato(adicionando_janta, adicionando_valor_janta));
        System.out.println("JANTA ADICIONADA COM SUCESSO!!!");
    }
///////////////////////////////////////////////////////////////////////
    public void mostrando_cafedamanha(){
        System.out.println("MOSTRANDO CAFE DA MANHA");
        for (int i = 0; i< Cafe_da_manhalist.size(); i++){
            System.out.println(i+1 + "º__"+Cafe_da_manhalist.get(i).getNome_do_prato()+ "__R$:"+ Cafe_da_manhalist.get(i).getValor());
        }
    }

    public void mostrando_almoco(){
        System.out.println("MOSTRANDO ALMOÇO");
        for (int i = 0; i< Almocolist.size(); i++){
            System.out.println(i+1 + "º__"+Almocolist.get(i).getNome_do_prato()+ "__R$:"+ Almocolist.get(i).getValor());
        }
    }
    public void mostrando_sobremesa() {
        System.out.println("MOSTRANDO SOBREMESA");
        for (int i = 0; i < Sobremesalist.size(); i++) {
            System.out.println(i+1 + "º__"+Sobremesalist.get(i).getNome_do_prato()+ "__R$:"+ Sobremesalist.get(i).getValor());

        }
    }
    public void mostrando_lanche(){
        System.out.println("MOSTRANDO LANCHE");
        for (int i = 0; i< Lanchelist.size(); i++){
            System.out.println(i+1 + "º__"+Lanchelist.get(i).getNome_do_prato()+ "__R$:"+ Lanchelist.get(i).getValor());
        }
    }

    public void mostrando_janta(){
        System.out.println("MOSTRANDO JANTA");
        for (int i =0; i < Jantalist.size(); i++){
            System.out.println(i+1 + "º__"+Jantalist.get(i).getNome_do_prato()+ "__R$:"+ Jantalist.get(i).getValor());
        }
    }
 

    public void mostrando_bebida(){
        System.out.println("MOSTRANDO BBEBIDA");
        for (int i =0; i < bebidalist.size(); i++){
            System.out.println(i+1 + "º__"+bebidalist.get(i).getNome()+ "__R$:"+ bebidalist.get(i).getValor()+ "__ml "+bebidalist.get(i).getMl());

        }
    }
    public void adicionando_bebida(){
        System.out.println("QUAL BEBIDA VAI ADICIONAR?");
        String nomeb = input_da_comida.nextLine();
        System.out.println("QUAL SERA SEU PRECO?");
        String precob = input_da_comida.nextLine();
        System.out.println("QUAL A QUANTIDADE DE >ML< DA BEBIDA OFERECIDA");
        String mlb = input_da_comida.nextLine();
        bebidalist.add(new Bebida(nomeb, precob, mlb));
    }


    protected void excluindo_cafedamanha(){
        System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
        String excluindo_comida = input_da_comida.nextLine();
        for (Prato p : Cafe_da_manhalist){
            if(p.getNome_do_prato().equalsIgnoreCase(excluindo_comida)){
                System.out.println("Encontrado no -CAFE DA MANHA-");
                Cafe_da_manhalist.remove(p);
                System.out.println("Excluido com sucesso");
            }
        }
                
    }
                
    protected void excluindo_almoco(){    
        System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
        String excluindo_comida = input_da_comida.nextLine();
        for (Prato q : Almocolist){
                if(q.getNome_do_prato().equalsIgnoreCase(excluindo_comida)){
                    System.out.println("Encontrado no -CAFE ALMOCO-");
                    Almocolist.remove(q);
                    System.out.println("Excluido com sucesso");
                }
        }
                
    }
            ////
                
    protected void excluindo_sobremesa(){
        System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
        String excluindo_comida = input_da_comida.nextLine();
        for (Prato r : Sobremesalist){
            if(r.getNome_do_prato().equalsIgnoreCase(excluindo_comida)){
                System.out.println("Encontrado na -SOBRE MESA-");
                Sobremesalist.remove(r);
                System.out.println("Excluido com sucesso");
            }
        }
    }
            ////////////
                
    protected void excluindo_lanche(){
        System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
        String excluindo_comida = input_da_comida.nextLine();
        for (Prato s : Lanchelist){
            if(s.getNome_do_prato().equalsIgnoreCase(excluindo_comida)){
            System.out.println("Encontrado no -LANCHE-");
            Lanchelist.remove(s);
            System.out.println("Excluido com sucesso");
            }
        }
    }
           
            //////
                
    protected void excluindo_janta(){
        System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
        String excluindo_comida = input_da_comida.nextLine();
        for (Prato t : Jantalist){
        if(t.getNome_do_prato().equalsIgnoreCase(excluindo_comida)){
            System.out.println("Encontrado na -JANTA-");
            Jantalist.remove(t);
            System.out.println("Excluido com sucesso");
            }
        }
    }
         
        /////////
            
    protected void excluindo_bebida(){
        System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
        String excluindo_comida = input_da_comida.nextLine();
        for (Bebida b : bebidalist) {
            if(b.getNome().equalsIgnoreCase(excluindo_comida)){
                System.out.println("Econtrado na -BEBIDA-");
                bebidalist.remove(b);
                System.out.println("Excluido com sucesso");
            }
        }
            
    }
           
        ////
            
    }
    


        
    
    



