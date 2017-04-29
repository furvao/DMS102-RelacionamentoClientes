using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RelacionamentoClientes.Model
{
    class PessoaJuridica : Cliente
    {

        private int id;
        private String cnpj;
        private String razaoSocial;
        private String inscricaoEstadual;

        public PessoaJuridica()
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

        public String getCnpj()
        {
            return cnpj;
        }

        public void setCnpj(String cnpj)
        {
            this.cnpj = cnpj;
        }

        public String getRazaoSocial()
        {
            return razaoSocial;
        }

        public void setRazaoSocial(String razaoSocial)
        {
            this.razaoSocial = razaoSocial;
        }

        public String getInscricaoEstadual()
        {
            return inscricaoEstadual;
        }

        public void setInscricaoEstadual(String inscricaoEstadual)
        {
            this.inscricaoEstadual = inscricaoEstadual;
        }


    }
}
