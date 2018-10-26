package CONTROLLER;

import DAO.DAOPessoa;
import MODEL.Pessoa;

public class PessoaController {
    DAOPessoa dp;
    public void cadastrarPessoa(Pessoa p) throws Exception{
        dp = new DAOPessoa();
        dp.cadastrarPessoa(p);
    }
    
}
