package br.edu.ifsp.pep;

import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.entity.Pessoa;

public class Principal {

    public static void main(String[] args) {

        PessoaDAO pessoaDAO = new PessoaDAO();
        
        Pessoa pessoa = new Pessoa("Manoel");
        System.out.println(":::::" + pessoa);
        pessoaDAO.inserir(pessoa);
        
        System.out.println(":::::" + pessoa);
        pessoa.setNome("Joaquim");
        System.out.println(":::::" + pessoa);
        pessoaDAO.alterar(pessoa);
        
        //Remover
        pessoaDAO.excluir(pessoa);
        
        //Buscar pessoa pelo ID
        Pessoa pessoaRetornada = pessoaDAO.buscarPeloId(1);
        System.out.println("::::" + pessoaRetornada);
        
        
        
        
    }

}
