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
import model.bean.Session;

/**
 *
 * @author MIcro
 */
public class AlunoDao {
    
    public void create(Aluno a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO alunos (ra, nome,login,senha) VALUES (?,?,?,? )");
            stat.setInt(1,a.getRa());
            stat.setString(2, a.getNome());
            stat.setString(3, a.getLogin());
            stat.setString(4, a.getSenha());
            
            stat.executeUpdate();
                    
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
             
        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, " Erro - Aluno não cadastrado");
        }
        finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }
    
    
    public void update(Aluno a) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE alunos SET nome = ? ,login = ?,senha = ? WHERE ra = ?");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getLogin());
            stmt.setString(3, a.getSenha());
            stmt.setInt(4, Session.getSession().getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

}
}
