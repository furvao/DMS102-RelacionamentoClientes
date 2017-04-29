using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RelacionamentoClientes.Model
{
    class PessoaFisica : Cliente
    {

        private int id;
        private String cpf;
        private String identidade;
        private String tipoIdentidade;

        public PessoaFisica()
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

        public String getCpf()
        {
            return cpf;
        }

        public void setCpf(String cpf)
        {
            this.cpf = cpf;
        }

        public String getIdentidade()
        {
            return identidade;
        }

        public void setIdentidade(String identidade)
        {
            this.identidade = identidade;
        }

        public String getTipoIdentidade()
        {
            return tipoIdentidade;
        }

        public void setTipoIdentidade(String tipoIdentidade)
        {
            this.tipoIdentidade = tipoIdentidade;
        }


    }
}
