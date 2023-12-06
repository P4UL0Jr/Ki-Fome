package servicos;
import java.util.Scanner;


public class EntregadorServico extends CadastroServico{
    Scanner input_do_entregador = new Scanner(System.in);
    private String placa;



    public void cadastro_do_entregador  () {
        
        System.out.println("Digite o Veículo do Entregador");
        System.out.println("-----------------------------");
        System.out.println("[1] - Bicicleta");
        System.out.println("[2] - Moto");
        String veículo_do_entregador = input_do_entregador.nextLine();
        if (veículo_do_entregador.equals("2")){
            System.out.print("Digite a placa:");
            String Placa_do_entregador = input_do_entregador.nextLine();
            
        }
        cadastro();
    }



    public Scanner getInput_do_entregador() {
        return input_do_entregador;
    }



    public void setInput_do_entregador(Scanner input_do_entregador) {
        this.input_do_entregador = input_do_entregador;
    }



    public String getPlaca() {
        return placa;
    }



    public void setPlaca(String placa) {
        this.placa = placa;
    }
    

    

}
