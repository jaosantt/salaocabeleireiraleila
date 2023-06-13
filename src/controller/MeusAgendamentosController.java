package controller;

import controller.helper.MeusAgendamentosHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.AgendaAdmin;
import model.dao.AgendaDAO;
import view.TelaGerenciarAgendamentoAdmin;
import view.TelaGerenciarAgendamentos;
import view.TelaGerenciarFuncionarios;
import view.TelaGerenciarUsuarios;
import view.TelaPrincipal;
import view.sub.TelaReagendamento;

public class MeusAgendamentosController {

    private final TelaGerenciarAgendamentos view;
    private final MeusAgendamentosHelper helper;

    public MeusAgendamentosController(TelaGerenciarAgendamentos view) {
        this.view = view;
        this.helper = new MeusAgendamentosHelper(view);
    }
    
    public void abrirMenuPrincipal(){
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        principal.setUser(view.getUser_authenticated());
        view.dispose();
    }
    
    


    public void atualizaTabela() {

        //pegar dados do banco de dados
        List<AgendaAdmin> agenda = new ArrayList<>();
        agenda = AgendaDAO.read(view.getUser_authenticated());

        //preencher view
        helper.preencherTabela(agenda);

    }

    public void abrirSubview() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = sdf.parse(helper.getTabelaData() + " " + helper.getTabelaHora());
        Date data_atual = new Date();
        long diferenca = data_atual.getTime() - date.getTime();
        long diferencaDias = diferenca / (24 * 60 * 60 * 1000);
        
        
        if (String.valueOf(view.getUser_authenticated().getStatus()).equals("USER")) {
            if (Math.abs(diferencaDias) > 2) {
                //abrir reagendamento
                TelaReagendamento subview = new TelaReagendamento();
                subview.setData_antiga(helper.getTabelaData());
                subview.setHora_antiga(helper.getTabelaHora());
                subview.setUser_Authenticated(view.getUser_authenticated());
                subview.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(
                        view,
                        "Só é possivel reagendar com menos de dois dias de antecedência via fone.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }




    public void cancelarAgendamento() throws ParseException {
        //pegar dados da view
        String data = helper.getTabelaData();
        String hora = helper.getTabelaHora();

        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja cancelar o agendamento?",
                "Cancelar",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            AgendaDAO.updateSituacao(4, data, hora);
        }

        atualizaTabela();
    }

}
