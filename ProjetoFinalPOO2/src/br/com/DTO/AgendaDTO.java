package br.com.DTO;

import java.sql.*;

/**
 *
 * @author Kassio Dias Monteiro
 */
public class AgendaDTO {

    private int id_agenda;
    private String cliente_associado, data_agenda, hora, descricao;

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public String getCliente_associado() {
        return cliente_associado;
    }

    public void setCliente_associado(String cliente_associado) {
        this.cliente_associado = cliente_associado;
    }

    public String getData_agenda() {
        return data_agenda;
    }

    public void setData_agenda(String data_agenda) {
        this.data_agenda = data_agenda;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
