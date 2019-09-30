/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Senha {
    private String Senha;


//Construtor Vazio
    public Senha(){
        
    }//fim do construtor vazio
    
    // Construtor de classe
    public Senha(String Senha) {
        this.Senha = Senha;
    }//fim do construtor

    //Métodos Set & Get
    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

}