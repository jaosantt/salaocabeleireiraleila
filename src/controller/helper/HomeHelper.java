package controller.helper;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import model.Agenda;
import model.Calendario;
import model.Funcao;
import model.Funcionario;
import model.Usuario;
import view.TelaPrincipal;

public class HomeHelper {

    private final TelaPrincipal view;
    private String hr;

    public HomeHelper(TelaPrincipal view) {
        this.view = view;
    }

    public void desmarcarAllCabelo() {
        view.getTogBarba().setSelected(false);
        view.getTogSombracelha().setSelected(false);
        view.getTogMaoPe().setSelected(false);
        view.getTogBarba().setBackground(Color.MAGENTA);
        view.getTogSombracelha().setBackground(Color.MAGENTA);
        view.getTogMaoPe().setBackground(Color.MAGENTA);
    }

    public void desmarcarAllBarba() {
        view.getTogCabelo().setSelected(false);
        view.getTogSombracelha().setSelected(false);
        view.getTogMaoPe().setSelected(false);
        view.getTogCabelo().setBackground(Color.MAGENTA);
        view.getTogSombracelha().setBackground(Color.MAGENTA);
        view.getTogMaoPe().setBackground(Color.MAGENTA);
    }

    public void desmarcarAllSombrancelha() {
        view.getTogCabelo().setSelected(false);
        view.getTogBarba().setSelected(false);
        view.getTogMaoPe().setSelected(false);
        view.getTogCabelo().setBackground(Color.MAGENTA);
        view.getTogBarba().setBackground(Color.MAGENTA);
        view.getTogMaoPe().setBackground(Color.MAGENTA);
    }

    public void desmarcarAllMaoPe() {
        view.getTogBarba().setSelected(false);
        view.getTogSombracelha().setSelected(false);
        view.getTogCabelo().setSelected(false);
        view.getTogBarba().setBackground(Color.MAGENTA);
        view.getTogSombracelha().setBackground(Color.MAGENTA);
        view.getTogCabelo().setBackground(Color.MAGENTA);
    }

    public void preencherServico(List<Funcao> list) {

        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) view.getCboServico().getModel();
        cbModel.removeAllElements();

