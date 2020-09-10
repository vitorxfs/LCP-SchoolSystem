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

/**
 *
 * @author MIcro
 */
@Entity
@Table(name = "professores", catalog = "escola", schema = "")
@NamedQueries({
    @NamedQuery(name = "Professores.findAll", query = "SELECT p FROM Professores p")
    , @NamedQuery(name = "Professores.findById", query = "SELECT p FROM Professores p WHERE p.id = :id")
    , @NamedQuery(name = "Professores.findByNome", query = "SELECT p FROM Professores p WHERE p.nome = :nome")
    , @NamedQuery(name = "Professores.findByEmail", query = "SELECT p FROM Professores p WHERE p.email = :email")
    , @NamedQuery(name = "Professores.findByLogin", query = "SELECT p FROM Professores p WHERE p.login = :login")
    , @NamedQuery(name = "Professores.findBySenha", query = "SELECT p FROM Professores p WHERE p.senha = :senha")
    , @NamedQuery(name = "Professores.findByTurmaSerie", query = "SELECT p FROM Professores p WHERE p.turmaSerie = :turmaSerie")
    , @NamedQuery(name = "Professores.findByDisciplina", query = "SELECT p FROM Professores p WHERE p.disciplina = :disciplina")})
public class Professores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "turma_serie")
    private String turmaSerie;
    @Basic(optional = false)
    @Column(name = "disciplina")
    private String disciplina;

    public Professores() {
    }

    public Professores(Integer id) {
        this.id = id;
    }

    public Professores(Integer id, String nome, String email, String login, String senha, String turmaSerie, String disciplina) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.turmaSerie = turmaSerie;
        this.disciplina = disciplina;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getTurmaSerie() {
        return turmaSerie;
    }

    public void setTurmaSerie(String turmaSerie) {
        String oldTurmaSerie = this.turmaSerie;
        this.turmaSerie = turmaSerie;
        changeSupport.firePropertyChange("turmaSerie", oldTurmaSerie, turmaSerie);
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
        if (!(object instanceof Professores)) {
            return false;
        }
        Professores other = (Professores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Professores[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
