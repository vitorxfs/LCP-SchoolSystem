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
public class Aluno {
    private int ra;
    private String nome;
    private String login;
    private String senha;
    
    
    /*public Aluno(){
        
    }
    public Aluno(int ra, String nome, String login, String senha, int turma_id) {
        this.ra = ra;
        this.nome = nome;
        this.login = login;
        this.turma_id = turma_id;
    }*/

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
