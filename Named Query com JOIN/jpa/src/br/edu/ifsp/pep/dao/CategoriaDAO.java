package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.entity.Categoria;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class CategoriaDAO extends AbstractDAO<Categoria> {

   public List<Categoria> buscarPelaQuantidadeProduto(Integer quantidade) {
        EntityManager em = getEntityManager();

       TypedQuery<Categoria> query = em.createNamedQuery(
               "Categoria.buscarPelaQuantidadeProduto", Categoria.class)
               .setParameter("quantidade", quantidade);

       List<Categoria> categorias = query.getResultList();
       
        em.close();

        return categorias;
    }

}
