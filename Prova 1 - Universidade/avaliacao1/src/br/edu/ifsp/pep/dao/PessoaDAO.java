package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;

public class PessoaDAO<T> extends AbstractDAO<Pessoa> {

    @Override
    public void inserir(Pessoa pessoa) throws Exception {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        List<Pessoa> pessoas = em.createNamedQuery("Pessoa.buscaPorLogin", Pessoa.class)
                .setParameter("login", pessoa.getLogin())
                .getResultList();

        if (pessoas != null && !pessoas.isEmpty()) {
            throw new Exception("Já existe uma pessoa com este login: " + pessoa.getLogin());
        }

        em.persist(pessoa);
        em.getTransaction().commit();
        em.close();
    }

    public List<Pessoa> buscarTodas() {
        return getEntityManager()
                .createNamedQuery("Pessoa.buscarTodas", Pessoa.class)
                .getResultList();
    }

}
