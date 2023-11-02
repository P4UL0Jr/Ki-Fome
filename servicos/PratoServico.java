package servicos;
import java.util.Scanner;
import entidades.Prato;
import repositorios.PratoRepositorio;

public class PratoServico {
private Scanner inputprato = new Scanner(System.in);
private PratoRepositorio repositoriopratocdm = new PratoRepositorio();
private PratoRepositorio repositoriopratoamc = new PratoRepositorio();
private PratoRepositorio repositoriopratosbm = new PratoRepositorio();
private PratoRepositorio repositoriopratolnc = new PratoRepositorio();
private PratoRepositorio repositoriopratojnt = new PratoRepositorio();

    
public void adcionando_cafedamanha(){
        
    System.out.println("Digite o Cafe Da Manhã que será adicionado");
    String cdm = inputprato.nextLine();
    System.out.println("Digite o valor do Cafe Da Manhã que será adiiconado");
    String vcdm = inputprato.nextLine();
    repositoriopratocdm.salvarcafedamanha(new Prato(cdm, vcdm ));
    System.out.println("CAFÉ DA MANHA ADICIONADO COM SUCESSO!!!");

    }
public  void adicionando_almoco(){
        
    System.out.println("Digite o Almoço que será adicionado");
    String adcionando_almoco = inputprato.nextLine();
    System.out.println("Digite o valor do Almoço que será adicioando");
    String adicionando_valor_almoco = inputprato.nextLine();
    repositoriopratoamc.salvaralmoco(new Prato(adcionando_almoco, adicionando_valor_almoco));
    System.out.println("ALMOÇO ADICIONADO COM SUCESSO!!!");

    }
public void adicionando_sobremesa(){
        
    System.out.println("Digite a Sobremesa que será adicionada");
    String adicionanddo_sobremesa = inputprato.nextLine();
    System.out.println("Digite o valor da Sobremesa que será adicionada");
    String adicionando_valor_sonbremesa = inputprato.nextLine();
    repositoriopratosbm.salvarsobremesa(new Prato(adicionanddo_sobremesa, adicionando_valor_sonbremesa));
    System.out.println("SOBREMESA ADICIONADA COM SUCESSO!!!");
    }
public void adicionando_lanche(){
        
    System.out.println("Digite o Lanche que será adicionado");
    String adicionando_lanche = inputprato.nextLine();
    System.out.println("Digite o valor do Lanche que será adicionado");
    String adicionando_valor_lanche = inputprato.nextLine();
    repositoriopratolnc.salvarlanche(new Prato(adicionando_lanche, adicionando_valor_lanche));
    System.out.println("LANCHE ADICIONADO COM SUCESSO!!!");
    }
public void adicionando_janta(){
        
    System.out.println("Digite a Janta que será adicionada");
    String adicionando_janta = inputprato.nextLine();
    System.out.println("Digite o valor do Lanche que será adicionado");
    String adicionando_valor_janta = inputprato.nextLine();
    repositoriopratojnt.salvarjanta(new Prato(adicionando_janta, adicionando_valor_janta));
    System.out.println("JANTA ADICIONADA COM SUCESSO!!!");
    
}
//////////////////mostrando prato do cardapio//////////////////
public void mostrando_cafe_da_manha(){
    repositoriopratocdm.mostrando_cafedamanha();
}
public void mostrando_almoco(){
    repositoriopratoamc.mostrando_almoco();
}
public void mostrando_sobremesa(){
    repositoriopratosbm.mostrando_sobremesa();
}
public void mostrando_lanche(){
    repositoriopratolnc.mostrando_lanche();
}
public void mostrando_janta(){
    repositoriopratojnt.mostrando_janta();
}
/////////////////////excluindo da array////////////////
public void excluindocafedamanha(){
    repositoriopratocdm.excluindo_cafedamanha();
}
public void excluindoalmoco(){
    repositoriopratoamc.excluindo_almoco();
}
public void excluindosobremesa(){
    repositoriopratosbm.excluindo_sobremesa();
}
public void excluindolanche(){
    repositoriopratolnc.excluindo_lanche();
}
public void excluindojanta(){
    repositoriopratojnt.excluindo_janta();
}

}


