package br.com.inatel.pos.dm102.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import br.com.inatel.pos.dm102.model.Atendimento;
import br.com.inatel.pos.dm102.model.Cliente;
import br.com.inatel.pos.dm102.model.PessoaFisica;
import br.com.inatel.pos.dm102.model.PessoaJuridica;

public class AtendimentoBO {

	private ArrayList<Atendimento> atendimentos = new ArrayList<>();

	public void iniciarAtendimento() {

		do {

			System.out.println("------ Relacionamento de Clientes -------");

			System.out.println("> 1 - Novo Atendimento");
			System.out.println("> 2 - Listar Atendimentos");
			System.out.println("\n> 3 - Sair da aplicação");

			Scanner in = new Scanner(System.in);
			String op = in.nextLine();

			switch (op) {
			case "1":
				comecarAtendimento();

				break;
			case "2":
				listarAtendimentos();

				break;
			case "3":
				System.exit(0);
				break;

			default:
				break;
			}
			in.close();
		} while (true);

	}

	private void listarAtendimentos() {

		System.out.println("Lista de atendimentos");

		for (Atendimento atendimento : atendimentos) {

			System.out.println(atendimento.toString());
		}
		System.out.println("\n\n");

	}

	private void comecarAtendimento() {
		System.out.println("> Tipo de Pessoa");
		System.out.println("> 1 - Pessoa Fisica");
		System.out.println("> 2 - Pessoa Juridica");

		System.out.println("> 3 - Sair da aplicação");

		System.out.println("Escolha o tipo de pessoa: ");

		Scanner in = new Scanner(System.in);
		String op = in.nextLine();

		switch (op) {
		case "1":
			PessoaFisica pessoaFisica = new PessoaFisica();
			System.out.println(">> Pessoa Fisica");
			System.out.println(">> Entre com o nome:");
			pessoaFisica.setNome(in.nextLine());
			System.out.println(">> Entre com o endereço:");
			pessoaFisica.setEndereço(in.nextLine());
			System.out.println(">> Entre com o telefone:");
			pessoaFisica.setTelefone(in.nextLine());
			System.out.println(">> Entre com o cpf:");
			pessoaFisica.setCpf(in.nextLine());
			System.out.println(">> Entre com o identidade:");
			pessoaFisica.setIdentidade(in.nextLine());
			System.out.println(">> Entre com o tipo identidade:");
			pessoaFisica.setTipoIdentidade(in.nextLine());

			criarAtendimento(pessoaFisica);

			break;
		case "2":
			PessoaJuridica pessoaJuridica = new PessoaJuridica();
			System.out.println(">> Pessoa Juridica");
			System.out.println(">> Entre com o nome:");
			pessoaJuridica.setNome(in.nextLine());
			System.out.println(">> Entre com o endereço:");
			pessoaJuridica.setEndereço(in.nextLine());
			System.out.println(">> Entre com o telefone:");
			pessoaJuridica.setTelefone(in.nextLine());
			System.out.println(">> Entre com o cnpj:");
			pessoaJuridica.setCnpj(in.nextLine());
			System.out.println(">> Entre com o razao social:");
			pessoaJuridica.setRazaoSocial(in.nextLine());
			System.out.println(">> Entre com a inscrição estadual:");
			pessoaJuridica.setInscricaoEstadual(in.nextLine());

			criarAtendimento(pessoaJuridica);

			break;
		default:
			break;
		}
		in.close();
	}

	private void criarAtendimento(Cliente cliente) {

		Scanner in = new Scanner(System.in);

		System.out.println(">> Criar atendimento");

		Atendimento atendimento = new Atendimento();
		atendimento.setCliente(cliente);
		atendimento.setData(new Date());

		System.out.println(">> Insira uma descrição para o atendimento: ");

		atendimento.setDescricao(in.nextLine());

		atendimentos.add(atendimento);
		in.close();
		System.out.println("Atendimento criado com sucesso!");
		System.out.println("\n\n");
	}
}
