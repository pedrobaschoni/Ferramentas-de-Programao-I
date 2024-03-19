package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Produto;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ProdutoDAO extends AbstractDAO<Produto> {

   public List<Produto> buscarTodos() {
       return getEntityManager().createNamedQuery("Produto.buscarTodos", Produto.class)
               .getResultList();
   }
   
   public List<Produto> buscarPorNome(String nome) {
       return getEntityManager().createNamedQuery("Produto.buscarPorNome", Produto.class)
               .setParameter("nome", "%"+nome+"%")
               .getResultList();
   }
}
