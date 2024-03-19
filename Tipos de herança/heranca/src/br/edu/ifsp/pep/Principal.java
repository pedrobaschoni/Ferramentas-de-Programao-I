package br.edu.ifsp.pep;

import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.dao.PessoaFisicaDAO;
import br.edu.ifsp.pep.dao.PessoaJuridicaDAO;
import br.edu.ifsp.pep.modelo.Pessoa;
import br.edu.ifsp.pep.modelo.PessoaFisica;
import br.edu.ifsp.pep.modelo.PessoaJuridica;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {

//        PessoaDAO pessoaDAO = new PessoaDAO();
//        pessoaDAO.inserir(new Pessoa("César"));
        
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
        pessoaFisicaDAO.inserir(new PessoaFisica("123", "Ana"));
        
        PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
        pessoaJuridicaDAO.inserir(new PessoaJuridica("123456789", "Google"));

    }
}
