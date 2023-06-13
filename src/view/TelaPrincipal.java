
package view;

import controller.HomeController;
import java.sql.Connection;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import model.Calendario;
import model.Usuario;
import model.dao.ModelConnect;


public class TelaPrincipal extends javax.swing.JFrame {
    Usuario user_authenticated;
    List<Usuario> users = new ArrayList<>();
    Connection con;
    private HomeController controller;
    Calendario c = new Calendario();
    List<Integer> id_usuario = new ArrayList<>();
    List<Integer> id_funcionario = new ArrayList<>();
    List<Integer> id_servico = new ArrayList<>();

    public TelaPrincipal() {
        initComponents();
        controller = new HomeController(this);
        con = ModelConnect.getConectar();
        System.out.println(con);
        inicio();
       // this.controller.autenticacaoUsuario();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cboUsuario = new javax.swing.JComboBox<>();
        lblCliente = new javax.swing.JLabel();
        togCabelo = new javax.swing.JToggleButton();
        togBarba = new javax.swing.JToggleButton();
        togSombracelha = new javax.swing.JToggleButton();
        togMaoPe = new javax.swing.JToggleButton();
        cboServico = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboProfissional = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        cboMes = new javax.swing.JComboBox<>();
        cboAno = new javax.swing.JComboBox();
        tbDom = new javax.swing.JButton();
        tbSeg = new javax.swing.JButton();
        tbTer = new javax.swing.JButton();
        tbQua = new javax.swing.JButton();
        tbQui = new javax.swing.JButton();
        tbSex = new javax.swing.JButton();
        tbSab = new javax.swing.JButton();
        btDay1 = new javax.swing.JButton();
        btDay8 = new javax.swing.JButton();
        btDay15 = new javax.swing.JButton();
        btDay29 = new javax.swing.JButton();
        btDay22 = new javax.swing.JButton();
        btDay7 = new javax.swing.JButton();
        btDay2 = new javax.swing.JButton();
        btDay3 = new javax.swing.JButton();
        btDay4 = new javax.swing.JButton();
        btDay5 = new javax.swing.JButton();
        btDay6 = new javax.swing.JButton();
        btDay10 = new javax.swing.JButton();
        btDay14 = new javax.swing.JButton();
        btDay13 = new javax.swing.JButton();
        btDay9 = new javax.swing.JButton();
        btDay11 = new javax.swing.JButton();
        btDay12 = new javax.swing.JButton();
        btDay16 = new javax.swing.JButton();
        btDay20 = new javax.swing.JButton();
        btDay19 = new javax.swing.JButton();
        btDay17 = new javax.swing.JButton();
        btDay21 = new javax.swing.JButton();
        btDay18 = new javax.swing.JButton();
        btDay28 = new javax.swing.JButton();
        btDay25 = new javax.swing.JButton();
        btDay24 = new javax.swing.JButton();
        btDay26 = new javax.swing.JButton();
        btDay27 = new javax.swing.JButton();
        btDay23 = new javax.swing.JButton();
        btDay33 = new javax.swing.JButton();
        btDay34 = new javax.swing.JButton();
        btDay32 = new javax.swing.JButton();
        btDay30 = new javax.swing.JButton();
        btDay31 = new javax.swing.JButton();
        btDay35 = new javax.swing.JButton();
        btDay42 = new javax.swing.JButton();
        btDay36 = new javax.swing.JButton();
        btDay41 = new javax.swing.JButton();
        btDay40 = new javax.swing.JButton();
        btDay39 = new javax.swing.JButton();
        btDay38 = new javax.swing.JButton();
        btDay37 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tog9h30 = new javax.swing.JToggleButton();
        tog9h00 = new javax.swing.JToggleButton();
        tog10h30 = new javax.swing.JToggleButton();
        tog10h00 = new javax.swing.JToggleButton();
        tog12h00 = new javax.swing.JToggleButton();
        tog12h30 = new javax.swing.JToggleButton();
        tog13h00 = new javax.swing.JToggleButton();
        tog13h30 = new javax.swing.JToggleButton();
        tog14h30 = new javax.swing.JToggleButton();
        tog14h00 = new javax.swing.JToggleButton();
        tog15h00 = new javax.swing.JToggleButton();
        tog15h30 = new javax.swing.JToggleButton();
        tog16h30 = new javax.swing.JToggleButton();
        tog16h00 = new javax.swing.JToggleButton();
        tog17h30 = new javax.swing.JToggleButton();
        tog17h00 = new javax.swing.JToggleButton();
        tog18h30 = new javax.swing.JToggleButton();
        tog18h00 = new javax.swing.JToggleButton();
        btAgendar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbMeusAgendamentos = new javax.swing.JLabel();
        lbGerenciarAgendamentos = new javax.swing.JLabel();
        lbGerenciarUsuarios = new javax.swing.JLabel();
        lbGerenciarFuncionarios = new javax.swing.JLabel();
        lblMenuPrincipal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 775));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 770));

        lblCliente.setText("Cliente");

        togCabelo.setBackground(java.awt.Color.magenta);
        togCabelo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        togCabelo.setForeground(new java.awt.Color(255, 255, 255));
        togCabelo.setText("Cabelo");
        togCabelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togCabeloActionPerformed(evt);
            }
        });

        togBarba.setBackground(java.awt.Color.magenta);
        togBarba.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        togBarba.setForeground(new java.awt.Color(255, 255, 255));
        togBarba.setText("Barba");
        togBarba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togBarbaActionPerformed(evt);
            }
        });

        togSombracelha.setBackground(java.awt.Color.magenta);
        togSombracelha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        togSombracelha.setForeground(new java.awt.Color(255, 255, 255));
        togSombracelha.setText("Sombracelha");
        togSombracelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togSombracelhaActionPerformed(evt);
            }
        });

        togMaoPe.setBackground(java.awt.Color.magenta);
        togMaoPe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        togMaoPe.setForeground(new java.awt.Color(255, 255, 255));
        togMaoPe.setText("Mão e pé");
        togMaoPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togMaoPeActionPerformed(evt);
            }
        });

        cboServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboServicoItemStateChanged(evt);
            }
        });

        jLabel2.setText("Serviço");

        jLabel3.setText("Profissional");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        cboMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMesItemStateChanged(evt);
            }
        });

        cboAno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboAnoItemStateChanged(evt);
            }
        });

        tbDom.setText("Dom");
        tbDom.setPreferredSize(new java.awt.Dimension(100, 50));

        tbSeg.setText("Seg");
        tbSeg.setPreferredSize(new java.awt.Dimension(100, 50));

        tbTer.setText("Ter");
        tbTer.setPreferredSize(new java.awt.Dimension(100, 50));

        tbQua.setText("Qua");
        tbQua.setPreferredSize(new java.awt.Dimension(100, 50));

        tbQui.setText("Qui");
        tbQui.setPreferredSize(new java.awt.Dimension(100, 50));

        tbSex.setText("Sex");
        tbSex.setPreferredSize(new java.awt.Dimension(100, 50));

        tbSab.setText("Sab");
        tbSab.setPreferredSize(new java.awt.Dimension(100, 50));

        btDay1.setBackground(new java.awt.Color(51, 51, 51));
        btDay1.setForeground(new java.awt.Color(255, 255, 255));
        btDay1.setText("0");
        btDay1.setEnabled(false);
        btDay1.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay1ActionPerformed(evt);
            }
        });

        btDay8.setBackground(new java.awt.Color(51, 51, 51));
        btDay8.setForeground(new java.awt.Color(255, 255, 255));
        btDay8.setText("0");
        btDay8.setEnabled(false);
        btDay8.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay8ActionPerformed(evt);
            }
        });

        btDay15.setBackground(new java.awt.Color(51, 51, 51));
        btDay15.setForeground(new java.awt.Color(255, 255, 255));
        btDay15.setText("0");
        btDay15.setEnabled(false);
        btDay15.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay15ActionPerformed(evt);
            }
        });

        btDay29.setBackground(new java.awt.Color(51, 51, 51));
        btDay29.setForeground(new java.awt.Color(255, 255, 255));
        btDay29.setText("0");
        btDay29.setEnabled(false);
        btDay29.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay29ActionPerformed(evt);
            }
        });

        btDay22.setBackground(new java.awt.Color(51, 51, 51));
        btDay22.setForeground(new java.awt.Color(255, 255, 255));
        btDay22.setText("0");
        btDay22.setEnabled(false);
        btDay22.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay22ActionPerformed(evt);
            }
        });

        btDay7.setBackground(new java.awt.Color(51, 51, 51));
        btDay7.setForeground(new java.awt.Color(255, 255, 255));
        btDay7.setText("0");
        btDay7.setEnabled(false);
        btDay7.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay7ActionPerformed(evt);
            }
        });

        btDay2.setBackground(new java.awt.Color(51, 51, 51));
        btDay2.setForeground(new java.awt.Color(255, 255, 255));
        btDay2.setText("0");
        btDay2.setEnabled(false);
        btDay2.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay2ActionPerformed(evt);
            }
        });

        btDay3.setBackground(new java.awt.Color(51, 51, 51));
        btDay3.setForeground(new java.awt.Color(255, 255, 255));
        btDay3.setText("0");
        btDay3.setEnabled(false);
        btDay3.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay3ActionPerformed(evt);
            }
        });

        btDay4.setBackground(new java.awt.Color(51, 51, 51));
        btDay4.setForeground(new java.awt.Color(255, 255, 255));
        btDay4.setText("0");
        btDay4.setEnabled(false);
        btDay4.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay4ActionPerformed(evt);
            }
        });

        btDay5.setBackground(new java.awt.Color(51, 51, 51));
        btDay5.setForeground(new java.awt.Color(255, 255, 255));
        btDay5.setText("0");
        btDay5.setEnabled(false);
        btDay5.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay5ActionPerformed(evt);
            }
        });

        btDay6.setBackground(new java.awt.Color(51, 51, 51));
        btDay6.setForeground(new java.awt.Color(255, 255, 255));
        btDay6.setText("0");
        btDay6.setEnabled(false);
        btDay6.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay6ActionPerformed(evt);
            }
        });

        btDay10.setBackground(new java.awt.Color(51, 51, 51));
        btDay10.setForeground(new java.awt.Color(255, 255, 255));
        btDay10.setText("0");
        btDay10.setEnabled(false);
        btDay10.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay10ActionPerformed(evt);
            }
        });

        btDay14.setBackground(new java.awt.Color(51, 51, 51));
        btDay14.setForeground(new java.awt.Color(255, 255, 255));
        btDay14.setText("0");
        btDay14.setEnabled(false);
        btDay14.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay14ActionPerformed(evt);
            }
        });

        btDay13.setBackground(new java.awt.Color(51, 51, 51));
        btDay13.setForeground(new java.awt.Color(255, 255, 255));
        btDay13.setText("0");
        btDay13.setEnabled(false);
        btDay13.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay13ActionPerformed(evt);
            }
        });

        btDay9.setBackground(new java.awt.Color(51, 51, 51));
        btDay9.setForeground(new java.awt.Color(255, 255, 255));
        btDay9.setText("0");
        btDay9.setEnabled(false);
        btDay9.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay9ActionPerformed(evt);
            }
        });

        btDay11.setBackground(new java.awt.Color(51, 51, 51));
        btDay11.setForeground(new java.awt.Color(255, 255, 255));
        btDay11.setText("0");
        btDay11.setEnabled(false);
        btDay11.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay11ActionPerformed(evt);
            }
        });

        btDay12.setBackground(new java.awt.Color(51, 51, 51));
        btDay12.setForeground(new java.awt.Color(255, 255, 255));
        btDay12.setText("0");
        btDay12.setEnabled(false);
        btDay12.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay12ActionPerformed(evt);
            }
        });

        btDay16.setBackground(new java.awt.Color(51, 51, 51));
        btDay16.setForeground(new java.awt.Color(255, 255, 255));
        btDay16.setText("0");
        btDay16.setEnabled(false);
        btDay16.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay16ActionPerformed(evt);
            }
        });

        btDay20.setBackground(new java.awt.Color(51, 51, 51));
        btDay20.setForeground(new java.awt.Color(255, 255, 255));
        btDay20.setText("0");
        btDay20.setEnabled(false);
        btDay20.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay20ActionPerformed(evt);
            }
        });

        btDay19.setBackground(new java.awt.Color(51, 51, 51));
        btDay19.setForeground(new java.awt.Color(255, 255, 255));
        btDay19.setText("0");
        btDay19.setEnabled(false);
        btDay19.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay19ActionPerformed(evt);
            }
        });

        btDay17.setBackground(new java.awt.Color(51, 51, 51));
        btDay17.setForeground(new java.awt.Color(255, 255, 255));
        btDay17.setText("0");
        btDay17.setEnabled(false);
        btDay17.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay17ActionPerformed(evt);
            }
        });

        btDay21.setBackground(new java.awt.Color(51, 51, 51));
        btDay21.setForeground(new java.awt.Color(255, 255, 255));
        btDay21.setText("0");
        btDay21.setEnabled(false);
        btDay21.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay21ActionPerformed(evt);
            }
        });

        btDay18.setBackground(new java.awt.Color(51, 51, 51));
        btDay18.setForeground(new java.awt.Color(255, 255, 255));
        btDay18.setText("0");
        btDay18.setEnabled(false);
        btDay18.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay18ActionPerformed(evt);
            }
        });

        btDay28.setBackground(new java.awt.Color(51, 51, 51));
        btDay28.setForeground(new java.awt.Color(255, 255, 255));
        btDay28.setText("0");
        btDay28.setEnabled(false);
        btDay28.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay28ActionPerformed(evt);
            }
        });

        btDay25.setBackground(new java.awt.Color(51, 51, 51));
        btDay25.setForeground(new java.awt.Color(255, 255, 255));
        btDay25.setText("0");
        btDay25.setEnabled(false);
        btDay25.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay25ActionPerformed(evt);
            }
        });

        btDay24.setBackground(new java.awt.Color(51, 51, 51));
        btDay24.setForeground(new java.awt.Color(255, 255, 255));
        btDay24.setText("0");
        btDay24.setEnabled(false);
        btDay24.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay24ActionPerformed(evt);
            }
        });

        btDay26.setBackground(new java.awt.Color(51, 51, 51));
        btDay26.setForeground(new java.awt.Color(255, 255, 255));
        btDay26.setText("0");
        btDay26.setEnabled(false);
        btDay26.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay26ActionPerformed(evt);
            }
        });

        btDay27.setBackground(new java.awt.Color(51, 51, 51));
        btDay27.setForeground(new java.awt.Color(255, 255, 255));
        btDay27.setText("0");
        btDay27.setEnabled(false);
        btDay27.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay27ActionPerformed(evt);
            }
        });

        btDay23.setBackground(new java.awt.Color(51, 51, 51));
        btDay23.setForeground(new java.awt.Color(255, 255, 255));
        btDay23.setText("0");
        btDay23.setEnabled(false);
        btDay23.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay23ActionPerformed(evt);
            }
        });

        btDay33.setBackground(new java.awt.Color(51, 51, 51));
        btDay33.setForeground(new java.awt.Color(255, 255, 255));
        btDay33.setText("0");
        btDay33.setEnabled(false);
        btDay33.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay33ActionPerformed(evt);
            }
        });

        btDay34.setBackground(new java.awt.Color(51, 51, 51));
        btDay34.setForeground(new java.awt.Color(255, 255, 255));
        btDay34.setText("0");
        btDay34.setEnabled(false);
        btDay34.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay34ActionPerformed(evt);
            }
        });

        btDay32.setBackground(new java.awt.Color(51, 51, 51));
        btDay32.setForeground(new java.awt.Color(255, 255, 255));
        btDay32.setText("0");
        btDay32.setEnabled(false);
        btDay32.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay32ActionPerformed(evt);
            }
        });

        btDay30.setBackground(new java.awt.Color(51, 51, 51));
        btDay30.setForeground(new java.awt.Color(255, 255, 255));
        btDay30.setText("0");
        btDay30.setEnabled(false);
        btDay30.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay30ActionPerformed(evt);
            }
        });

        btDay31.setBackground(new java.awt.Color(51, 51, 51));
        btDay31.setForeground(new java.awt.Color(255, 255, 255));
        btDay31.setText("0");
        btDay31.setEnabled(false);
        btDay31.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay31ActionPerformed(evt);
            }
        });

        btDay35.setBackground(new java.awt.Color(51, 51, 51));
        btDay35.setForeground(new java.awt.Color(255, 255, 255));
        btDay35.setText("0");
        btDay35.setEnabled(false);
        btDay35.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay35ActionPerformed(evt);
            }
        });

        btDay42.setBackground(new java.awt.Color(51, 51, 51));
        btDay42.setForeground(new java.awt.Color(255, 255, 255));
        btDay42.setText("0");
        btDay42.setEnabled(false);
        btDay42.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay42ActionPerformed(evt);
            }
        });

        btDay36.setBackground(new java.awt.Color(51, 51, 51));
        btDay36.setForeground(new java.awt.Color(255, 255, 255));
        btDay36.setText("0");
        btDay36.setEnabled(false);
        btDay36.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay36ActionPerformed(evt);
            }
        });

        btDay41.setBackground(new java.awt.Color(51, 51, 51));
        btDay41.setForeground(new java.awt.Color(255, 255, 255));
        btDay41.setText("0");
        btDay41.setEnabled(false);
        btDay41.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay41ActionPerformed(evt);
            }
        });

        btDay40.setBackground(new java.awt.Color(51, 51, 51));
        btDay40.setForeground(new java.awt.Color(255, 255, 255));
        btDay40.setText("0");
        btDay40.setEnabled(false);
        btDay40.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay40ActionPerformed(evt);
            }
        });

        btDay39.setBackground(new java.awt.Color(51, 51, 51));
        btDay39.setForeground(new java.awt.Color(255, 255, 255));
        btDay39.setText("0");
        btDay39.setEnabled(false);
        btDay39.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay39ActionPerformed(evt);
            }
        });

        btDay38.setBackground(new java.awt.Color(51, 51, 51));
        btDay38.setForeground(new java.awt.Color(255, 255, 255));
        btDay38.setText("0");
        btDay38.setEnabled(false);
        btDay38.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay38ActionPerformed(evt);
            }
        });

        btDay37.setBackground(new java.awt.Color(51, 51, 51));
        btDay37.setForeground(new java.awt.Color(255, 255, 255));
        btDay37.setText("0");
        btDay37.setEnabled(false);
        btDay37.setPreferredSize(new java.awt.Dimension(100, 50));
        btDay37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDay37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tbDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbSab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboAno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btDay8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btDay15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btDay22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btDay29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDay7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(801, 801, 801))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btDay36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDay37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDay38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDay39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDay40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDay41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDay42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbQui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbSab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDay8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDay15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDay22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDay29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDay36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDay42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tog9h30.setBackground(java.awt.Color.magenta);
        tog9h30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog9h30.setForeground(new java.awt.Color(255, 255, 255));
        tog9h30.setText("09:30");
        tog9h30.setPreferredSize(new java.awt.Dimension(43, 50));
        tog9h30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog9h30ActionPerformed(evt);
            }
        });

        tog9h00.setBackground(java.awt.Color.magenta);
        tog9h00.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog9h00.setForeground(new java.awt.Color(255, 255, 255));
        tog9h00.setText("09:00");
        tog9h00.setPreferredSize(new java.awt.Dimension(43, 50));
        tog9h00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog9h00ActionPerformed(evt);
            }
        });

        tog10h30.setBackground(java.awt.Color.magenta);
        tog10h30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog10h30.setForeground(new java.awt.Color(255, 255, 255));
        tog10h30.setText("10:30");
        tog10h30.setPreferredSize(new java.awt.Dimension(43, 50));
        tog10h30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog10h30ActionPerformed(evt);
            }
        });

        tog10h00.setBackground(java.awt.Color.magenta);
        tog10h00.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog10h00.setForeground(new java.awt.Color(255, 255, 255));
        tog10h00.setText("10:00");
        tog10h00.setPreferredSize(new java.awt.Dimension(43, 50));
        tog10h00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog10h00ActionPerformed(evt);
            }
        });

        tog12h00.setBackground(java.awt.Color.magenta);
        tog12h00.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog12h00.setForeground(new java.awt.Color(255, 255, 255));
        tog12h00.setText("12:00");
        tog12h00.setPreferredSize(new java.awt.Dimension(43, 50));
        tog12h00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog12h00ActionPerformed(evt);
            }
        });

        tog12h30.setBackground(java.awt.Color.magenta);
        tog12h30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog12h30.setForeground(new java.awt.Color(255, 255, 255));
        tog12h30.setText("12:30");
        tog12h30.setPreferredSize(new java.awt.Dimension(43, 50));
        tog12h30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog12h30ActionPerformed(evt);
            }
        });

        tog13h00.setBackground(java.awt.Color.magenta);
        tog13h00.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog13h00.setForeground(new java.awt.Color(255, 255, 255));
        tog13h00.setText("13:00");
        tog13h00.setPreferredSize(new java.awt.Dimension(43, 50));
        tog13h00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog13h00ActionPerformed(evt);
            }
        });

        tog13h30.setBackground(java.awt.Color.magenta);
        tog13h30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog13h30.setForeground(new java.awt.Color(255, 255, 255));
        tog13h30.setText("13:30");
        tog13h30.setPreferredSize(new java.awt.Dimension(43, 50));
        tog13h30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog13h30ActionPerformed(evt);
            }
        });

        tog14h30.setBackground(java.awt.Color.magenta);
        tog14h30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog14h30.setForeground(new java.awt.Color(255, 255, 255));
        tog14h30.setText("14:30");
        tog14h30.setPreferredSize(new java.awt.Dimension(43, 50));
        tog14h30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog14h30ActionPerformed(evt);
            }
        });

        tog14h00.setBackground(java.awt.Color.magenta);
        tog14h00.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog14h00.setForeground(new java.awt.Color(255, 255, 255));
        tog14h00.setText("14:00");
        tog14h00.setPreferredSize(new java.awt.Dimension(43, 50));
        tog14h00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog14h00ActionPerformed(evt);
            }
        });

        tog15h00.setBackground(java.awt.Color.magenta);
        tog15h00.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog15h00.setForeground(new java.awt.Color(255, 255, 255));
        tog15h00.setText("15:00");
        tog15h00.setPreferredSize(new java.awt.Dimension(43, 50));
        tog15h00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog15h00ActionPerformed(evt);
            }
        });

        tog15h30.setBackground(java.awt.Color.magenta);
        tog15h30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog15h30.setForeground(new java.awt.Color(255, 255, 255));
        tog15h30.setText("15:30");
        tog15h30.setPreferredSize(new java.awt.Dimension(43, 50));
        tog15h30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog15h30ActionPerformed(evt);
            }
        });

        tog16h30.setBackground(java.awt.Color.magenta);
        tog16h30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog16h30.setForeground(new java.awt.Color(255, 255, 255));
        tog16h30.setText("16:30");
        tog16h30.setPreferredSize(new java.awt.Dimension(43, 50));
        tog16h30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog16h30ActionPerformed(evt);
            }
        });

        tog16h00.setBackground(java.awt.Color.magenta);
        tog16h00.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog16h00.setForeground(new java.awt.Color(255, 255, 255));
        tog16h00.setText("16:00");
        tog16h00.setPreferredSize(new java.awt.Dimension(43, 50));
        tog16h00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog16h00ActionPerformed(evt);
            }
        });

        tog17h30.setBackground(java.awt.Color.magenta);
        tog17h30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog17h30.setForeground(new java.awt.Color(255, 255, 255));
        tog17h30.setText("17:30");
        tog17h30.setPreferredSize(new java.awt.Dimension(43, 50));
        tog17h30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog17h30ActionPerformed(evt);
            }
        });

        tog17h00.setBackground(java.awt.Color.magenta);
        tog17h00.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog17h00.setForeground(new java.awt.Color(255, 255, 255));
        tog17h00.setText("17:00");
        tog17h00.setPreferredSize(new java.awt.Dimension(43, 50));
        tog17h00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog17h00ActionPerformed(evt);
            }
        });

        tog18h30.setBackground(java.awt.Color.magenta);
        tog18h30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog18h30.setForeground(new java.awt.Color(255, 255, 255));
        tog18h30.setText("18:30");
        tog18h30.setPreferredSize(new java.awt.Dimension(43, 50));
        tog18h30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog18h30ActionPerformed(evt);
            }
        });

        tog18h00.setBackground(java.awt.Color.magenta);
        tog18h00.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tog18h00.setForeground(new java.awt.Color(255, 255, 255));
        tog18h00.setText("18:00");
        tog18h00.setPreferredSize(new java.awt.Dimension(43, 50));
        tog18h00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tog18h00ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tog9h00, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tog9h30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tog10h00, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tog10h30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tog12h00, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tog12h30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tog13h00, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tog13h30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tog14h00, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tog14h30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tog15h00, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tog15h30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tog16h00, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tog16h30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tog17h00, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tog17h30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tog18h00, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tog18h30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tog9h00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tog9h30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tog10h00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tog10h30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tog12h00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tog12h30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tog13h00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tog13h30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tog14h00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tog14h30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tog15h00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tog15h30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tog16h00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tog16h30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tog17h00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tog17h30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tog18h00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tog18h30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btAgendar.setBackground(new java.awt.Color(153, 0, 153));
        btAgendar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btAgendar.setText("Agendar");
        btAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCliente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(togCabelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(togBarba, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(togSombracelha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(togMaoPe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cboServico, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cboProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(576, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(togCabelo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togBarba, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togSombracelha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togMaoPe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(cboServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(cboProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1080, 770));

        jPanel4.setBackground(new java.awt.Color(153, 0, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMeusAgendamentos.setBackground(new java.awt.Color(102, 0, 153));
        lbMeusAgendamentos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbMeusAgendamentos.setForeground(new java.awt.Color(255, 255, 255));
        lbMeusAgendamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icon-agenda.png"))); // NOI18N
        lbMeusAgendamentos.setText("Meus Agendamentos");
        lbMeusAgendamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMeusAgendamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMeusAgendamentosMouseClicked(evt);
            }
        });
        jPanel4.add(lbMeusAgendamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 279, 55));

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
        jPanel4.add(lblMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 279, 55));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/logo-menu.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 120));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarActionPerformed
        try {
            this.controller.agendar(c);
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAgendarActionPerformed

    public Usuario getUser() {
        return user_authenticated;
    }

    public void setUser(Usuario user) {
        this.user_authenticated = user;
    }
    
    private void btDay37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay37ActionPerformed
        this.controller.alteraDia(c, btDay37);
        
    }//GEN-LAST:event_btDay37ActionPerformed

    private void btDay38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay38ActionPerformed
        this.controller.alteraDia(c, btDay38);
    }//GEN-LAST:event_btDay38ActionPerformed

    private void btDay39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay39ActionPerformed
        this.controller.alteraDia(c, btDay39);
    }//GEN-LAST:event_btDay39ActionPerformed

    private void btDay40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay40ActionPerformed
        this.controller.alteraDia(c, btDay40);
    }//GEN-LAST:event_btDay40ActionPerformed

    private void btDay41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay41ActionPerformed
        this.controller.alteraDia(c, btDay41);
    }//GEN-LAST:event_btDay41ActionPerformed

    private void btDay36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay36ActionPerformed
        this.controller.alteraDia(c, btDay36);
    }//GEN-LAST:event_btDay36ActionPerformed

    private void btDay42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay42ActionPerformed
        this.controller.alteraDia(c, btDay42);
    }//GEN-LAST:event_btDay42ActionPerformed

    private void btDay35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay35ActionPerformed
        this.controller.alteraDia(c, btDay35);
    }//GEN-LAST:event_btDay35ActionPerformed

    private void btDay31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay31ActionPerformed
        this.controller.alteraDia(c, btDay31);
    }//GEN-LAST:event_btDay31ActionPerformed

    private void btDay30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay30ActionPerformed
        this.controller.alteraDia(c, btDay30);
    }//GEN-LAST:event_btDay30ActionPerformed

    private void btDay32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay32ActionPerformed
        this.controller.alteraDia(c, btDay32);
    }//GEN-LAST:event_btDay32ActionPerformed

    private void btDay34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay34ActionPerformed
        this.controller.alteraDia(c, btDay34);
    }//GEN-LAST:event_btDay34ActionPerformed

    private void btDay33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay33ActionPerformed
        this.controller.alteraDia(c, btDay33);
    }//GEN-LAST:event_btDay33ActionPerformed

    private void btDay23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay23ActionPerformed
        this.controller.alteraDia(c, btDay23);
    }//GEN-LAST:event_btDay23ActionPerformed

    private void btDay27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay27ActionPerformed
        this.controller.alteraDia(c, btDay27);
    }//GEN-LAST:event_btDay27ActionPerformed

    private void btDay26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay26ActionPerformed
        this.controller.alteraDia(c, btDay26);
        this.controller.autenticacaoUsuario();
        
    }//GEN-LAST:event_btDay26ActionPerformed

    private void btDay24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay24ActionPerformed
        this.controller.alteraDia(c, btDay24);
    }//GEN-LAST:event_btDay24ActionPerformed

    private void btDay25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay25ActionPerformed
        this.controller.alteraDia(c, btDay25);
    }//GEN-LAST:event_btDay25ActionPerformed

    private void btDay28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay28ActionPerformed
        this.controller.alteraDia(c, btDay28);
    }//GEN-LAST:event_btDay28ActionPerformed

    private void btDay18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay18ActionPerformed
        this.controller.alteraDia(c, btDay18);
    }//GEN-LAST:event_btDay18ActionPerformed

    private void btDay21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay21ActionPerformed
        this.controller.alteraDia(c, btDay21);
    }//GEN-LAST:event_btDay21ActionPerformed

    private void btDay17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay17ActionPerformed
        this.controller.alteraDia(c, btDay17);
    }//GEN-LAST:event_btDay17ActionPerformed

    private void btDay19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay19ActionPerformed
        this.controller.alteraDia(c, btDay19);
    }//GEN-LAST:event_btDay19ActionPerformed

    private void btDay20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay20ActionPerformed
        this.controller.alteraDia(c, btDay20);
    }//GEN-LAST:event_btDay20ActionPerformed

    private void btDay16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay16ActionPerformed
        this.controller.alteraDia(c, btDay16);
    }//GEN-LAST:event_btDay16ActionPerformed

    private void btDay12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay12ActionPerformed
        this.controller.alteraDia(c, btDay12);
    }//GEN-LAST:event_btDay12ActionPerformed

    private void btDay11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay11ActionPerformed
        this.controller.alteraDia(c, btDay11);
    }//GEN-LAST:event_btDay11ActionPerformed

    private void btDay9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay9ActionPerformed
        this.controller.alteraDia(c, btDay9);
    }//GEN-LAST:event_btDay9ActionPerformed

    private void btDay13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay13ActionPerformed
        this.controller.alteraDia(c, btDay13);
    }//GEN-LAST:event_btDay13ActionPerformed

    private void btDay14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay14ActionPerformed
        this.controller.alteraDia(c, btDay14);
    }//GEN-LAST:event_btDay14ActionPerformed

    private void btDay10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay10ActionPerformed
        this.controller.alteraDia(c, btDay10);
    }//GEN-LAST:event_btDay10ActionPerformed

    private void btDay6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay6ActionPerformed
        this.controller.alteraDia(c, btDay6);
    }//GEN-LAST:event_btDay6ActionPerformed

    private void btDay5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay5ActionPerformed
        this.controller.alteraDia(c, btDay5);
    }//GEN-LAST:event_btDay5ActionPerformed

    private void btDay4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay4ActionPerformed
        this.controller.alteraDia(c, btDay4);
    }//GEN-LAST:event_btDay4ActionPerformed

    private void btDay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay3ActionPerformed
        this.controller.alteraDia(c, btDay3);
    }//GEN-LAST:event_btDay3ActionPerformed

    private void btDay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay2ActionPerformed
        this.controller.alteraDia(c, btDay2);
    }//GEN-LAST:event_btDay2ActionPerformed

    private void btDay7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay7ActionPerformed
        this.controller.alteraDia(c, btDay7);
    }//GEN-LAST:event_btDay7ActionPerformed

    private void btDay22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay22ActionPerformed
        this.controller.alteraDia(c, btDay22);
    }//GEN-LAST:event_btDay22ActionPerformed

    private void btDay29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay29ActionPerformed
        this.controller.alteraDia(c, btDay29);
    }//GEN-LAST:event_btDay29ActionPerformed

    private void btDay15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay15ActionPerformed
        this.controller.alteraDia(c, btDay15);
    }//GEN-LAST:event_btDay15ActionPerformed

    private void btDay8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay8ActionPerformed
        this.controller.alteraDia(c, btDay8);
    }//GEN-LAST:event_btDay8ActionPerformed

    private void btDay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDay1ActionPerformed
        this.controller.alteraDia(c, btDay1);
    }//GEN-LAST:event_btDay1ActionPerformed

    private void cboAnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboAnoItemStateChanged

        this.controller.alteraAno(c);

    }//GEN-LAST:event_cboAnoItemStateChanged

    private void cboMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMesItemStateChanged
        this.controller.alteraMes(c);
    }//GEN-LAST:event_cboMesItemStateChanged

    private void cboServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboServicoItemStateChanged

        this.controller.atualizarFuncionario();

    }//GEN-LAST:event_cboServicoItemStateChanged

    private void togMaoPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togMaoPeActionPerformed
        this.controller.selecionarMaoPe();
    }//GEN-LAST:event_togMaoPeActionPerformed

    private void togSombracelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togSombracelhaActionPerformed
        this.controller.selecionarSombrancelha();
    }//GEN-LAST:event_togSombracelhaActionPerformed

    private void togBarbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togBarbaActionPerformed

        this.controller.selecionarBarba();

    }//GEN-LAST:event_togBarbaActionPerformed

    private void togCabeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togCabeloActionPerformed

        this.controller.selecionarCabelo();

    }//GEN-LAST:event_togCabeloActionPerformed

    private void tog9h00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog9h00ActionPerformed
       
        this.controller.Horas(tog9h00);
        
    }//GEN-LAST:event_tog9h00ActionPerformed

    private void tog9h30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog9h30ActionPerformed
        
        this.controller.Horas(tog9h30);
        
    }//GEN-LAST:event_tog9h30ActionPerformed

    private void tog10h00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog10h00ActionPerformed
        
        this.controller.Horas(tog10h00);
        
    }//GEN-LAST:event_tog10h00ActionPerformed

    private void tog10h30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog10h30ActionPerformed
        this.controller.Horas(tog10h30);
    }//GEN-LAST:event_tog10h30ActionPerformed

    private void tog12h00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog12h00ActionPerformed
        this.controller.Horas(tog12h00);
    }//GEN-LAST:event_tog12h00ActionPerformed

    private void tog12h30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog12h30ActionPerformed
        this.controller.Horas(tog12h30);
    }//GEN-LAST:event_tog12h30ActionPerformed

    private void tog13h00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog13h00ActionPerformed
        this.controller.Horas(tog13h00);
    }//GEN-LAST:event_tog13h00ActionPerformed

    private void tog13h30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog13h30ActionPerformed
        this.controller.Horas(tog13h30);
    }//GEN-LAST:event_tog13h30ActionPerformed

    private void tog14h00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog14h00ActionPerformed
        this.controller.Horas(tog14h00);
    }//GEN-LAST:event_tog14h00ActionPerformed

    private void tog14h30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog14h30ActionPerformed
        this.controller.Horas(tog14h30);
    }//GEN-LAST:event_tog14h30ActionPerformed

    private void tog15h00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog15h00ActionPerformed
        this.controller.Horas(tog15h00);
    }//GEN-LAST:event_tog15h00ActionPerformed

    private void tog15h30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog15h30ActionPerformed
        this.controller.Horas(tog15h30);
    }//GEN-LAST:event_tog15h30ActionPerformed

    private void tog16h00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog16h00ActionPerformed
        this.controller.Horas(tog16h00);
    }//GEN-LAST:event_tog16h00ActionPerformed

    private void tog16h30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog16h30ActionPerformed
        this.controller.Horas(tog16h30);
    }//GEN-LAST:event_tog16h30ActionPerformed

    private void tog17h00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog17h00ActionPerformed
        this.controller.Horas(tog17h00);
    }//GEN-LAST:event_tog17h00ActionPerformed

    private void tog17h30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog17h30ActionPerformed
        this.controller.Horas(tog17h30);
    }//GEN-LAST:event_tog17h30ActionPerformed

    private void tog18h00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog18h00ActionPerformed
        this.controller.Horas(tog18h00);
    }//GEN-LAST:event_tog18h00ActionPerformed

    private void tog18h30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tog18h30ActionPerformed
        this.controller.Horas(tog18h30);
    }//GEN-LAST:event_tog18h30ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.controller.autenticacaoUsuario();
    }//GEN-LAST:event_formWindowActivated

    private void lbMeusAgendamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMeusAgendamentosMouseClicked
        this.controller.abrirMeusAgendamentos();
    }//GEN-LAST:event_lbMeusAgendamentosMouseClicked

    private void lbGerenciarAgendamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarAgendamentosMouseClicked
        this.controller.abrirGerenciarAgendamentos();
    }//GEN-LAST:event_lbGerenciarAgendamentosMouseClicked

    private void lbGerenciarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarUsuariosMouseClicked
        this.controller.abrirGerenciarUsuarios();
    }//GEN-LAST:event_lbGerenciarUsuariosMouseClicked

    private void lbGerenciarFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarFuncionariosMouseClicked
        this.controller.abrirGerenciarFuncionarios();
    }//GEN-LAST:event_lbGerenciarFuncionariosMouseClicked

    private void lbGerenciarUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGerenciarUsuariosMouseEntered
        
    }//GEN-LAST:event_lbGerenciarUsuariosMouseEntered
    
    
 
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgendar;
    private javax.swing.JButton btDay1;
    private javax.swing.JButton btDay10;
    private javax.swing.JButton btDay11;
    private javax.swing.JButton btDay12;
    private javax.swing.JButton btDay13;
    private javax.swing.JButton btDay14;
    private javax.swing.JButton btDay15;
    private javax.swing.JButton btDay16;
    private javax.swing.JButton btDay17;
    private javax.swing.JButton btDay18;
    private javax.swing.JButton btDay19;
    private javax.swing.JButton btDay2;
    private javax.swing.JButton btDay20;
    private javax.swing.JButton btDay21;
    private javax.swing.JButton btDay22;
    private javax.swing.JButton btDay23;
    private javax.swing.JButton btDay24;
    private javax.swing.JButton btDay25;
    private javax.swing.JButton btDay26;
    private javax.swing.JButton btDay27;
    private javax.swing.JButton btDay28;
    private javax.swing.JButton btDay29;
    private javax.swing.JButton btDay3;
    private javax.swing.JButton btDay30;
    private javax.swing.JButton btDay31;
    private javax.swing.JButton btDay32;
    private javax.swing.JButton btDay33;
    private javax.swing.JButton btDay34;
    private javax.swing.JButton btDay35;
    private javax.swing.JButton btDay36;
    private javax.swing.JButton btDay37;
    private javax.swing.JButton btDay38;
    private javax.swing.JButton btDay39;
    private javax.swing.JButton btDay4;
    private javax.swing.JButton btDay40;
    private javax.swing.JButton btDay41;
    private javax.swing.JButton btDay42;
    private javax.swing.JButton btDay5;
    private javax.swing.JButton btDay6;
    private javax.swing.JButton btDay7;
    private javax.swing.JButton btDay8;
    private javax.swing.JButton btDay9;
    private javax.swing.JComboBox cboAno;
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JComboBox<String> cboProfissional;
    private javax.swing.JComboBox<String> cboServico;
    private javax.swing.JComboBox<String> cboUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbGerenciarAgendamentos;
    private javax.swing.JLabel lbGerenciarFuncionarios;
    private javax.swing.JLabel lbGerenciarUsuarios;
    private javax.swing.JLabel lbMeusAgendamentos;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JButton tbDom;
    private javax.swing.JButton tbQua;
    private javax.swing.JButton tbQui;
    private javax.swing.JButton tbSab;
    private javax.swing.JButton tbSeg;
    private javax.swing.JButton tbSex;
    private javax.swing.JButton tbTer;
    private javax.swing.JToggleButton tog10h00;
    private javax.swing.JToggleButton tog10h30;
    private javax.swing.JToggleButton tog12h00;
    private javax.swing.JToggleButton tog12h30;
    private javax.swing.JToggleButton tog13h00;
    private javax.swing.JToggleButton tog13h30;
    private javax.swing.JToggleButton tog14h00;
    private javax.swing.JToggleButton tog14h30;
    private javax.swing.JToggleButton tog15h00;
    private javax.swing.JToggleButton tog15h30;
    private javax.swing.JToggleButton tog16h00;
    private javax.swing.JToggleButton tog16h30;
    private javax.swing.JToggleButton tog17h00;
    private javax.swing.JToggleButton tog17h30;
    private javax.swing.JToggleButton tog18h00;
    private javax.swing.JToggleButton tog18h30;
    private javax.swing.JToggleButton tog9h00;
    private javax.swing.JToggleButton tog9h30;
    private javax.swing.JToggleButton togBarba;
    private javax.swing.JToggleButton togCabelo;
    private javax.swing.JToggleButton togMaoPe;
    private javax.swing.JToggleButton togSombracelha;
    // End of variables declaration//GEN-END:variables

    
    public JToggleButton getTogBarba() {
        return togBarba;
    }

    public List<Usuario> getUsers() {
        return users;
    }

    public void setUsers(List<Usuario> users) {
        this.users = users;
    }

    public JLabel getLbGerenciarFuncionarios() {
        return lbGerenciarFuncionarios;
    }

    public void setLbGerenciarFuncionarios(JLabel lbGerenciarFuncionarios) {
        this.lbGerenciarFuncionarios = lbGerenciarFuncionarios;
    }

    public JLabel getLbGerenciarUsuarios() {
        return lbGerenciarUsuarios;
    }

    public void setLbGerenciarUsuarios(JLabel lbGerenciarUsuarios) {
        this.lbGerenciarUsuarios = lbGerenciarUsuarios;
    }

           
    public void setTogBarba(JToggleButton togBarba) {
        this.togBarba = togBarba;
    }

    public List<Integer> getId_usuario() {
        return id_usuario;
    }

    public List<Integer> getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(List<Integer> id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public List<Integer> getId_servico() {
        return id_servico;
    }

    public void setId_servico(List<Integer> id_servico) {
        this.id_servico = id_servico;
    }

    
    
    public void setId_usuario(List<Integer> id_usuario) {
        this.id_usuario = id_usuario;
    }      

    public JToggleButton getTogCabelo() {
        return togCabelo;
    }

    public void setTogCabelo(JToggleButton togCabelo) {
        this.togCabelo = togCabelo;
    }

    public JToggleButton getTogMaoPe() {
        return togMaoPe;
    }

    public void setTogMaoPe(JToggleButton togMaoPe) {
        this.togMaoPe = togMaoPe;
    }

    public JToggleButton getTogSombracelha() {
        return togSombracelha;
    }

    public void setTogSombracelha(JToggleButton togSombracelha) {
        this.togSombracelha = togSombracelha;
    }

    public JComboBox<String> getCboProfissional() {
        return cboProfissional;
    }

    public void setCboProfissional(JComboBox<String> cboProfissional) {
        this.cboProfissional = cboProfissional;
    }

    public JComboBox<String> getCboServico() {
        return cboServico;
    }

    public void setCboServico(JComboBox<String> cboServico) {
        this.cboServico = cboServico;
    }

    public JComboBox<String> getCboUsuario() {
        return cboUsuario;
    }

    public void setCboUsuario(JComboBox<String> cboUsuario) {
        this.cboUsuario = cboUsuario;
    }

    private void inicio() {
        this.controller.atualizarCliente();
        this.controller.iniciaCalendario(c);
        
        
    }

    public JComboBox<String> getCboAno() {
        return cboAno;
    }   
    
    public void setCboAno(JComboBox<String> cboAno) {
        this.cboAno = cboAno;
    }

    public JComboBox<String> getCboMes() {
        return cboMes;
    }

    public void setCboMes(JComboBox<String> cboMes) {
        this.cboMes = cboMes;
    }

    public JButton getBtDay1() {
        return btDay1;
    }

    public void setBtDay1(JButton btDay1) {
        this.btDay1 = btDay1;
    }

    public JButton getBtDay10() {
        return btDay10;
    }

    public void setBtDay10(JButton btDay10) {
        this.btDay10 = btDay10;
    }

    public JButton getBtDay11() {
        return btDay11;
    }

    public void setBtDay11(JButton btDay11) {
        this.btDay11 = btDay11;
    }

    public JButton getBtDay12() {
        return btDay12;
    }

    public void setBtDay12(JButton btDay12) {
        this.btDay12 = btDay12;
    }

    public JButton getBtDay13() {
        return btDay13;
    }

    public void setBtDay13(JButton btDay13) {
        this.btDay13 = btDay13;
    }

    public JButton getBtDay14() {
        return btDay14;
    }

    public void setBtDay14(JButton btDay14) {
        this.btDay14 = btDay14;
    }

    public JButton getBtDay15() {
        return btDay15;
    }

    public void setBtDay15(JButton btDay15) {
        this.btDay15 = btDay15;
    }

    public JButton getBtDay16() {
        return btDay16;
    }

    public void setBtDay16(JButton btDay16) {
        this.btDay16 = btDay16;
    }

    public JButton getBtDay17() {
        return btDay17;
    }

    public void setBtDay17(JButton btDay17) {
        this.btDay17 = btDay17;
    }

    public JButton getBtDay18() {
        return btDay18;
    }

    public void setBtDay18(JButton btDay18) {
        this.btDay18 = btDay18;
    }

    public JButton getBtDay19() {
        return btDay19;
    }

    public void setBtDay19(JButton btDay19) {
        this.btDay19 = btDay19;
    }

    public JButton getBtDay2() {
        return btDay2;
    }

    public void setBtDay2(JButton btDay2) {
        this.btDay2 = btDay2;
    }

    public JButton getBtDay20() {
        return btDay20;
    }

    public void setBtDay20(JButton btDay20) {
        this.btDay20 = btDay20;
    }

    public JButton getBtDay21() {
        return btDay21;
    }

    public void setBtDay21(JButton btDay21) {
        this.btDay21 = btDay21;
    }

    public JButton getBtDay22() {
        return btDay22;
    }

    public void setBtDay22(JButton btDay22) {
        this.btDay22 = btDay22;
    }

    public JButton getBtDay23() {
        return btDay23;
    }

    public void setBtDay23(JButton btDay23) {
        this.btDay23 = btDay23;
    }

    public JButton getBtDay24() {
        return btDay24;
    }

    public void setBtDay24(JButton btDay24) {
        this.btDay24 = btDay24;
    }

    public JButton getBtDay25() {
        return btDay25;
    }

    public void setBtDay25(JButton btDay25) {
        this.btDay25 = btDay25;
    }

    public JButton getBtDay26() {
        return btDay26;
    }

    public void setBtDay26(JButton btDay26) {
        this.btDay26 = btDay26;
    }

    public JButton getBtDay27() {
        return btDay27;
    }

    public void setBtDay27(JButton btDay27) {
        this.btDay27 = btDay27;
    }

    public JButton getBtDay28() {
        return btDay28;
    }

    public void setBtDay28(JButton btDay28) {
        this.btDay28 = btDay28;
    }

    public JButton getBtDay29() {
        return btDay29;
    }

    public void setBtDay29(JButton btDay29) {
        this.btDay29 = btDay29;
    }

    public JButton getBtDay3() {
        return btDay3;
    }

    public void setBtDay3(JButton btDay3) {
        this.btDay3 = btDay3;
    }

    public JButton getBtDay30() {
        return btDay30;
    }

    public void setBtDay30(JButton btDay30) {
        this.btDay30 = btDay30;
    }

    public JButton getBtDay31() {
        return btDay31;
    }

    public void setBtDay31(JButton btDay31) {
        this.btDay31 = btDay31;
    }

    public JButton getBtDay32() {
        return btDay32;
    }

    public void setBtDay32(JButton btDay32) {
        this.btDay32 = btDay32;
    }

    public JButton getBtDay33() {
        return btDay33;
    }

    public void setBtDay33(JButton btDay33) {
        this.btDay33 = btDay33;
    }

    public JButton getBtDay34() {
        return btDay34;
    }

    public void setBtDay34(JButton btDay34) {
        this.btDay34 = btDay34;
    }

    public JButton getBtDay35() {
        return btDay35;
    }

    public void setBtDay35(JButton btDay35) {
        this.btDay35 = btDay35;
    }

    public JButton getBtDay36() {
        return btDay36;
    }

    public void setBtDay36(JButton btDay36) {
        this.btDay36 = btDay36;
    }

    public JButton getBtDay37() {
        return btDay37;
    }

    public void setBtDay37(JButton btDay37) {
        this.btDay37 = btDay37;
    }

    public JButton getBtDay38() {
        return btDay38;
    }

    public void setBtDay38(JButton btDay38) {
        this.btDay38 = btDay38;
    }

    public JButton getBtDay39() {
        return btDay39;
    }

    public void setBtDay39(JButton btDay39) {
        this.btDay39 = btDay39;
    }

    public JButton getBtDay4() {
        return btDay4;
    }

    public void setBtDay4(JButton btDay4) {
        this.btDay4 = btDay4;
    }

    public JButton getBtDay40() {
        return btDay40;
    }

    public void setBtDay40(JButton btDay40) {
        this.btDay40 = btDay40;
    }

    public JButton getBtDay41() {
        return btDay41;
    }

    public void setBtDay41(JButton btDay41) {
        this.btDay41 = btDay41;
    }

    public JButton getBtDay42() {
        return btDay42;
    }

    public void setBtDay42(JButton btDay42) {
        this.btDay42 = btDay42;
    }

    public JButton getBtDay5() {
        return btDay5;
    }

    public void setBtDay5(JButton btDay5) {
        this.btDay5 = btDay5;
    }

    public JButton getBtDay6() {
        return btDay6;
    }

    public void setBtDay6(JButton btDay6) {
        this.btDay6 = btDay6;
    }

    public JButton getBtDay7() {
        return btDay7;
    }

    public void setBtDay7(JButton btDay7) {
        this.btDay7 = btDay7;
    }

    public JButton getBtDay8() {
        return btDay8;
    }

    public void setBtDay8(JButton btDay8) {
        this.btDay8 = btDay8;
    }

    public JButton getBtDay9() {
        return btDay9;
    }

    public void setBtDay9(JButton btDay9) {
        this.btDay9 = btDay9;
    }

    public JToggleButton getTog10h00() {
        return tog10h00;
    }

    public void setTog10h00(JToggleButton tog10h00) {
        this.tog10h00 = tog10h00;
    }

    public JToggleButton getTog10h30() {
        return tog10h30;
    }

    public void setTog10h30(JToggleButton tog10h30) {
        this.tog10h30 = tog10h30;
    }

    public JToggleButton getTog12h00() {
        return tog12h00;
    }

    public void setTog12h00(JToggleButton tog12h00) {
        this.tog12h00 = tog12h00;
    }

    public JToggleButton getTog12h30() {
        return tog12h30;
    }

    public void setTog12h30(JToggleButton tog12h30) {
        this.tog12h30 = tog12h30;
    }

    public JToggleButton getTog13h00() {
        return tog13h00;
    }

    public void setTog13h00(JToggleButton tog13h00) {
        this.tog13h00 = tog13h00;
    }

    public JToggleButton getTog13h30() {
        return tog13h30;
    }

    public void setTog13h30(JToggleButton tog13h30) {
        this.tog13h30 = tog13h30;
    }

    public JToggleButton getTog14h00() {
        return tog14h00;
    }

    public void setTog14h00(JToggleButton tog14h00) {
        this.tog14h00 = tog14h00;
    }

    public JToggleButton getTog14h30() {
        return tog14h30;
    }

    public void setTog14h30(JToggleButton tog14h30) {
        this.tog14h30 = tog14h30;
    }

    public JToggleButton getTog15h00() {
        return tog15h00;
    }

    public void setTog15h00(JToggleButton tog15h00) {
        this.tog15h00 = tog15h00;
    }

    public JToggleButton getTog15h30() {
        return tog15h30;
    }

    public void setTog15h30(JToggleButton tog15h30) {
        this.tog15h30 = tog15h30;
    }

    public JToggleButton getTog16h00() {
        return tog16h00;
    }

    public void setTog16h00(JToggleButton tog16h00) {
        this.tog16h00 = tog16h00;
    }

    public JToggleButton getTog16h30() {
        return tog16h30;
    }

    public void setTog16h30(JToggleButton tog16h30) {
        this.tog16h30 = tog16h30;
    }

    public JToggleButton getTog17h00() {
        return tog17h00;
    }

    public void setTog17h00(JToggleButton tog17h00) {
        this.tog17h00 = tog17h00;
    }

    public JToggleButton getTog17h30() {
        return tog17h30;
    }

    public void setTog17h30(JToggleButton tog17h30) {
        this.tog17h30 = tog17h30;
    }

    public JToggleButton getTog18h00() {
        return tog18h00;
    }

    public void setTog18h00(JToggleButton tog18h00) {
        this.tog18h00 = tog18h00;
    }

    public JToggleButton getTog18h30() {
        return tog18h30;
    }

    public void setTog18h30(JToggleButton tog18h30) {
        this.tog18h30 = tog18h30;
    }

    public JToggleButton getTog9h00() {
        return tog9h00;
    }

    public void setTog9h00(JToggleButton tog9h00) {
        this.tog9h00 = tog9h00;
    }

    public JToggleButton getTog9h30() {
        return tog9h30;
    }

    public void setTog9h30(JToggleButton tog9h30) {
        this.tog9h30 = tog9h30;
    }

    public JLabel getLblCliente() {
        return lblCliente;
    }

    public void setLblCliente(JLabel lblCliente) {
        this.lblCliente = lblCliente;
    }

    public JLabel getLbMeusAgendamentos() {
        return lbMeusAgendamentos;
    }

    public void setLbMeusAgendamentos(JLabel lbMeusAgendamentos) {
        this.lbMeusAgendamentos = lbMeusAgendamentos;
    }

    public JLabel getLbGerenciarAgendamentos() {
        return lbGerenciarAgendamentos;
    }

    public void setLbGerenciarAgendamentos(JLabel lbGerenciarAgendamentos) {
        this.lbGerenciarAgendamentos = lbGerenciarAgendamentos;
    }
    
    

    
    

}
