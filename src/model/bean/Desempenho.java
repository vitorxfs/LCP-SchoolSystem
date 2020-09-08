/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author vitor
 */
public class Desempenho {
    private int id;
    private Aluno aluno;
    private Disciplina disciplina;
    private float nota_1b;
    private float nota_2b;
    private float nota_3b;
    private float nota_4b;
    private float media_final;
    private float frequencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota_1b() {
        return nota_1b;
    }

    public void setNota_1b(float nota_1b) {
        this.nota_1b = nota_1b;
    }

    public float getNota_2b() {
        return nota_2b;
    }

    public void setNota_2b(float nota_2b) {
        this.nota_2b = nota_2b;
    }

    public float getNota_3b() {
        return nota_3b;
    }

    public void setNota_3b(float nota_3b) {
        this.nota_3b = nota_3b;
    }

    public float getNota_4b() {
        return nota_4b;
    }

    public void setNota_4b(float nota_4b) {
        this.nota_4b = nota_4b;
    }

    public float getMedia_final() {
        return media_final;
    }

    public void setMedia_final(float media_final) {
        this.media_final = media_final;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }
    
    
}
