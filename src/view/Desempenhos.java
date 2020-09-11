/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import model.bean.Session;

/**
 *
 * @author MIcro
 */
@Entity
@Table(name = "desempenhos", catalog = "escola", schema = "")

@NamedQueries({
    @NamedQuery(name = "Desempenhos.findAll", query = "SELECT d FROM Desempenhos d WHERE d.alunoId = :alunoId ")
    , @NamedQuery(name = "Desempenhos.findById", query = "SELECT d FROM Desempenhos d WHERE d.id = :id")
    , @NamedQuery(name = "Desempenhos.findByAlunoId", query = "SELECT d FROM Desempenhos d WHERE d.alunoId = :alunoId")
    , @NamedQuery(name = "Desempenhos.findByProfessorId", query = "SELECT d FROM Desempenhos d WHERE d.professorId = :professorId")
    , @NamedQuery(name = "Desempenhos.findByNota1bimestre", query = "SELECT d FROM Desempenhos d WHERE d.nota1bimestre = :nota1bimestre")
    , @NamedQuery(name = "Desempenhos.findByNota2bimestre", query = "SELECT d FROM Desempenhos d WHERE d.nota2bimestre = :nota2bimestre")
    , @NamedQuery(name = "Desempenhos.findByNota3bimestre", query = "SELECT d FROM Desempenhos d WHERE d.nota3bimestre = :nota3bimestre")
    , @NamedQuery(name = "Desempenhos.findByNota4bimestre", query = "SELECT d FROM Desempenhos d WHERE d.nota4bimestre = :nota4bimestre")
    , @NamedQuery(name = "Desempenhos.findByMediaFinal", query = "SELECT d FROM Desempenhos d WHERE d.mediaFinal = :mediaFinal")
    , @NamedQuery(name = "Desempenhos.findByFrequencia", query = "SELECT d FROM Desempenhos d WHERE d.frequencia = :frequencia")
    , @NamedQuery(name = "Desempenhos.findByDisciplina", query = "SELECT d FROM Desempenhos d WHERE d.disciplina = :disciplina")})
public class Desempenhos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "aluno_id")
    private int alunoId =1;
    
    @Basic(optional = false)
    @Column(name = "professor_id")
    private int professorId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "nota_1bimestre")
    private Float nota1bimestre;
    @Column(name = "nota_2bimestre")
    private Float nota2bimestre;
    @Column(name = "nota_3bimestre")
    private Float nota3bimestre;
    @Column(name = "nota_4bimestre")
    private Float nota4bimestre;
    @Column(name = "media_final")
    private Float mediaFinal;
    @Column(name = "frequencia")
    private Float frequencia;
    @Column(name = "disciplina")
    private String disciplina;

    public Desempenhos() {
    }

    public Desempenhos(Integer id) {
        this.id = id;
    }

    public Desempenhos(Integer id, int alunoId, int professorId) {
        this.id = id;
        this.alunoId = alunoId;
        this.professorId = professorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        int oldAlunoId = this.alunoId;
        this.alunoId = 1;
        changeSupport.firePropertyChange("alunoId", oldAlunoId, 1);
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        int oldProfessorId = this.professorId;
        this.professorId = professorId;
        changeSupport.firePropertyChange("professorId", oldProfessorId, professorId);
    }

    public Float getNota1bimestre() {
        return nota1bimestre;
    }

    public void setNota1bimestre(Float nota1bimestre) {
        Float oldNota1bimestre = this.nota1bimestre;
        this.nota1bimestre = nota1bimestre;
        changeSupport.firePropertyChange("nota1bimestre", oldNota1bimestre, nota1bimestre);
    }

    public Float getNota2bimestre() {
        return nota2bimestre;
    }

    public void setNota2bimestre(Float nota2bimestre) {
        Float oldNota2bimestre = this.nota2bimestre;
        this.nota2bimestre = nota2bimestre;
        changeSupport.firePropertyChange("nota2bimestre", oldNota2bimestre, nota2bimestre);
    }

    public Float getNota3bimestre() {
        return nota3bimestre;
    }

    public void setNota3bimestre(Float nota3bimestre) {
        Float oldNota3bimestre = this.nota3bimestre;
        this.nota3bimestre = nota3bimestre;
        changeSupport.firePropertyChange("nota3bimestre", oldNota3bimestre, nota3bimestre);
    }

    public Float getNota4bimestre() {
        return nota4bimestre;
    }

    public void setNota4bimestre(Float nota4bimestre) {
        Float oldNota4bimestre = this.nota4bimestre;
        this.nota4bimestre = nota4bimestre;
        changeSupport.firePropertyChange("nota4bimestre", oldNota4bimestre, nota4bimestre);
    }

    public Float getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(Float mediaFinal) {
        Float oldMediaFinal = this.mediaFinal;
        this.mediaFinal = mediaFinal;
        changeSupport.firePropertyChange("mediaFinal", oldMediaFinal, mediaFinal);
    }

    public Float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Float frequencia) {
        Float oldFrequencia = this.frequencia;
        this.frequencia = frequencia;
        changeSupport.firePropertyChange("frequencia", oldFrequencia, frequencia);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        String oldDisciplina = this.disciplina;
        this.disciplina = disciplina;
        changeSupport.firePropertyChange("disciplina", oldDisciplina, disciplina);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Desempenhos)) {
            return false;
        }
        Desempenhos other = (Desempenhos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Desempenhos[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
