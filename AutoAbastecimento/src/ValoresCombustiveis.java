/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */

//valor GasolinaComum = 3,10 o litro
//valor GasolinaAditivada = 3,50 o litro
//valor Alcool = 2,20 o litro
//valor Diesel = 2,80 o litro
public class ValoresCombustiveis {
    public static double gasolinaComum;
    public static double gasolinaAditivada;
    public static double alcool;
    public static double diesel;

//Construtor Vazio
    public ValoresCombustiveis(){
        
    }//fim do construtor vazio
    
    // Construtor de classe
    public ValoresCombustiveis(double gasolinaComum, double gasolinaAditivada, double alcool, double diesel) {
        this.gasolinaComum = gasolinaComum;
        this.gasolinaAditivada= gasolinaAditivada;
        this.alcool = alcool;
        this.diesel = diesel;
    }//fim do construtor

    //Métodos Set & Get

    public double getGasolinaComum() {
        return gasolinaComum;
    }

    public void setGasolinaComum(double gasolinaComum) {
        this.gasolinaComum = gasolinaComum;
    }

    public double getGasolinaAditivada() {
        return gasolinaAditivada;
    }

    public void setGasolinaAditivada(double gasolinaAditivada) {
        this.gasolinaAditivada = gasolinaAditivada;
    }

    public double getAlcool() {
        return alcool;
    }

    public void setAlcool(double alcool) {
        this.alcool = alcool;
    }

    public double getDiesel() {
        return diesel;
    }

    public void setDiesel(double diesel) {
        this.diesel = diesel;
    }
}//fim da classe