/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Editar {
    private String Combustiveis;
    private double NovoValor;
    
    //Construtor Vazio
    public Editar(){
        
    }//fim do construtor vazio
    
    // Construtor de classe
    public Editar(String Combustiveis, double NovoValor) {
        this.Combustiveis = Combustiveis;
        this.NovoValor = NovoValor;
    }//fim do construtor

    //Métodos Set & Get
    public String getCombustiveis() {
        return Combustiveis;
    }

    public void setCombustiveis(String Combustiveis) {
        this.Combustiveis = Combustiveis;
    }
    
    public double getNovoValor() {
        return NovoValor;
    }

    public void setNovoValor(double NovoValor) {
        this.NovoValor = NovoValor;
    }
    
}
