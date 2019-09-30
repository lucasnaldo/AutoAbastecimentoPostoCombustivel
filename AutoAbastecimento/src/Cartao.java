/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Cartao {
    private String cartao;
    private String simNaoCPF;
    private String CPF;

//Construtor Vazio
    public Cartao(){
        
    }//fim do construtor vazio
    
    // Construtor de classe
    public Cartao(String cartao, String simNaoCPF, String CPF) {
        this.cartao = cartao;
        this.simNaoCPF = simNaoCPF;
        this.CPF = CPF;
    }//fim do construtor
    
    
    //Métodos Set & Get

    public String getCartao() {
        return cartao;
    }

     public void setCartao(String cartao) {
        this.cartao = cartao;
    }

     public String getSimNaoCPF() {
        return simNaoCPF;
    }

     public void setSimNaoCPF(String simNaoCPF) {
        this.simNaoCPF = simNaoCPF;
    }    
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}