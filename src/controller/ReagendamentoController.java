package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import javax.swing.JOptionPane;
import model.dao.AgendaDAO;
import view.sub.TelaReagendamento;

public class ReagendamentoController {

    private final TelaReagendamento view;
    private String data_antiga;
    private String hora_antiga;

    public ReagendamentoController(TelaReagendamento view) {
        this.view = view;
    }

    public void reagendar() throws ParseException {

        //pegar dados da subview
        String sub_data = view.getFxvData().getText();
        String sub_hora = view.getFxvHora().getText();

        String data = view.getData_antiga();
        String hora = view.getHora_antiga();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Date date = sdf.parse(sub_data + " " + sub_hora);
        Date data_atual = new Date();
        

        if (date.after(data_atual)) {

            AgendaDAO.updateDataHora(data, hora, date);
            view.dispose();

        } else {
            JOptionPane.showMessageDialog(
                    view,
                    "Selecione um valor maior que a data atual.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

}
