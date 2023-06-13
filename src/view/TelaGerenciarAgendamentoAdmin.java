package view;

import controller.AgendaController;
import java.sql.Connection;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import model.Usuario;
import model.dao.ModelConnect;

public class TelaGerenciarAgendamentoAdmin extends javax.swing.JFrame {

    private final AgendaController controller;
    Connection con;
    private Integer id;
    private Usuario user_authenticated = new Usuario();
    
    public TelaGerenciarAgendamentoAdmin() {
        initComponents();
        controller = new AgendaController(this);
        con = ModelConnect.getConectar();
        System.out.println(con);
        inicia();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFeito = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnReagendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAgendamento = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbGerenciarAgendamentos = new javax.swing.JLabel();
        lbGerenciarUsuarios = new javax.swing.JLabel();
        lbGerenciarFuncionarios = new javax.swing.JLabel();
        lblMenuPrincipal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnFeito.setBackground(new java.awt.Color(102, 102, 102));
        btnFeito.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFeito.setForeground(new java.awt.Color(255, 255, 255));
        btnFeito.setText("Feito");
        btnFeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeitoActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(0, 255, 102));
        btnConfirm.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirma Agendamento");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnReagendar.setBackground(new java.awt.Color(0, 51, 102));
        btnReagendar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReagendar.setForeground(new java.awt.Color(255, 255, 255));
        btnReagendar.setText("Reagendar");
        btnReagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReagendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnConfirm)
                .addGap(32, 32, 32)
                .addComponent(btnReagendar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnFeito, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFeito, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReagendar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        tbAgendamento = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Horário", "Cliente", "Serviço", "Funcionario", "Situação"
            }
        ));
        tbAgendamento.setFocusable(false);
        tbAgendamento.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbAgendamento);

        jPanel4.setBackground(new java.awt.Color(153, 0, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbGerenciarAgendamentos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbGerenciarAgendamentos.setForeground(new java.awt.Color(255, 255, 255));
        lbGerenciarAgendamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icon-agenda.png"))); // NOI18N
        lbGerenciarAgendamentos.setText("Gerenciar agendamentos");
        lbGerenciarAgendamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbGerenciarAgendamentos.setPreferredSize(new java.awt.Dimension(213, 27));
        lbGerenciarAgendamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGerenciarAgendamentosMouseClicked(evt);
            }
        });
        jPanel4.add(lbGerenciarAgendamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 279, 55));

        lbGerenciarUsuarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbGerenciarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lbGerenciarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icon-usuarios.png"))); // NOI18N
        lbGerenciarUsuarios.setText("Gerenciar Usuários");
        lbGerenciarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbGerenciarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGerenciarUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbGerenciarUsuariosMouseEntered(evt);
            }
        });
        jPanel4.add(lbGerenciarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 279, 55));

        lbGerenciarFuncionarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbGerenciarFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        lbGerenciarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icon-funcionarios.png"))); // NOI18N
        lbGerenciarFuncionarios.setText("Gerenciar Funcionários");
        lbGerenciarFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbGerenciarFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGerenciarFuncionariosMouseClicked(evt);
            }
        });
        jPanel4.add(lbGerenciarFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 279, 55));

        lblMenuPrincipal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icon_home.png"))); // NOI18N
        lblMenuPrincipal.setText("Menu Principal");
        lblMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuPrincipalMouseClicked(evt);
            }
        });
        jPanel4.add(lblMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 279, 55));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/logo-menu.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 120));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        try {
            this.controller.confirmaAgendamento();
        } catch (ParseException ex) {
            Logger.getLogger(TelaGerenciarAgendamentoAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnFeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeitoActionPerformed
        
        try {
            this.controller.marcarComoFeito();
        } catch (ParseException ex) {
            Logger.getLogger(TelaGerenciarAgendamentoAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnFeitoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            this.controller.cancelarAgendamento();
        } catch (ParseException ex) {
            Logger.getLogger(TelaGerenciarAgendamentoAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnReagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReagendarActionPerformed
        
        this.controller.abrirSubview();
        
    }//GEN-LAST:event_btnReagendarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.controller.atualizaTabela();
    }//GEN-LAST:event_formWindowActivated

    private void lbGerenciarAgendamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarAgendamentosMouseClicked
        this.controller.abrirGerenciarAgendamentos();
    }//GEN-LAST:event_lbGerenciarAgendamentosMouseClicked

    private void lbGerenciarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarUsuariosMouseClicked
        this.controller.abrirGerenciarUsuarios();
    }//GEN-LAST:event_lbGerenciarUsuariosMouseClicked

    private void lbGerenciarUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarUsuariosMouseEntered
        
    }//GEN-LAST:event_lbGerenciarUsuariosMouseEntered

    private void lbGerenciarFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarFuncionariosMouseClicked
        this.controller.abrirGerenciarFuncionarios();
    }//GEN-LAST:event_lbGerenciarFuncionariosMouseClicked

    private void lblMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPrincipalMouseClicked
        this.controller.abrirMenuPrincipal();
    }//GEN-LAST:event_lblMenuPrincipalMouseClicked

   
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
            java.util.logging.Logger.getLogger(TelaGerenciarAgendamentoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarAgendamentoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarAgendamentoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarAgendamentoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarAgendamentoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnFeito;
    private javax.swing.JButton btnReagendar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbGerenciarAgendamentos;
    private javax.swing.JLabel lbGerenciarFuncionarios;
    private javax.swing.JLabel lbGerenciarUsuarios;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JTable tbAgendamento;
    // End of variables declaration//GEN-END:variables

    private void inicia() {
        this.controller.atualizaTabela();
    }

    public JTable getTbAgendamento() {
        return tbAgendamento;
    }

    public void setTbAgendamento(JTable tbAgendamento) {
        this.tbAgendamento = tbAgendamento;
    }

    public Usuario getUser_authenticated() {
        return user_authenticated;
    }

    public void setUser_authenticated(Usuario user_authenticated) {
        this.user_authenticated = user_authenticated;
    }
    
    
    
    
}
