package br.com.DAO;

import br.com.DTO.ClientDTO;
import br.com.VIEWS.TCadasClient;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Kassio Dias Monteiro
 */
public class ClientsDAO {
     Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void novoClie(ClientDTO objClientDTO){
         String sql = ("insert into clientes( nome_cliente, endereco, telefone, email_cliente,cpf_cnpj) values(?, ?, ?, ?, ?) ");
        conexao = ConectDAO.conector();
        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, objClientDTO.getNome_cliente());
            pst.setString(2, objClientDTO.getEndereco());
            pst.setString(3, objClientDTO.getTelefone());
            pst.setString(4, objClientDTO.getEmail_cliente());
            pst.setString(5,objClientDTO.getCpf_cnpj());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

            pst.close();

        } catch (Exception e) {

            if (e.getMessage().contains("'usuarios.username'")) {
                JOptionPane.showMessageDialog(null, "login ja existente, Usuario não foi inserido ");
                LimpaCampos();

            }
            JOptionPane.showMessageDialog(null, e);

        }


    }
     public void ApagaCli(ClientDTO objClientDTO) {

        String sql = "DELETE FROM clientes WHERE id_cliente = ?";
        conexao = ConectDAO.conector();

        try {

            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objClientDTO.getCliente_id());

            int del = pst.executeUpdate();

            if (del > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Cliente deletado");
                LimpaCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " metodo apagar " + e);

        }

    }
         public void ProcuraCli(ClientDTO objClientDTO) {
        String sql = "select * from clientes where id_cliente = ?";
        conexao = ConectDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objClientDTO.getCliente_id());
            rs = pst.executeQuery();

            if (rs.next()) {
                TCadasClient.txtNomeCli.setText(rs.getString(2));
                TCadasClient.txtEndCli.setText(rs.getString(3));
                TCadasClient.txtTelCli.setText(rs.getString(4));
                TCadasClient.txtEmailCli.setText(rs.getString(5));
                TCadasClient.txtRegistro.setText(rs.getString(6));
               
               
                conexao.close();

            } else {
                JOptionPane.showMessageDialog(null, "Cliente não existe ");
               LimpaCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar" + e);
        }

    }
      public void EditarCli(ClientDTO objClientDTO) {
          
        String sql = "update clientes set nome_cliente = ?, endereco = ?, telefone = ?, email_cliente = ?, cpf_cnpj = ? where id_cliente = ?";
        conexao = ConectDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(6, objClientDTO.getCliente_id());
            pst.setString(1, objClientDTO.getNome_cliente());
            pst.setString(2, objClientDTO.getEndereco());
            pst.setString(3,objClientDTO.getTelefone());
            pst.setString(4, objClientDTO.getEmail_cliente());
            pst.setString(5, objClientDTO.getCpf_cnpj());

            int edit = pst.executeUpdate();

            if (edit > 0) {
                JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");
                LimpaCampos();
                conexao.close();
            }

        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, " Método editar " + e);
        }

    }
     
 public void LimpaCampos(){
        TCadasClient.txtNomeCli.setText(null);
                TCadasClient.txtEndCli.setText(null);
                TCadasClient.txtTelCli.setText(null);
                TCadasClient.txtEmailCli.setText(null);
                TCadasClient.txtRegistro.setText(null);
     
     
     
    }
}
