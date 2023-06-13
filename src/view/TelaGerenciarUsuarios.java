
package view;

import controller.UsuarioController;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Usuario;
import model.dao.ModelConnect;

public class TelaGerenciarUsuarios extends javax.swing.JFrame {

    private final UsuarioController controller;
    Connection con;
    private Integer Id;
    Usuario user_authenticated = new Usuario();
      
    
    public TelaGerenciarUsuarios() {
        initComponents();
        controller = new UsuarioController(this);
        con = ModelConnect.getConectar();
        System.out.println(con);
        iniciarLista();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txvCliNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txvCliSexo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txvCliTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txvCliEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txvCliEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txvCliBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txvCliCep = new javax.swing.JTextField();
        txvCliCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txvPesquisar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txvCliCPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbGerenciarAgendamentos = new javax.swing.JLabel();
        lbGerenciarUsuarios = new javax.swing.JLabel();
        lbGerenciarFuncionarios = new javax.swing.JLabel();
        lblMenuPrincipal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nome");

        jLabel2.setText("Sexo");

        jLabel3.setText("Telefone");

        jLabel4.setText("E-mail");

        jLabel5.setText("Endereço");

        jLabel6.setText("Bairro");

        jLabel7.setText("CEP");

        jLabel8.setText("Cidade");

        btnUpdate.setText("Alterar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Remover");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txvPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txvPesquisarKeyReleased(evt);
            }
        });

        jLabel9.setText("Pesquisar");

        jLabel10.setText("CPF");

        tbClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sexo", "Telefone", "Email", "Cidade"
            }
        ));
        tbClientes.setFocusable(false);
        tbClientes.getTableHeader().setReorderingAllowed(false);
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(txvCliSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txvCliNome)
                                .addComponent(txvCliTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txvCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txvCliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txvCliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(txvCliCep, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txvCliBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10)
                            .addComponent(txvCliCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(434, 434, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(994, 994, 994))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txvPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txvCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txvCliCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txvCliBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txvCliSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txvCliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txvCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txvCliTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txvCliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txvCliCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txvPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(688, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(153, 0, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbGerenciarAgendamentos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbGerenciarAgendamentos.setForeground(new java.awt.Color(255, 255, 255));
        lbGerenciarAgendamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icon-agenda.png"))); // NOI18N
        lbGerenciarAgendamentos.setText("Gerenciar Agendamentos");
        lbGerenciarAgendamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbGerenciarAgendamentos.setPreferredSize(new java.awt.Dimension(213, 27));
        lbGerenciarAgendamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGerenciarAgendamentosMouseClicked(evt);
            }
        });
        jPanel4.add(lbGerenciarAgendamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 279, 55));

        lbGerenciarUsuarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbGerenciarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lbGerenciarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icon-usuarios.png"))); // NOI18N
        lbGerenciarUsuarios.setText("Gerenciar Usuários");
        lbGerenciarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbGerenciarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/logo-menu.png"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 120));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txvPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txvPesquisarKeyReleased
        
        this.controller.campoPesquisa();
        
    }//GEN-LAST:event_txvPesquisarKeyReleased

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        
        this.controller.setarCampos();
        
    }//GEN-LAST:event_tbClientesMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        this.controller.updateTabela();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        this.controller.removerTabela();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lbGerenciarAgendamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarAgendamentosMouseClicked
        this.controller.abrirGerenciarAgendamentos();
    }//GEN-LAST:event_lbGerenciarAgendamentosMouseClicked

    private void lbGerenciarUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarUsuariosMouseEntered

    }//GEN-LAST:event_lbGerenciarUsuariosMouseEntered

    private void lbGerenciarFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarFuncionariosMouseClicked
        this.controller.abrirGerenciarFuncionarios();
    }//GEN-LAST:event_lbGerenciarFuncionariosMouseClicked

    private void lblMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPrincipalMouseClicked
        this.controller.abrirMenuPrincipal();
    }//GEN-LAST:event_lblMenuPrincipalMouseClicked

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
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbGerenciarAgendamentos;
    private javax.swing.JLabel lbGerenciarFuncionarios;
    private javax.swing.JLabel lbGerenciarUsuarios;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txvCliBairro;
    private javax.swing.JTextField txvCliCPF;
    private javax.swing.JTextField txvCliCep;
    private javax.swing.JTextField txvCliCidade;
    private javax.swing.JTextField txvCliEmail;
    private javax.swing.JTextField txvCliEndereco;
    private javax.swing.JTextField txvCliNome;
    private javax.swing.JTextField txvCliSexo;
    private javax.swing.JTextField txvCliTelefone;
    private javax.swing.JTextField txvPesquisar;
    // End of variables declaration//GEN-END:variables

    private void iniciarLista() {
        this.controller.atualizarTabela();
    }

    public JTable getTbClientes() {
        return tbClientes;
    }

    public void setTbClientes(JTable tbClientes) {
        this.tbClientes = tbClientes;
    }

    public JTextField getTxvPesquisar() {
        return txvPesquisar;
    }

    public void setTxvPesquisar(JTextField txvPesquisar) {
        this.txvPesquisar = txvPesquisar;
    }

    public JTextField getTxvCliBairro() {
        return txvCliBairro;
    }

    public void setTxvCliBairro(JTextField txvCliBairro) {
        this.txvCliBairro = txvCliBairro;
    }

    public JTextField getTxvCliCep() {
        return txvCliCep;
    }

    public void setTxvCliCep(JTextField txvCliCep) {
        this.txvCliCep = txvCliCep;
    }

    public JTextField getTxvCliCidade() {
        return txvCliCidade;
    }

    public void setTxvCliCidade(JTextField txvCliCidade) {
        this.txvCliCidade = txvCliCidade;
    }

    public JTextField getTxvCliEmail() {
        return txvCliEmail;
    }

    public void setTxvCliEmail(JTextField txvCliEmail) {
        this.txvCliEmail = txvCliEmail;
    }

    public JTextField getTxvCliEndereco() {
        return txvCliEndereco;
    }

    public void setTxvCliEndereco(JTextField txvCliEndereco) {
        this.txvCliEndereco = txvCliEndereco;
    }

    public JTextField getTxvCliNome() {
        return txvCliNome;
    }

    public void setTxvCliNome(JTextField txvCliNome) {
        this.txvCliNome = txvCliNome;
    }

    public JTextField getTxvCliSexo() {
        return txvCliSexo;
    }

    public Usuario getUser_authenticated() {
        return user_authenticated;
    }

    public void setUser_authenticated(Usuario user_authenticated) {
        this.user_authenticated = user_authenticated;
    }

    public void setTxvCliSexo(JTextField txvCliSexo) {
        this.txvCliSexo = txvCliSexo;
    }

    public JTextField getTxvCliTelefone() {
        return txvCliTelefone;
    }

    public void setTxvCliTelefone(JTextField txvCliTelefone) {
        this.txvCliTelefone = txvCliTelefone;
    }

    public JTextField getTxvCliCPF() {
        return txvCliCPF;
    }

    public void setTxvCliCPF(JTextField txvCliCPF) {
        this.txvCliCPF = txvCliCPF;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    
    
}
