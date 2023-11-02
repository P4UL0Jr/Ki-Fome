package repositorios;
import java.util.ArrayList;
import entidades.Bebida;
import java.util.Scanner;

public class BebidaRepositorio {
    private ArrayList <Bebida> bebidalist = new ArrayList<>();
    private Scanner input_da_bebida = new Scanner(System.in);

    public void salvar(Bebida bebida){
        bebidalist.add(bebida);

    }

    ////////mostrando bebida/////////////////
    public void mostrando_bebida(){
        System.out.println("MOSTRANDO BBEBIDA");
        for (int i =0; i < bebidalist.size(); i++){
            System.out.println(i+1 + "º__"+bebidalist.get(i).getNome()+ "__R$:"+ bebidalist.get(i).getValor()+ "__ml "+bebidalist.get(i).getMl());

        }
    }
    ////////excluindo bebida///////////////////
    public void excluindo_bebida(){
        System.out.println("QUAL COMIDA DESEJA EXCLUIR DO CARDAPIO?");
        String excluindo_comida = input_da_bebida.nextLine();
        for (Bebida b : bebidalist) {
            if(b.getNome().equalsIgnoreCase(excluindo_comida)){
                System.out.println("Econtrado na -BEBIDA-");
                bebidalist.remove(b);
                System.out.println("Excluido com sucesso");
            }
        }
            
    }
    
}
