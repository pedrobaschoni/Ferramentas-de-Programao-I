package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.ItensVenda;
import br.edu.ifsp.pep.model.Produto;
import br.edu.ifsp.pep.model.Venda;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

        venda.setData(LocalDateTime.now());
        em.persist(venda);

        em.getTransaction().commit();
    }

    public List<Venda> buscarPorData(
            LocalDateTime dataInicio, LocalDateTime dataFim) {
        return getEntityManager()
                .createNamedQuery("findByData", Venda.class)
                .setParameter("dataInicio", dataInicio)
                .setParameter("dataFim", dataFim)
                .getResultList();

    }

}
