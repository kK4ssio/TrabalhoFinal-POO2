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

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " metodo apagar " + e);

        }

    }

    public void ProcuraUsu(UserDTO objUserDTO){
        
    }
}
