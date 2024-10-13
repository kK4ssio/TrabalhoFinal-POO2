package br.com.DAO;

import br.com.DTO.UserDTO;
import java.sql.*;
import javax.swing.JOptionPane;
import br.com.VIEWS.TCadasUser;

/**
 *
 * @author Kassio Dias Monteiro
 */
public class UsersDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void NovoUsu(UserDTO objUserDTO) {
        String sql = ("insert into usuarios( nome, email, username, senha) values(?, ?, ?, ?) ");

        conexao = ConectDAO.conector();

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, objUserDTO.getNome());
            pst.setString(2, objUserDTO.getEmail());
            pst.setString(3, objUserDTO.getUsername());
            pst.setString(4, objUserDTO.getSenha());

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

    public void ApagaUsu(UserDTO objUserDTO) {

        String sql = "delete from usuarios where id = ?";
        conexao = ConectDAO.conector();

        try {

            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUserDTO.getId());

            int del = pst.executeUpdate();

            if (del > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Usuario deletado");
                LimpaCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " metodo apagar " + e);

        }

    }

    public void ProcuraUsu(UserDTO objUserDTO) {
        String sql = "select * from usuarios where id = ?";
        conexao = ConectDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUserDTO.getId());
            rs = pst.executeQuery();

            if (rs.next()) {
                TCadasUser.txtNomeUsu.setText(rs.getString(2));
                TCadasUser.txtEmailUsu.setText(rs.getString(3));
                TCadasUser.txtLoginUsu.setText(rs.getString(4));
                TCadasUser.txtSenhaUsu.setText(rs.getString(5));

                conexao.close();

            } else {
                JOptionPane.showMessageDialog(null, "Usuario não existe ");
               LimpaCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar" + e);
        }

    }

    public void EditarUsu(UserDTO objUserDTO) {
        String sql = "update usuarios set nome = ?, email = ?, username = ?, senha = ? where id = ?";
        conexao = ConectDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(5, objUserDTO.getId());
            pst.setString(1, objUserDTO.getNome());
            pst.setString(2, objUserDTO.getEmail());
            pst.setString(3, objUserDTO.getUsername());
            pst.setString(4, objUserDTO.getSenha());

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
         TCadasUser.txtIdUsu.setText(null);
         TCadasUser.txtNomeUsu.setText(null);
         TCadasUser.txtEmailUsu.setText(null);
         TCadasUser.txtLoginUsu.setText(null);
         TCadasUser.txtSenhaUsu.setText(null);
    }
}
