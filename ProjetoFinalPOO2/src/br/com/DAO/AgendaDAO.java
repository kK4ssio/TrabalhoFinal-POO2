package br.com.DAO;

import java.sql.*;
import javax.swing.JOptionPane;
import br.com.DTO.AgendaDTO;
import br.com.VIEWS.TAgenda;
import javax.swing.table.DefaultTableModel;

/**
 * @author Kassio Dias Monteiro
 */
public class AgendaDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void pesquisaAuto() {
        String sql = "select * from agendar";
        Connection conexao = ConectDAO.conector();

        try {

            if (conexao != null) {
                PreparedStatement pst = conexao.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();

                DefaultTableModel model = (DefaultTableModel) TAgenda.TabelaAgenda.getModel();
                model.setNumRows(0);

                while (rs.next()) {
                    String nome = rs.getString("cliente_associado");
                    
                    String data = rs.getString("data_agenda");
                  String dataFormatada = data.substring(0, 2) + "/" + data.substring(2, 4) + "/" + data.substring(4, 8);
                    
                    String hora = rs.getString("hora");
                    String horaFormatada = hora.substring(0, 2) + ":" + hora.substring(2, 4);
                    
                    String descricao = rs.getString("descricao");

                    model.addRow(new Object[]{nome, dataFormatada, horaFormatada, descricao});
                }

                rs.close();
                pst.close();
                conexao.close();
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void NovoCom(AgendaDTO objADTO) {
        String sql = ("INSERT INTO agendar (cliente_associado, data_agenda, hora, descricao) values(?, ?, ?, ?) ");

        conexao = ConectDAO.conector();

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, objADTO.getCliente_associado());
            pst.setString(2, objADTO.getData_agenda());
            pst.setString(3, objADTO.getHora());
            pst.setString(4, objADTO.getDescricao());

            int add = pst.executeUpdate();

            if (add > 0) {
                pesquisaAuto();
                pst.close();
                JOptionPane.showMessageDialog(null, "Evento Registrado !");
                LimpaCampos();
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }
     public void LimpaCampos(){
         TAgenda.txtCliAss.setText(null);
         TAgenda.txtData.setText(null);
         TAgenda.txtHora.setText(null);
         TAgenda.txtDesc.setText(null);
   
    }

}
