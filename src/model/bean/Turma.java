/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author MIcro
 */
public class Turma {
    private int id;
    private String serie;
    private String letra;
    private String periodo;
  

    public Turma(){
    
    }
    public Turma(String serie){
        this.serie = serie;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
   
   
    public String toString() {
        return getSerie();
        //return getLetra(); //To change body of generated methods, choose Tools | Templates.
    }
    
}