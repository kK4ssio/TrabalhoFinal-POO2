
package br.com.DAO;

import java.sql.*;
import javax.swing.JOptionPane;
import br.com.DTO.AgendaDTO;
import br.com.VIEWS.TAgenda;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kassio Dias Monteiro 
 */
public class AgendaDAO {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    
    
     public void pesquisaAuto() {
        String sql = "select * from agendar";
        ConectDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TAgenda.TabelaAgenda.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id_usuario");
                String nome = rs.getString("usuario");
                String login = rs.getString("login");
                String senha = rs.getString("senha");
                String perfil = rs.getString("perfil");
                model.addRow(new Object[]{id, nome, login, senha, perfil});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar Automático " + e);
        }
    }
    
    
    
}
