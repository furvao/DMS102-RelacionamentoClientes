package br.com.inatel.pos.dm102.model;

import java.util.Date;

public class Atendimento {

	private Cliente cliente;
	private Date data;
	private String descricao;

	public Atendimento() {
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
