package lixo;

public class Bebida {
    private String ml;
    private String nome;
    private String valor;

   
    

    


    public Bebida(String add_bebida, String preco_bebida, String ml_bebida) {
        this.nome = add_bebida;
        this.valor =preco_bebida;
        this.ml = ml_bebida;
    }






    public String getNome() {
        return nome;
    }

    public String getMl() {
        return ml;
    }

    public void setMl(String ml) {
        this.ml = ml;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }




    


    
}
