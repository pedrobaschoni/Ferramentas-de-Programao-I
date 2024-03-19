package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Pessoa;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author aluno
 */
public class PessoaDAO extends AbstractDAO<Pessoa> {

    public Pessoa buscarPorLoginESenha(String login, String senha) {
        try {
            return getEntityManager()
                    .createNamedQuery("Pessoa.Login", Pessoa.class)
                    .setParameter("login", login)
                    .setParameter("senha", senha)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Pessoa> buscarPorNome(String nome) {

        return getEntityManager()
                .createNamedQuery("Pessoa.buscarPorNome", Pessoa.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();

    }

}
