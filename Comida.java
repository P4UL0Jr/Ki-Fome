
import java.util.ArrayList;
import java.util.Scanner;

public class Comida extends Empresario{

    Scanner input_da_comida = new Scanner(System.in);
    ArrayList <String> Cafe_da_manhalist = new ArrayList<String>();
    ArrayList <String> Almocolist = new ArrayList<String>();
    ArrayList <String> Sobremesalist = new ArrayList<String>();
    ArrayList <String> Lanchelist = new ArrayList<String>();
    ArrayList <String> Jantalist = new ArrayList<String>();

    public String cafe_da_manha;
    public String almoco;
    public String sobremesa;
    public String lanche;
    public String janta;


    public void ver_e_add_comida(){
        cadastro_do_empresario();
        String cadastro_de_repeticao = "7";
        while (!cadastro_de_repeticao.equals("4")) {

            System.out.println("Para ver seu cardapio");
            System.out.println("DIGITE [1]");
            System.out.println("Para adicionar comida ao cardapio");
            System.out.println("DIIGTE [2]");
            System.out.println("Para achar e excluir um alimento do cardapio");
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
                    break;
                case "2":
                    System.out.println("Qual comida quer adicionar em seu cardapio");
                    System.out.println("[1]CAFE DA MANHA [2]ALMOÇO [3]SOBREMESA [4]LANCHE [5]JANTA [6]SAIR");
                    String tipo_de_comida = input_da_comida.nextLine();
                    while (!tipo_de_comida.equals("6")){
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

                        }

                        System.out.println("Qual comida quer adicionar em seu cardapio");
                        System.out.println("[1]CAFE DA MANHA [2]ALMOÇO [3]SOBREMESA [4]LANCHE [5]JANTA [6]SAIR");
                        tipo_de_comida = input_da_comida.nextLine();

                    }break;
                case "3":
                    encontrando_valor();

                case "4":
                    cadastro_de_repeticao = variavel;
            }
        }




    }


    ////////////////////////adicionando ao cardapio//////////////////////////////////
    private void adcionando_cafedamanha(){
        System.out.println("Digite o valor do Cafe Da Manhã que será adiiconado");
        String adicioanndo_valor_cafedamanha = input_da_comida.nextLine();
        System.out.println("Digite o Cafe Da Manhã que será adicionado");
        String adicionando_cafe_da_manha;
        adicionando_cafe_da_manha = input_da_comida.nextLine();
        Cafe_da_manhalist.add("R$: "+adicioanndo_valor_cafedamanha+ ", "+adicionando_cafe_da_manha);
        System.out.println("CAFÉ DA MANHA ADICIONADO COM SUCESSO!!!");

    }
    private  void adicionando_almoco(){
        System.out.println("Digite o valor do Almoço que será adicioando");
        String adicionando_valor_almoco = input_da_comida.nextLine();
        System.out.println("Digite o Almoço que será adicionado");
        String adcionando_almoco = input_da_comida.nextLine();
        Almocolist.add("R$: "+adicionando_valor_almoco+ ", "+adcionando_almoco);
        System.out.println("ALMOÇO ADICIONADO COM SUCESSO!!!");

    }
    private void adicionando_sobremesa(){
        System.out.println("Digite o valor da Sobremesa que será adicionada");
        String adicionando_valor_sonbremesa = input_da_comida.nextLine();
        System.out.println("Digite a Sobremesa que será adicionada");
        String adicionanddo_sobremesa = input_da_comida.nextLine();
        Sobremesalist.add("R$: "+ adicionando_valor_sonbremesa + ", " + adicionanddo_sobremesa);
        System.out.println("SOBREMESA ADICIONADA COM SUCESSO!!!");
    }
    private void adicionando_lanche(){
        System.out.println("Digite o valor do Lanche que será adicionado");
        String adicionando_valor_lanche = input_da_comida.nextLine();
        System.out.println("Digite o Lanche que será adicionado");
        String adicionando_lanche = input_da_comida.nextLine();
        Lanchelist.add("R$: "+adicionando_valor_lanche +", " + adicionando_lanche);
        System.out.println("LANCHE ADICIONADO COM SUCESSO!!!");
    }
    private void adicionando_janta(){
        System.out.println("Digite o valor do Lanche que será adicionado");
        String adicionando_valor_janta = input_da_comida.nextLine();
        System.out.println("Digite a Janta que será adicionada");
        String adicionando_janta = input_da_comida.nextLine();
        Jantalist.add("R$: "+ adicionando_valor_janta + ", " + adicionando_janta);
        System.out.println("JANTA ADICIONADA COM SUCESSO!!!");
    }




//////////////////mostrando cardapio//////////////////////////////////////////
    public void mostrando_cafedamanha(){
            System.out.println("MOSTRANDO CAFE DA MANHA");
            for (int i = 0; i < Cafe_da_manhalist.size(); i++) {
            System.out.println(Cafe_da_manhalist.get(i));
            }
        }

    public void mostrando_almoco(){
            System.out.println("MOSTRANDO ALMOÇO");
        for (int i = 0; i < Almocolist.size(); i++) {
            System.out.println(Almocolist.get(i));
        }
    }
    public void mostrando_sobremesa() {
        System.out.println("MOSTRANDO SOBREMESA");
        for (int i = 0; i < Sobremesalist.size(); i++) {
            System.out.println(Sobremesalist.get(i));

        }
    }
    public void mostrando_lanche(){
        System.out.println("MOSTRANDO LANCHE");
        for (int i = 0; i< Lanchelist.size(); i++){
            System.out.println(Lanchelist.get(i));
        }
    }

    public void mostrando_janta(){
        System.out.println("MOSTRANDO JANTA");
        for (int i =0; i < Jantalist.size(); i++){
            System.out.println(Jantalist.get(i));
        }
    }
///////////////////excluindo do cardapio/////////////////////////////////////////////////////

public void encontrando_valor(){
    System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
    System.out.println("digite o valor e nome da comida assim como esta adicionado");
    System.out.print("DIGITE O VALOR: ");
    String valor_excluido = input_da_comida.nextLine();
    System.out.println("");
    System.out.print("DIGITE O NOME DA COMIDA: ");
    String comida_excluida = input_da_comida.nextLine();
    if(Cafe_da_manhalist.contains("R$: "+ valor_excluido+", "+comida_excluida)){
        System.out.println("foi encontrado no cafe da manha");
    }else if(Almocolist.contains("R$: "+ valor_excluido+", "+comida_excluida)){
        System.out.println("foi encontrado no almoco");
    } else if (Sobremesalist.contains("R$: "+ valor_excluido+", "+comida_excluida)) {
        System.out.println("foi encontrado na sobremesa");
    } else if (Lanchelist.contains("R$: "+ valor_excluido+", "+comida_excluida)) {
        System.out.println("foi encontrado no lanche");
    } else if (Jantalist.contains("R$: "+ valor_excluido+", "+comida_excluida)) {
        System.out.println("foi encontrado na janta");
    }else {
        System.out.println("nao foi encontrado");
    }
}





    //private void excluindo_do_cardapio(){
        
    //}


    public String getCafe_da_manha() {
        return cafe_da_manha;
    }

    public void setCafe_da_manha(String cafe_da_manha) {
        this.cafe_da_manha = cafe_da_manha;
    }

    public String getAlmoco() {
        return almoco;
    }

    public void setAlmoco(String almoco) {
        this.almoco = almoco;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public String getJanta() {
        return janta;
    }

    public void setJanta(String janta) {
        this.janta = janta;
    }    
}
