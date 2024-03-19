package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.entity.Produto;
import javax.persistence.EntityManager;

public class ProdutoDAO extends AbstractDAO<Produto> {

    //consultar pelo Id
    public Produto buscarPeloId(Integer id) {
        EntityManager em = getEntityManager();
        Produto produto = em.find(Produto.class, id);
        em.close();

        return produto;
    }

}
