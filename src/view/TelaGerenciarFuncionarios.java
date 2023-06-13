package view;

import controller.FuncionarioController;
import java.sql.Connection;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Usuario;
import model.dao.ModelConnect;

public class TelaGerenciarFuncionarios extends javax.swing.JFrame {

    private final FuncionarioController controller;
    Connection con;
    private Integer id;
    Usuario user_authenticated = new Usuario();

    public TelaGerenciarFuncionarios() {
        initComponents();
        controller = new FuncionarioController(this);
        con = ModelConnect.getConectar();
        System.out.println(con);
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txvPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txvFunNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txvFunCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txvFunSexo = new javax.swing.JTextField();
        txvFunEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txvFunEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txvFunTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txvFunCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txvFunCep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txvFunBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        cbProfissao = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        lbGerenciarAgendamentos = new javax.swing.JLabel();
        lbGerenciarUsuarios = new javax.swing.JLabel();
        lbGerenciarFuncionarios = new javax.swing.JLabel();
        lblMenuPrincipal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1290, 780));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Pesquisar");

        txvPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txvPesquisarKeyReleased(evt);
            }
        });

        tbFuncionario = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "CPF", "Função", "Telefone", "E-mail", "Cidade"
            }
        ));
        tbFuncionario.setFocusable(false);
        tbFuncionario.getTableHeader().setReorderingAllowed(false);
        tbFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFuncionario);

        jLabel2.setText("Profissão");

        jLabel3.setText("Nome");

        jLabel4.setText("CPF");

        jLabel5.setText("Sexo");

        jLabel6.setText("Endereço");

        jLabel7.setText("E-mail");

        jLabel8.setText("Telefone");

        jLabel9.setText("Cidade");

        jLabel10.setText("CEP");

        jLabel11.setText("Bairro");

        btnCreate.setText("Adicionar");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Alterar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txvPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cbProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(186, 186, 186)
                .addComponent(jLabel8)
                .addGap(182, 182, 182)
                .addComponent(jLabel11))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txvFunNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txvFunTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(txvFunBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(196, 196, 196)
                .addComponent(jLabel7)
                .addGap(194, 194, 194)
                .addComponent(jLabel10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txvFunCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txvFunEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(txvFunCep, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(193, 193, 193)
                .addComponent(jLabel6)
                .addGap(177, 177, 177)
                .addComponent(jLabel9))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txvFunSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txvFunEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(txvFunCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(txvPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(cbProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txvFunNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvFunTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvFunBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txvFunCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvFunEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvFunCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txvFunSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvFunEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvFunCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 6, 1140, 730));

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

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/logo-menu.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 120));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        this.controller.sistemaCadastro();
        this.controller.atualizaTabela();
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txvPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txvPesquisarKeyReleased
        
        this.controller.campoPesquisa();
        
        
    }//GEN-LAST:event_txvPesquisarKeyReleased

    private void tbFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncionarioMouseClicked
        
        this.controller.setarCampos();
        
    }//GEN-LAST:event_tbFuncionarioMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        this.controller.updateTabela();
        this.controller.atualizaTabela();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        this.controller.removerTabela();
        this.controller.atualizaTabela();
        
    }//GEN-LAST:event_btnRemoveActionPerformed

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

    private void lbGerenciarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarUsuariosMouseClicked
        this.controller.abrirGerenciarUsuarios();
    }//GEN-LAST:event_lbGerenciarUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaGerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarFuncionarios().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbProfissao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbGerenciarAgendamentos;
    private javax.swing.JLabel lbGerenciarFuncionarios;
    private javax.swing.JLabel lbGerenciarUsuarios;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JTable tbFuncionario;
    private javax.swing.JTextField txvFunBairro;
    private javax.swing.JTextField txvFunCep;
    private javax.swing.JTextField txvFunCidade;
    private javax.swing.JTextField txvFunCpf;
    private javax.swing.JTextField txvFunEmail;
    private javax.swing.JTextField txvFunEndereco;
    private javax.swing.JTextField txvFunNome;
    private javax.swing.JTextField txvFunSexo;
    private javax.swing.JTextField txvFunTelefone;
    private javax.swing.JTextField txvPesquisar;
    // End of variables declaration//GEN-END:variables
    
    public void iniciar(){
        this.controller.atualizaProfissao();
        this.controller.atualizaTabela();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    public JTable getTbFuncionario() {
        return tbFuncionario;
    }

    public void setTbFuncionario(JTable tbFuncionario) {
        this.tbFuncionario = tbFuncionario;
    }

    public JTextField getTxvFunBairro() {
        return txvFunBairro;
    }

    public void setTxvFunBairro(JTextField txvFunBairro) {
        this.txvFunBairro = txvFunBairro;
    }

    public JTextField getTxvFunCep() {
        return txvFunCep;
    }

    public Usuario getUser_authenticated() {
        return user_authenticated;
    }

    public void setUser_authenticated(Usuario user_authenticated) {
        this.user_authenticated = user_authenticated;
    }
    
    

    public void setTxvFunCep(JTextField txvFunCep) {
        this.txvFunCep = txvFunCep;
    }

    public JTextField getTxvFunCidade() {
        return txvFunCidade;
    }

    public void setTxvFunCidade(JTextField txvFunCidade) {
        this.txvFunCidade = txvFunCidade;
    }

    public JTextField getTxvFunCpf() {
        return txvFunCpf;
    }

    public void setTxvFunCpf(JTextField txvFunCpf) {
        this.txvFunCpf = txvFunCpf;
    }

    public JTextField getTxvFunEmail() {
        return txvFunEmail;
    }

    public void setTxvFunEmail(JTextField txvFunEmail) {
        this.txvFunEmail = txvFunEmail;
    }

    public JTextField getTxvFunEndereco() {
        return txvFunEndereco;
    }

    public void setTxvFunEndereco(JTextField txvFunEndereco) {
        this.txvFunEndereco = txvFunEndereco;
    }

    public JTextField getTxvFunNome() {
        return txvFunNome;
    }

    public void setTxvFunNome(JTextField txvFunNome) {
        this.txvFunNome = txvFunNome;
    }

    public JTextField getTxvFunSexo() {
        return txvFunSexo;
    }

    public void setTxvFunSexo(JTextField txvFunSexo) {
        this.txvFunSexo = txvFunSexo;
    }

    public JTextField getTxvFunTelefone() {
        return txvFunTelefone;
    }

    public void setTxvFunTelefone(JTextField txvFunTelefone) {
        this.txvFunTelefone = txvFunTelefone;
    }

    public JTextField getTxvPesquisar() {
        return txvPesquisar;
    }

    public void setTxvPesquisar(JTextField txvPesquisar) {
        this.txvPesquisar = txvPesquisar;
    }

    public JComboBox<String> getCbProfissao() {
        return cbProfissao;
    }

    public void setCbProfissao(JComboBox<String> cbProfissao) {
        this.cbProfissao = cbProfissao;
    }
    
}