        for (Funcao funcao : list) {
            cbModel.addElement(funcao.getDescricao());
        }
    }

    public void preencherUsuario(List<Usuario> list) {
        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) view.getCboUsuario().getModel();
        
    
         
        for (Usuario usuario : list) {
            cbModel.addElement(usuario.getNome());
            view.getId_usuario().add(usuario.getId());
            view.getUsers().add(usuario);
            
        }
        
        
    }

    public void preencherFuncionario(List<Funcionario> list) {

        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) view.getCboProfissional().getModel();
        cbModel.removeAllElements();
        for (Funcionario funcionario : list) {
            cbModel.addElement(funcionario.getNome());
            
        }
    }

    public String getServico() {
        if (view.getCboServico().getSelectedItem() != null) {
            return view.getCboServico().getSelectedItem().toString();
        }
        return "";
    }

    public String getFuncionario() {
        if (view.getCboProfissional().getSelectedItem() != null) {
            return view.getCboProfissional().getSelectedItem().toString();
        }
        return "";
    }

    public int getUsuario() {
        
        return view.getId_usuario().get(view.getCboUsuario().getSelectedIndex());
        
        
    }

    //Controlar Calendário
    public void setFormatoCalendario(Calendario c) {
        SimpleDateFormat Ano = new SimpleDateFormat("yyyy");
        SimpleDateFormat Mes = new SimpleDateFormat("MM");
        SimpleDateFormat Dia = new SimpleDateFormat("dd");

        c.setAnoFixo(Integer.parseInt(Ano.format(new Date())));
        c.setMesFixo(Integer.parseInt(Mes.format(new Date())));
        c.setDiaFixo(Integer.parseInt(Dia.format(new Date())));

    }

    public void preencherAnoMes(Calendario c) {
        for (int i = c.getAnoFixo(); i < c.getAnoFixo() + 50; i++) {
            view.getCboAno().addItem(i + "");
        }
        view.getCboAno().setSelectedItem(c.getAnoFixo());
        view.getCboMes().setSelectedIndex(c.getMesFixo() - 1);
    }

    public void alteraData(Calendario c) {
        c.setDiaAltera(c.getDiaFixo());
        c.setMesAltera(view.getCboMes().getSelectedIndex());
        c.setAnoAltera(Integer.parseInt(view.getCboAno().getSelectedItem().toString()));
    }

    public void limparDias() {
        view.getBtDay1().setText("");
        view.getBtDay2().setText("");
        view.getBtDay3().setText("");
        view.getBtDay4().setText("");
        view.getBtDay5().setText("");
        view.getBtDay6().setText("");
        view.getBtDay7().setText("");
        view.getBtDay8().setText("");
        view.getBtDay9().setText("");
        view.getBtDay10().setText("");
        view.getBtDay11().setText("");
        view.getBtDay12().setText("");
        view.getBtDay13().setText("");
        view.getBtDay14().setText("");
        view.getBtDay15().setText("");
        view.getBtDay16().setText("");
        view.getBtDay17().setText("");
        view.getBtDay18().setText("");
        view.getBtDay19().setText("");
        view.getBtDay20().setText("");
        view.getBtDay21().setText("");
        view.getBtDay22().setText("");
        view.getBtDay23().setText("");
        view.getBtDay24().setText("");
        view.getBtDay25().setText("");
        view.getBtDay26().setText("");
        view.getBtDay27().setText("");
        view.getBtDay28().setText("");
        view.getBtDay29().setText("");
        view.getBtDay30().setText("");
        view.getBtDay31().setText("");
        view.getBtDay32().setText("");
        view.getBtDay33().setText("");
        view.getBtDay34().setText("");
        view.getBtDay35().setText("");
        view.getBtDay36().setText("");
        view.getBtDay37().setText("");
        view.getBtDay38().setText("");
        view.getBtDay39().setText("");
        view.getBtDay40().setText("");
        view.getBtDay41().setText("");
        view.getBtDay42().setText("");
        view.getBtDay1().setEnabled(false);
        view.getBtDay2().setEnabled(false);
        view.getBtDay3().setEnabled(false);
        view.getBtDay4().setEnabled(false);
        view.getBtDay5().setEnabled(false);
        view.getBtDay6().setEnabled(false);
        view.getBtDay7().setEnabled(false);
        view.getBtDay8().setEnabled(false);
        view.getBtDay9().setEnabled(false);
        view.getBtDay10().setEnabled(false);
        view.getBtDay11().setEnabled(false);
        view.getBtDay12().setEnabled(false);
        view.getBtDay13().setEnabled(false);
        view.getBtDay14().setEnabled(false);
        view.getBtDay15().setEnabled(false);
        view.getBtDay16().setEnabled(false);
        view.getBtDay17().setEnabled(false);
        view.getBtDay18().setEnabled(false);
        view.getBtDay19().setEnabled(false);
        view.getBtDay20().setEnabled(false);
        view.getBtDay21().setEnabled(false);
        view.getBtDay22().setEnabled(false);
        view.getBtDay23().setEnabled(false);
        view.getBtDay24().setEnabled(false);
        view.getBtDay25().setEnabled(false);
        view.getBtDay26().setEnabled(false);
        view.getBtDay27().setEnabled(false);
        view.getBtDay28().setEnabled(false);
        view.getBtDay29().setEnabled(false);
        view.getBtDay31().setEnabled(false);
        view.getBtDay32().setEnabled(false);
        view.getBtDay33().setEnabled(false);
        view.getBtDay34().setEnabled(false);
        view.getBtDay35().setEnabled(false);
        view.getBtDay36().setEnabled(false);
        view.getBtDay37().setEnabled(false);
        view.getBtDay38().setEnabled(false);
        view.getBtDay39().setEnabled(false);
        view.getBtDay40().setEnabled(false);
        view.getBtDay41().setEnabled(false);
        view.getBtDay42().setEnabled(false);

    }

    public int obterDiasPorMes(Calendario c) {
        switch (c.getMesAltera()) {
            case 0: // Janeiro
            case 2: // Março
            case 4: // Maio
            case 6: // Julho
            case 7: // Agosto
            case 9: // Outubro
            case 11: // Dezembro
                return 31;
            case 3: // Abril
            case 5: // Junho
            case 8: // Setembro
            case 10: // Novembro
                return 30;
            case 1: // Fevereiro
                if (c.getAnoAltera() % 400 == 0 || (c.getAnoAltera() % 4 == 0 && c.getAnoAltera() % 100 != 0)) {
                    return 29; // Ano bissexto (fevereiro tem 29 dias)
                } else {
                    return 28; // Ano não bissexto (fevereiro tem 28 dias)
                }
            default:
                return -1; // Mês inválido
        }
    }

    public void setarDiasDoMes(Calendario c) {

        this.alteraData(c);

        Calendar calendar = Calendar.getInstance();
        calendar.set(c.getAnoAltera(), c.getMesAltera(), 1);

        int Semana = calendar.get(Calendar.DAY_OF_WEEK);
        switch (Semana) {
            case Calendar.SUNDAY:
                c.setSetDias(1);
                break;
            case Calendar.MONDAY:
                c.setSetDias(2);
                break;
            case Calendar.TUESDAY:
                c.setSetDias(3);
                break;
            case Calendar.WEDNESDAY:
                c.setSetDias(4);
                break;
            case Calendar.THURSDAY:
                c.setSetDias(5);
                break;
            case Calendar.FRIDAY:
                c.setSetDias(6);
                break;
            case Calendar.SATURDAY:
                c.setSetDias(7);
                break;

        }

    }

    public void preencherDias(Calendario c) {
        for (int i = 1; i <= c.getTotalDiasMes(); i++) {
            switch (c.getSetDias()) {
                case 1:
                    view.getBtDay1().setEnabled(true);
                    view.getBtDay1().setText(i + "");
                    break;
                case 2:
                    view.getBtDay2().setText(i + "");
                    view.getBtDay2().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay2());
                    break;
                case 3:
                    view.getBtDay3().setText(i + "");
                    view.getBtDay3().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay3());
                    break;
                case 4:
                    view.getBtDay4().setText(i + "");
                    view.getBtDay4().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay4());
                    break;
                case 5:
                    view.getBtDay5().setText(i + "");
                    view.getBtDay5().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay5());
                    break;
                case 6:
                    view.getBtDay6().setText(i + "");
                    view.getBtDay6().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay6());
                    break;
                case 7:
                    view.getBtDay7().setText(i + "");
                    view.getBtDay7().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay7());
                    break;
                case 8:
                    view.getBtDay8().setText(i + "");
                    view.getBtDay8().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay8());
                    break;
                case 9:
                    view.getBtDay9().setText(i + "");
                    view.getBtDay9().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay9());
                    break;
                case 10:
                    view.getBtDay10().setText(i + "");
                    view.getBtDay10().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay10());
                    break;
                case 11:
                    view.getBtDay11().setText(i + "");
                    view.getBtDay11().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay11());
                    break;
                case 12:
                    view.getBtDay12().setText(i + "");
                    view.getBtDay12().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay12());
                    break;
                case 13:
                    view.getBtDay13().setText(i + "");
                    view.getBtDay13().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay13());
                    break;
                case 14:
                    view.getBtDay14().setText(i + "");
                    view.getBtDay14().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay14());
                    break; 
                case 15:
                    view.getBtDay15().setText(i + "");
                    view.getBtDay15().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay15());
                    break;
                case 16:
                    view.getBtDay16().setText(i + "");
                    view.getBtDay16().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay16());
                    break;
                case 17:
                    view.getBtDay17().setText(i + "");
                    view.getBtDay17().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay17());
                    break;
                case 18:
                    view.getBtDay18().setText(i + "");
                    view.getBtDay18().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay18());
                    break;
                case 19:
                    view.getBtDay19().setText(i + "");
                    view.getBtDay19().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay19());
                    break;
                case 20:
                    view.getBtDay20().setText(i + "");
                    view.getBtDay20().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay20());
                    break;
                case 21:
                    view.getBtDay21().setText(i + "");
                    view.getBtDay21().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay21());
                    break;
                case 22:
                    view.getBtDay22().setText(i + "");
                    view.getBtDay22().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay22());
                    break;
                case 23:
                    view.getBtDay23().setText(i + "");
                    view.getBtDay23().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay23());
                    break;
                case 24:
                    view.getBtDay24().setText(i + "");
                    view.getBtDay24().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay24());
                    break;
                case 25:
                    view.getBtDay25().setText(i + "");
                    view.getBtDay25().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay25());
                    break;
                case 26:
                    view.getBtDay26().setText(i + "");
                    view.getBtDay26().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay26());
                    break;
                case 27:
                    view.getBtDay27().setText(i + "");
                    view.getBtDay27().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay27());
                    break;
                case 28:
                    view.getBtDay28().setText(i + "");
                    view.getBtDay28().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay28());
                    break;
                case 29:
                    view.getBtDay29().setText(i + "");
                    view.getBtDay29().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay29());
                    break;
                case 30:
                    view.getBtDay30().setText(i + "");
                    view.getBtDay30().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay30());
                    break;
                case 31:
                    view.getBtDay31().setText(i + "");
                    view.getBtDay31().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay31());
                    break;
                case 32:
                    view.getBtDay32().setText(i + "");
                    view.getBtDay32().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay32());
                    break;
                case 33:
                    view.getBtDay33().setText(i + "");
                    view.getBtDay33().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay33());
                    break;
                case 34:
                    view.getBtDay34().setText(i + "");
                    view.getBtDay34().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay34());
                    break;
                case 35:
                    view.getBtDay35().setText(i + "");
                    view.getBtDay35().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay35());
                    break;
                case 36:
                    view.getBtDay36().setText(i + "");
                    view.getBtDay36().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay36());
                    break;
                case 37:
                    view.getBtDay37().setText(i + "");
                    view.getBtDay37().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay37());
                    break;
                case 38:
                    view.getBtDay38().setText(i + "");
                    view.getBtDay38().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay38());
                    break;
                case 39:
                    view.getBtDay39().setText(i + "");
                    view.getBtDay39().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay39());
                    break;
                case 40:
                    view.getBtDay40().setText(i + "");
                    view.getBtDay40().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay40());
                    break;
                case 41:
                    view.getBtDay41().setText(i + "");
                    view.getBtDay41().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay41());
                    break;
                case 42:
                    view.getBtDay42().setText(i + "");
                    view.getBtDay42().setEnabled(true);
                    this.verificaCores(i, c, view.getBtDay42());
                    break;
            }
            c.setSetDias(c.getSetDias() + 1);
        }
    }

    public void verificaCores(int i, Calendario c, JButton bt) {
        if (i == c.getDiaFixo() && c.getMesAltera() == c.getMesFixo() - 1 && c.getAnoAltera() == c.getAnoFixo()) {
            bt.setBackground(Color.magenta);
            bt.setForeground(Color.white);
        } else {
            bt.setBackground(Color.white);
            bt.setForeground(Color.black);
        }
    }

    public void desmarcarAllButton() {
        view.getBtDay1().setBackground(Color.white);
        view.getBtDay2().setBackground(Color.white);
        view.getBtDay3().setBackground(Color.white);
        view.getBtDay4().setBackground(Color.white);
        view.getBtDay5().setBackground(Color.white);
        view.getBtDay6().setBackground(Color.white);
        view.getBtDay7().setBackground(Color.white);
        view.getBtDay8().setBackground(Color.white);
        view.getBtDay9().setBackground(Color.white);
        view.getBtDay10().setBackground(Color.white);
        view.getBtDay11().setBackground(Color.white);
        view.getBtDay12().setBackground(Color.white);
        view.getBtDay13().setBackground(Color.white);
        view.getBtDay14().setBackground(Color.white);
        view.getBtDay15().setBackground(Color.white);
        view.getBtDay16().setBackground(Color.white);
        view.getBtDay17().setBackground(Color.white);
        view.getBtDay18().setBackground(Color.white);
        view.getBtDay19().setBackground(Color.white);
        view.getBtDay20().setBackground(Color.white);
        view.getBtDay21().setBackground(Color.white);
        view.getBtDay22().setBackground(Color.white);
        view.getBtDay23().setBackground(Color.white);
        view.getBtDay24().setBackground(Color.white);
        view.getBtDay25().setBackground(Color.white);
        view.getBtDay26().setBackground(Color.white);
        view.getBtDay27().setBackground(Color.white);
        view.getBtDay28().setBackground(Color.white);
        view.getBtDay29().setBackground(Color.white);
        view.getBtDay30().setBackground(Color.white);
        view.getBtDay31().setBackground(Color.white);
        view.getBtDay32().setBackground(Color.white);
        view.getBtDay33().setBackground(Color.white);
        view.getBtDay34().setBackground(Color.white);
        view.getBtDay35().setBackground(Color.white);
        view.getBtDay36().setBackground(Color.white);
        view.getBtDay37().setBackground(Color.white);
        view.getBtDay38().setBackground(Color.white);
        view.getBtDay39().setBackground(Color.white);
        view.getBtDay40().setBackground(Color.white);
        view.getBtDay41().setBackground(Color.white);
        view.getBtDay42().setBackground(Color.white);
        view.getBtDay1().setForeground(Color.black);
        view.getBtDay2().setForeground(Color.black);
        view.getBtDay3().setForeground(Color.black);
        view.getBtDay4().setForeground(Color.black);
        view.getBtDay5().setForeground(Color.black);
        view.getBtDay6().setForeground(Color.black);
        view.getBtDay7().setForeground(Color.black);
        view.getBtDay8().setForeground(Color.black);
        view.getBtDay9().setForeground(Color.black);
        view.getBtDay10().setForeground(Color.black);
        view.getBtDay11().setForeground(Color.black);
        view.getBtDay12().setForeground(Color.black);
        view.getBtDay13().setForeground(Color.black);
        view.getBtDay14().setForeground(Color.black);
        view.getBtDay15().setForeground(Color.black);
        view.getBtDay16().setForeground(Color.black);
        view.getBtDay17().setForeground(Color.black);
        view.getBtDay18().setForeground(Color.black);
        view.getBtDay19().setForeground(Color.black);
        view.getBtDay20().setForeground(Color.black);
        view.getBtDay21().setForeground(Color.black);
        view.getBtDay22().setForeground(Color.black);
        view.getBtDay23().setForeground(Color.black);
        view.getBtDay24().setForeground(Color.black);
        view.getBtDay25().setForeground(Color.black);
        view.getBtDay26().setForeground(Color.black);
        view.getBtDay27().setForeground(Color.black);
        view.getBtDay28().setForeground(Color.black);
        view.getBtDay29().setForeground(Color.black);
        view.getBtDay30().setForeground(Color.black);
        view.getBtDay31().setForeground(Color.black);
        view.getBtDay32().setForeground(Color.black);
        view.getBtDay33().setForeground(Color.black);
        view.getBtDay34().setForeground(Color.black);
        view.getBtDay35().setForeground(Color.black);
        view.getBtDay36().setForeground(Color.black);
        view.getBtDay37().setForeground(Color.black);
        view.getBtDay38().setForeground(Color.black);
        view.getBtDay39().setForeground(Color.black);
        view.getBtDay40().setForeground(Color.black);
        view.getBtDay41().setForeground(Color.black);
        view.getBtDay42().setForeground(Color.black);
    }

    public Agenda getAgenda(String st) throws ParseException {
        Agenda agenda = new Agenda();
        agenda.setData(st);
        return agenda;
    }

    public void desmarcarAllHoras() {
        view.getTog9h00().setSelected(false);
        view.getTog9h30().setSelected(false);
        view.getTog10h00().setSelected(false);
        view.getTog10h30().setSelected(false);
        view.getTog12h00().setSelected(false);
        view.getTog12h30().setSelected(false);
        view.getTog13h00().setSelected(false);
        view.getTog13h30().setSelected(false);
        view.getTog14h00().setSelected(false);
        view.getTog14h30().setSelected(false);
        view.getTog15h00().setSelected(false);
        view.getTog15h30().setSelected(false);
        view.getTog16h00().setSelected(false);
        view.getTog16h30().setSelected(false);
        view.getTog17h00().setSelected(false);
        view.getTog17h30().setSelected(false);
        view.getTog18h00().setSelected(false);
        view.getTog18h30().setSelected(false);
        view.getTog9h00().setBackground(Color.MAGENTA);
        view.getTog9h30().setBackground(Color.MAGENTA);
        view.getTog10h00().setBackground(Color.MAGENTA);
        view.getTog10h30().setBackground(Color.MAGENTA);
        view.getTog12h00().setBackground(Color.MAGENTA);
        view.getTog12h30().setBackground(Color.MAGENTA);
        view.getTog13h00().setBackground(Color.MAGENTA);
        view.getTog13h30().setBackground(Color.MAGENTA);
        view.getTog14h00().setBackground(Color.MAGENTA);
        view.getTog14h30().setBackground(Color.MAGENTA);
        view.getTog15h00().setBackground(Color.MAGENTA);
        view.getTog15h30().setBackground(Color.MAGENTA);
        view.getTog16h00().setBackground(Color.MAGENTA);
        view.getTog16h30().setBackground(Color.MAGENTA);
        view.getTog17h00().setBackground(Color.MAGENTA);
        view.getTog17h30().setBackground(Color.MAGENTA);
        view.getTog18h00().setBackground(Color.MAGENTA);
        view.getTog18h30().setBackground(Color.MAGENTA);

    }
    
    public String getHoras(JToggleButton btn){
        
        this.hr = btn.getText();
        btn.setBackground(Color.blue);
        return this.hr;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }
    
    

}
