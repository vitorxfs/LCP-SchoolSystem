/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.bean.Aluno;
import model.bean.Turma;
import model.dao.AlunoDao;
import model.dao.TurmaDao;

/**
 *
 * @author MIcro
 */
public class TelaCadastroAluno extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroAluno
     */
    public TelaCadastroAluno() {
        //this.turma = (Turma) cb_series.getSelectedItem();
        initComponents();
        
        TurmaDao dao = new TurmaDao();
        
        for(Turma t: dao.read()){
            cb_series.addItem(t);
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_ra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_series = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tf_login = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_senha = new javax.swing.JPasswordField();
        bt_cadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setTitle("Cadastro Aluno");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel1.setText("Cadastro Aluno");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LCP/aluno1.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Nome Completo:");

        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("RA:");

        tf_ra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_raActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Turma: ");

        cb_series.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_series.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seriesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Login:");

        tf_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_loginActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Senha:");

        tf_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_senhaActionPerformed(evt);
            }
        });

        bt_cadastrar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        bt_cadastrar.setText("CADASTRAR");
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel8)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_series, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nome)
                            .addComponent(tf_ra)
                            .addComponent(tf_login)
                            .addComponent(tf_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_cadastrar)
                .addGap(297, 297, 297))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb_series, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(bt_cadastrar)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void throwsException(String campo) throws Exception{
        
        if(campo.isEmpty()){
            throw new Exception("Erro - Campo em branco");
            
        }
    }
   /* private void throwsException1(String n) throws Exception{
        if(n.equals(" "))
            throw new Exception("Erro - Nenhuma turma selecionada");
    }*/
    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void tf_raActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_raActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_raActionPerformed

    private void tf_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_loginActionPerformed

    private void tf_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_senhaActionPerformed

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        // TODO add your handling code here:
        
        Aluno a = new Aluno();
        AlunoDao dao = new AlunoDao();
        
        boolean flag1 = false, flag2 = false;
        //Turma turma = (Turma) cb_series.getSelectedItem();
        
        //Tratando as exceções em caso de algum campo estar em branco   
        try{
            String nome = tf_nome.getText();
            if(nome.isEmpty() == true){
                throwsException(nome);
            }
            
        }
        catch(Exception nome){
            JOptionPane.showMessageDialog(null,"Erro - Campo Nome em branco", "ERRO", 0);
            flag1 = true;
        }
        
        try{
            String ra = tf_ra.getText();
            if(ra.isEmpty() == true){
                throwsException(ra);
            }
        }
        catch(Exception ra){
            JOptionPane.showMessageDialog(null,"Erro - Campo ra em branco", "ERRO", 0);
            flag2 = true;
        }
       
        /*
       try{
           
           String indiceSelecionado = (String) cb_series.getSelectedItem();
            if(indiceSelecionado.equals(" ")){
                throwsException1(indiceSelecionado);
            }
        }
        catch(Exception indiceSelecionado){
            JOptionPane.showMessageDialog(null,"Erro - Selecione uma Turma", "ERRO", 0);
            flag2 = true;
        }*/
        
        try{
            String login = tf_login.getText();
            if(login.isEmpty() == true){
                throwsException(login);
            }
        }
        catch(Exception login){
            JOptionPane.showMessageDialog(null,"Erro - Campo login em branco", "ERRO", 0);
            flag2 = true;
        }
        
        try{
            String senha = tf_senha.getText();
            if(senha.isEmpty() == true){
                throwsException(senha);
            }
        }
        catch(Exception senha){
            JOptionPane.showMessageDialog(null,"Erro - Campo senha em branco", "ERRO", 0);
            flag2 = true;
        }
        
        
        a.setNome(tf_nome.getText());
        a.setRa(Integer.parseInt(tf_ra.getText()));
        a.setTurma_id(cb_series.getSelectedIndex());
        a.setLogin(tf_login.getText());
        a.setSenha(tf_senha.getText());
        
        dao.create(a);
               
               int i = cb_series.getSelectedIndex();
               System.out.printf(" %d ", i);
        
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void cb_seriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_seriesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JComboBox<Object> cb_series;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tf_login;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_ra;
    private javax.swing.JPasswordField tf_senha;
    // End of variables declaration//GEN-END:variables
}
