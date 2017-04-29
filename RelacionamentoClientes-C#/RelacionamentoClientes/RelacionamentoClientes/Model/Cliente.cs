﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RelacionamentoClientes.Model
{
    class Cliente
    {
        private int id;
        private String nome;
        private String endereço;
        private String telefone;


        public Cliente()
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

        public String getNome()
        {
            return nome;
        }
        public void setNome(String nome)
        {
            this.nome = nome;
        }
        public String getEndereço()
        {
            return endereço;
        }
        public void setEndereço(String endereço)
        {
            this.endereço = endereço;
        }
        public String getTelefone()
        {
            return telefone;
        }
        public void setTelefone(String telefone)
        {
            this.telefone = telefone;
        }
    }
}
