package servicos;
import java.util.Scanner;
import entidades.Bebida;
import repositorios.BebidaRepositorio;

public class BebidaServico {
    Scanner inputbebida = new Scanner(System.in);
    BebidaRepositorio respositoriobebida = new BebidaRepositorio();
    public void cadastrar(){
        System.out.println("QUAL BEBIDA VAI ADICIONAR?");
        String nomeb = inputbebida.nextLine();
        System.out.println("QUAL SERA SEU PRECO?");
        String precob = inputbebida.nextLine();
        System.out.println("QUAL A QUANTIDADE DE >ML< DA BEBIDA OFERECIDA");
        String mlb = inputbebida.nextLine();
        

        respositoriobebida.salvar(new Bebida(nomeb, precob, mlb));

    }
    public void mostrando_bebida(){
        respositoriobebida.mostrando_bebida();
    }
    public void removendo_bebida(){
        respositoriobebida.excluindo_bebida();
    }
    
}
