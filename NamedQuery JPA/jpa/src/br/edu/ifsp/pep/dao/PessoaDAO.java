package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.entity.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class PessoaDAO extends AbstractDAO<Pessoa> {

    //consultar pelo Id
    public Pessoa buscarPeloId(Integer id) {
        EntityManager em = getEntityManager();
        Pessoa pessoa = em.find(Pessoa.class, id);
        em.close();

        return pessoa;
    }

    public List<Pessoa> buscarTodas() {
        EntityManager em = getEntityManager();
        
        //Query SEM tipo
//        Query query = em.createQuery("SELECT p FROM Pessoa p");
        //Query COM tipo
//        TypedQuery<Pessoa> query
//                = em.createQuery("SELECT p FROM Pessoa p",
//                        Pessoa.class);

        //Named Query
        TypedQuery<Pessoa> query = em.createNamedQuery(
                "Pessoa.buscarTodas", Pessoa.class);
        
        return query.getResultList();
    }

}
