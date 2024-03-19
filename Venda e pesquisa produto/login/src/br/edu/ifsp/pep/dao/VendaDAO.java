package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.ItensVenda;
import br.edu.ifsp.pep.model.Produto;
import br.edu.ifsp.pep.model.Venda;
import javax.persistence.EntityManager;

/**
 *
 * @author aluno
 */
public class VendaDAO extends AbstractDAO<Venda> {

    @Override
    public void inserir(Venda venda) throws Exception {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        for (ItensVenda iv : venda.getItens()) {
            //Validar se tem a quantidade suficiente em estoque.
            Produto produto = em.find(Produto.class, iv.getProduto().getId());
            System.out.println("Qtd. produto: " + produto.getQuantidade());
            System.out.println("IV Qtd. produto: " + iv.getQuantidade());
            if (iv.getQuantidade() > produto.getQuantidade()) {
                throw new Exception(
                        "Quantidade em estoque insuficiente para o "
                        + "Produto " + produto.getNome());
            }

            //Atualiza produto em estoque.
            produto.setQuantidade(
                    produto.getQuantidade() - iv.getQuantidade());
            em.merge(produto);
        }

        em.persist(venda);

        em.getTransaction().commit();
    }

}
