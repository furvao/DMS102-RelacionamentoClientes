package br.com.inatel.pos.dm102.model.dao;

import java.io.Serializable;
import java.sql.ResultSet;

import br.com.inatel.pos.dm102.model.Cliente;
import br.com.inatel.pos.dm102.model.PessoaFisica;
import br.com.inatel.pos.dm102.model.PessoaJuridica;

public class ClienteDAO extends GenericDAO<Cliente, Serializable> {
	
	private int insertCliente(Cliente cliente) {

		String query = "INSERT INTO public.cliente(nome, endereco, telefone) VALUES (?, ?, ?) returning id";

		try {
			getPreparedStatement(query);

			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getEndereço());
			ps.setString(3, cliente.getTelefone());

			ResultSet rs = ps.executeQuery();
			rs.next();
			int id = rs.getInt(1);
			System.out.println("id do cliente: "+id);
			return id;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

	public int insertClientePJ(PessoaJuridica pj) {
		
		int idCliente = insertCliente(pj);

		String query = "INSERT INTO public.pessoajuridica(cnpj, \"razaoSocial\", \"inscricaoEstadual\", idcliente_fk) VALUES (?, ?, ?, ?)";

		try {
			getPreparedStatement(query);

			ps.setString(1, pj.getCnpj());
			ps.setString(2, pj.getRazaoSocial());
			ps.setString(3, pj.getInscricaoEstadual());
			ps.setInt(4, idCliente);

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return idCliente;

	}

	public int insertClientePF(PessoaFisica pf) {
		
		int idCliente = insertCliente(pf);
		
		String query = "INSERT INTO public.pessoafisica(cpf, identidade, \"tipoIdentidade\", idcliente_fk) VALUES (?, ?, ?, ?)";

		try {
			getPreparedStatement(query);

			ps.setString(1, pf.getCpf());
			ps.setString(2, pf.getIdentidade());
			ps.setString(3, pf.getTipoIdentidade());
			ps.setInt(4, idCliente);
			
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return idCliente;

	}

}
