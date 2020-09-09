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
public class Professor {
    
    private int id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private String turma_serie;
    private String discplina;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTurma_serie() {
        return turma_serie;
    }

    public void setTurma_serie(String turma_serie) {
        this.turma_serie = turma_serie;
    }

    public String getDiscplina() {
        return discplina;
    }

    public void setDiscplina(String discplina) {
        this.discplina = discplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}
