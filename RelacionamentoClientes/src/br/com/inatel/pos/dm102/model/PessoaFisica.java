package br.com.inatel.pos.dm102.model;

public class PessoaFisica extends Cliente {
	private Integer id;
	private String cpf;
	private String identidade;
	private String tipoIdentidade;

	public PessoaFisica() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getTipoIdentidade() {
		return tipoIdentidade;
	}

	public void setTipoIdentidade(String tipoIdentidade) {
		this.tipoIdentidade = tipoIdentidade;
	}

}
