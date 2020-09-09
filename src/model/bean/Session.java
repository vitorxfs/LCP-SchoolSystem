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
public class Session {
        private static Session instancia;
    private int tipo; //professor = 0; aluno = 1
    private int id; //id do professor ou ra do aluno
    
    public Session(int tipo, int id){
        this.tipo = tipo;
        this.id = id;
    }
    
    public static Session getSession(int tipo, int id) {
        instancia = new Session(tipo, id);
        return instancia;
    }
    
    public static Session getSession(){
        return instancia;
    }

    public int getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }
    
    public void logOut(){
        instancia = null;
    }
}
