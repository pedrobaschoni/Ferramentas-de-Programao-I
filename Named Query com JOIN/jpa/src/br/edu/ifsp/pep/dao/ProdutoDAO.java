package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.dto.ProdutoDTO;
import br.edu.ifsp.pep.entity.Produto;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ProdutoDAO extends AbstractDAO<Produto> {

    //consultar pelo Id
    public Produto buscarPeloId(Integer id) {
        EntityManager em = getEntityManager();
        Produto produto = em.find(Produto.class, id);
        em.close();

        return produto;
    }

    public List<Produto> buscarPeloPreco(BigDecimal preco) {
        EntityManager em = getEntityManager();

        TypedQuery<Produto> query = em.createNamedQuery("Produto.buscarPeloPreco",
                Produto.class);
        query.setParameter("preco", preco);

        List<Produto> produtos = query.getResultList();
        em.close();

        return produtos;
    }

    public BigDecimal buscarMaiorPreco() {
        EntityManager em = getEntityManager();

        TypedQuery<BigDecimal> query = em.createNamedQuery("Produto.buscarMaiorPreco",
                BigDecimal.class);

        BigDecimal maiorPreco = query.getSingleResult();
        em.close();

        return maiorPreco;
    }

    public List<String> buscarDescricao() {
        EntityManager em = getEntityManager();

        TypedQuery<String> query = em.createNamedQuery("Produto.buscarDescricao",
                String.class);

        List<String> produtos = query.getResultList();
        em.close();

        return produtos;
    }
    
    public List<Object[]> buscarDescricaoPrecoQuantidade() {
        EntityManager em = getEntityManager();

        TypedQuery<Object[]> query = em.createNamedQuery("Produto.buscarDescricaoPrecoQuantidade",
                Object[].class);

        List<Object[]> produtos = query.getResultList();
        em.close();

        return produtos;
    }
    
    public List<ProdutoDTO> buscarDTO() {
        EntityManager em = getEntityManager();

        TypedQuery<ProdutoDTO> query = em.createNamedQuery("Produto.buscarDTO",
                ProdutoDTO.class);

        List<ProdutoDTO> produtos = query.getResultList();
        em.close();

        return produtos;
    }
    
    public List<Produto> buscarPeloIdCategoria(Integer idCategoria) {
        EntityManager em = getEntityManager();

        TypedQuery<Produto> query = em.createNamedQuery(
                "Produto.buscarPeloIdCategoria", Produto.class)
                .setParameter("codigo", idCategoria);

        List<Produto> produtos = query.getResultList();
        em.close();

        return produtos;
    }
    
   

}
