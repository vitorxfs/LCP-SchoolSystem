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
public class Desempenho {
    public int id;
    public int aluno_id;
    public int disciplina_id;
    public float nota_1bimestre;
    public float nota_2bimestre;
    public float nota_3bimestre;
    public float nota_4bimestre;
    public float media_final;
    public float frequencia;
    
    public float getNota_4bimestre() {
        return nota_4bimestre;
    }

    public void setNota_4bimestre(float nota_4bimestre) {
        this.nota_4bimestre = nota_4bimestre;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAluno_id() {
        return aluno_id;
    }

    public void setAluno_id(int aluno_id) {
        this.aluno_id = aluno_id;
    }

    public int getDisciplina_id() {
        return disciplina_id;
    }

    public void setDisciplina_id(int disciplina_id) {
        this.disciplina_id = disciplina_id;
    }

    public float getNota_1bimestre() {
        return nota_1bimestre;
    }

    public void setNota_1bimestre(float nota_1bimestre) {
        this.nota_1bimestre = nota_1bimestre;
    }

    public float getNota_2bimestre() {
        return nota_2bimestre;
    }

    public void setNota_2bimestre(float nota_2bimestre) {
        this.nota_2bimestre = nota_2bimestre;
    }

    public float getNota_3bimestre() {
        return nota_3bimestre;
    }

    public void setNota_3bimestre(float nota_3bimestre) {
        this.nota_3bimestre = nota_3bimestre;

    }

    public float getMedia_final() {
        return media_final;
    }

    public void setMedia_final(float media_final) {
        this.media_final = media_final;
    }
    
    public void calculaMediaFinal(){
        float n1 = getNota_1bimestre();
        float n2 = getNota_2bimestre();
        float n3 = getNota_3bimestre();
        float n4 = getNota_4bimestre();
        
        this.media_final = (float)(n1+n2+n3+n4)/4.0f;
        System.out.println(this.media_final);
    }
    
    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }
    
    
}
