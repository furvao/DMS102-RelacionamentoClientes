package br.com.inatel.pos.dm102.runner;

import br.com.inatel.pos.dm102.bo.AtendimentoBO;

public class Runner {

	public static void main(String[] args) {
		AtendimentoBO atendimentoBO = new AtendimentoBO();
			atendimentoBO.iniciarAtendimento();
	}
}
