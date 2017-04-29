using RelacionamentoClientes.Model;
using System;
using System.Collections.Generic;

namespace RelacionamentoClientes.Business
{
    class AtendimentoBO
    {
        List<Atendimento> atendimentos = new List<Atendimento>();

        public void IniciarAtendimento()
        {
            
            do
            {

               Console.WriteLine("------ Relacionamento de Clientes -------");

                Console.WriteLine("> 1 - Novo Atendimento");
                Console.WriteLine("> 2 - Listar Atendimentos");
                Console.WriteLine("\n> 3 - Sair da aplicação");
                String op = Console.In.ReadLine();
                switch (op)
                {
                    case "1":
                        ComecarAtendimento();

                        break;
                    case "2":
                        ListarAtendimentos();

                        break;
                    case "3":
                        
                        break;
                }

            } while (true);

        }

        private void ListarAtendimentos()
        {

            Console.WriteLine("Lista de atendimentos");
            
            foreach (Atendimento atendimento in atendimentos)
            {

                Console.WriteLine(atendimento.toString());
            }
            Console.WriteLine("\n\n");

        }

        private void ComecarAtendimento()
        {
            Console.WriteLine("> Tipo de Pessoa");
            Console.WriteLine("> 1 - Pessoa Fisica");
            Console.WriteLine("> 2 - Pessoa Juridica");

            Console.WriteLine("> 3 - Sair da aplicação");

            Console.WriteLine("Escolha o tipo de pessoa: ");


            String op = Console.In.ReadLine();

            switch (op)
            {
                case "1":
                    PessoaFisica pessoaFisica = new PessoaFisica();
                    Console.WriteLine(">> Pessoa Fisica");
                    Console.WriteLine(">> Entre com o nome:");
                    pessoaFisica.setNome(Console.In.ReadLine());
                    Console.WriteLine(">> Entre com o endereço:");
                    pessoaFisica.setEndereço(Console.In.ReadLine());
                    Console.WriteLine(">> Entre com o telefone:");
                    pessoaFisica.setTelefone(Console.In.ReadLine());
                    Console.WriteLine(">> Entre com o cpf:");
                    pessoaFisica.setCpf(Console.In.ReadLine());
                    Console.WriteLine(">> Entre com o identidade:");
                    pessoaFisica.setIdentidade(Console.In.ReadLine());
                    Console.WriteLine(">> Entre com o tipo identidade:");
                    pessoaFisica.setTipoIdentidade(Console.In.ReadLine());

                   

                    CriarAtendimento(pessoaFisica);

                    break;
                case "2":
                    PessoaJuridica pessoaJuridica = new PessoaJuridica();
                    Console.WriteLine(">> Pessoa Juridica");
                    Console.WriteLine(">> Entre com o nome:");
                    pessoaJuridica.setNome(Console.In.ReadLine());
                    Console.WriteLine(">> Entre com o endereço:");
                    pessoaJuridica.setEndereço(Console.In.ReadLine());
                    Console.WriteLine(">> Entre com o telefone:");
                    pessoaJuridica.setTelefone(Console.In.ReadLine());
                    Console.WriteLine(">> Entre com o cnpj:");
                    pessoaJuridica.setCnpj(Console.In.ReadLine());
                    Console.WriteLine(">> Entre com o razao social:");
                    pessoaJuridica.setRazaoSocial(Console.In.ReadLine());
                    Console.WriteLine(">> Entre com a inscrição estadual:");
                    pessoaJuridica.setInscricaoEstadual(Console.In.ReadLine());
                    

                    CriarAtendimento(pessoaJuridica);

                    break;
                default:
                    break;
            }
        }

        private void CriarAtendimento(Cliente cliente)
        {
            

            Console.WriteLine(">> Criar atendimento");

            Atendimento atendimento = new Atendimento();
            atendimento.setCliente(cliente);
            atendimento.setData(DateTime.Now);

            Console.WriteLine(">> Insira uma descrição para o atendimento: ");

            atendimento.setDescricao(Console.In.ReadLine());

            atendimentos.Add(atendimento);
            
            Console.WriteLine("Atendimento criado com sucesso!");
            Console.WriteLine("\n\n");
        }



    }
}
