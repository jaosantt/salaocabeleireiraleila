package controller.helper;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.AgendaAdmin;
import view.TelaGerenciarAgendamentos;

public class MeusAgendamentosHelper {

    private final TelaGerenciarAgendamentos view;

    public MeusAgendamentosHelper(TelaGerenciarAgendamentos view) {
        this.view = view;
    }

    public void preencherTabela(List<AgendaAdmin> agenda) {
        DefaultTableModel dtm = (DefaultTableModel) view.getTbAgendamento().getModel();
        dtm.setNumRows(0);

        for (AgendaAdmin a : agenda) {
            dtm.addRow(new Object[]{
                a.getData_adm(),
                a.getHora_adm(),
                a.getServico(),
                a.getFuncionario(),
                a.getSituacao()
            });

        }
    }
    
    public String getTabelaData(){
        int set = view.getTbAgendamento().getSelectedRow();
        String s = view.getTbAgendamento().getModel()
                .getValueAt(set, 0).toString();
        return s;
    }
    
    public String getTabelaHora(){
        int set = view.getTbAgendamento().getSelectedRow();
        String s = view.getTbAgendamento().getModel()
                .getValueAt(set, 1).toString();
        return s;
    }

}
