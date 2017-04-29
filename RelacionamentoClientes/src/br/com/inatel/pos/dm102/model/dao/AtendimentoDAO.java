package br.com.inatel.pos.dm102.model.dao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.inatel.pos.dm102.model.Atendimento;
import br.com.inatel.pos.dm102.model.Cliente;

public class AtendimentoDAO extends GenericDAO<Atendimento, Serializable> {

	public void inserirAtendimento(Atendimento atendimento) {

		String query = "INSERT INTO public.atendimento(data, descricao, idcliente_fk) VALUES (?, ?, ?)";

		try {
			getPreparedStatement(query);

			ps.setDate(1, atendimento.getData());
			ps.setString(2, atendimento.getDescricao());
			ps.setInt(3, atendimento.getCliente().getId());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Atendimento> listarAtendimentos() {

		String query = "SELECT descricao, data, id, idcliente_fk FROM public.atendimento;";
		List<Atendimento> atendimentos = new ArrayList<>();
		try {
			getPreparedStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Atendimento atendimento = new Atendimento();
				atendimento.setData(rs.getDate("data"));
				atendimento.setDescricao(rs.getString("descricao"));
				atendimento.setCliente(getCliente(rs.getInt("idcliente_fk")));

				atendimentos.add(atendimento);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return atendimentos;

	}

	private Cliente getCliente(int id) {
		Cliente cliente = null;
		String query = "SELECT nome, telefone, endereco	FROM public.cliente where id = " + id;
		try {
			getPreparedStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				cliente = new Cliente();
				cliente.setEndereço(rs.getString("endereco"));
				cliente.setNome(rs.getString("nome"));
				cliente.setTelefone(rs.getString("telefone"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cliente;
	}

}
