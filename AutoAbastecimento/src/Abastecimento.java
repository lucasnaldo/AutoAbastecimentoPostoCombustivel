/**
 * Classe criada para gerar objetos do tipo valor com dados que forem
 * coletados do FrameValorLitragem
 * @author Lucas Naldo
 * @since classe criada em 26/09/2016
 */
/**
 *
 * @author Lucas
 */
public class Abastecimento {
    //panelValor
    private double valor;
    private double litragem;
    private String tipo;
    //panelCreditoDebito
    private String creditoDebito;
    
//Construtor Vazio
    public Abastecimento(){
        
    }//fim do construtor vazio
    
    // Construtor de classe
    public Abastecimento(double valor, double litragem, String tipo, String creditoDebito) {
        this.valor = valor;
        this.litragem = litragem;
        this.tipo = tipo;
        this.creditoDebito = creditoDebito;
    }//fim do construtor

    //Métodos Set & Get
       
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getLitragem() {
        return litragem;
    }

    public void setLitragem(double litragem) {
        this.litragem = litragem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebito(String creditoDebito) {
        this.creditoDebito = creditoDebito;
    }

    Object getAbastecimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//fim da classe