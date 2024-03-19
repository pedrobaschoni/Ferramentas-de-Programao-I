package br.edu.ifsp.pep;

import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.entity.Pessoa;
import java.util.List;

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
        
        
        System.out.println("--------LISTA DE PESSOAS----------");
//        List pessoas = pessoaDAO.buscarTodas();
//        for (int i = 0; i < pessoas.size(); i++) {
//            Pessoa p = (Pessoa) pessoas.get(i);
//            System.out.println(p);
//        }

        //Lista tipada
        List<Pessoa> pessoas = pessoaDAO.buscarTodas();
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        
    }

}
