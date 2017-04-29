using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RelacionamentoClientes.Model
{
    class Atendimento
    {
        private int id;
        private Cliente cliente;
        private DateTime data;
        private String descricao;

        public Atendimento()
        {
        }

        public int getId()
        {
            return id;
        }

        public void setId(int id)
        {
            this.id = id;
        }

        public Cliente getCliente()
        {
            return cliente;
        }

        public void setCliente(Cliente cliente)
        {
            this.cliente = cliente;
        }

        public DateTime getData()
        {
            return data;
        }

        public void setData(DateTime data)
        {
            this.data = data;
        }

        public String getDescricao()
        {
            return descricao;
        }

        public void setDescricao(String descricao)
        {
            this.descricao = descricao;
        }

       
        
        public String toString()
        {

            String atendimento = "Data: " + this.data + " - Cliente: " + this.cliente.getNome()
            + " - Endereço: " + this.cliente.getEndereço() + " - Telefone: " + this.cliente.getTelefone()
            + " - Descrição: " + this.descricao;


            return atendimento;
        }
    }
}
