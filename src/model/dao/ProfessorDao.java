/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import model.bean.Professor;
import model.bean.Session;

/**
 *
 * @author MIcro
 */
public class ProfessorDao {
    
    public void create(Professor p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO professores (nome, email,login,senha, turma_serie, disciplina) VALUES (?,?,?,?,?,?)");
            
            
            stat.setString(1, p.getNome());
            stat.setString(2, p.getEmail());
            stat.setString(3, p.getLogin());
            stat.setString(4, p.getSenha());
            stat.setString(5, p.getTurma_serie());
            stat.setString(6, p.getDiscplina());
            
            stat.executeUpdate();
                    
            JOptionPane.showMessageDialog(null, "Professor(a) cadastrado com sucesso!");
             
        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, " Erro - Professor(a) não cadastrado");
        }
        finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }

    public void update(Professor p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE professores SET nome = ? , email = ?, login = ?, senha = ?, turma_serie = ?, disciplina = ? WHERE id = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setString(3, p.getLogin());
            stmt.setString(4, p.getSenha());
            stmt.setString(5, p.getTurma_serie());
            stmt.setString(6, p.getDiscplina());
            stmt.setInt(7, Session.getSession().getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

}
}
