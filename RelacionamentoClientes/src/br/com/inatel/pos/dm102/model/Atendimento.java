package br.com.inatel.pos.dm102.model;

import java.sql.Date;

public class Atendimento {

	private Integer id;
	private Cliente cliente;
	private Date data;
	private String descricao;

	public Atendimento() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		
		String atendimento = "Data: " + this.data + " - Cliente: " + this.cliente.getNome()
		+ " - Endere�o: " + this.cliente.getEndere�o() + " - Telefone: " + this.cliente.getTelefone() 
		+ " - Descri��o: "+ this.descricao;
		
		
		return atendimento;
	}

}
