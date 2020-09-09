/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Disciplina;

/**
 *
 * @author MIcro
 */
public class DisciplinaDao {
    private Connection con = null;

    public DisciplinaDao() {
        con = ConnectionFactory.getConnection();
    }

        public List<Disciplina> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Disciplina> disc = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM disciplinas");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Disciplina d = new Disciplina();

                d.setId(rs.getInt("id"));
                d.setNome(rs.getString("nome"));
                d.setDescricao(rs.getString("descricao"));
                d.setProfessor_id(rs.getInt("professor_id"));
                d.setTurma_id(rs.getInt("turma_id"));
                disc.add(d);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return disc;

    }
    }


