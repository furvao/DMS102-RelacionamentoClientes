using RelacionamentoClientes.Business;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RelacionamentoClientes
{
    class Runner
    {
        static void Main(string[] args)
        {
            AtendimentoBO bo = new AtendimentoBO();
            bo.IniciarAtendimento();
        }
    }
}
