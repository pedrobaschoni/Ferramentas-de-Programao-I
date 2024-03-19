package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Parcela;
import br.edu.ifsp.pep.model.StatusVenda;
import br.edu.ifsp.pep.model.Venda;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author aluno
 */
public class ParcelaDAO extends AbstractDAO<Parcela> {

    @Override
    public void alterar(Parcela parcela) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        parcela.setDataPagamento(LocalDate.now());
        em.merge(parcela);
        
        Venda venda = parcela.getVenda();
        List<Parcela> parcelas = venda.getParcelas();
        boolean vendaPaga = true;
        for (Parcela p : parcelas) {
            if (p.getDataPagamento() == null) {
                vendaPaga = false;
                break;
            }
        }
        if (vendaPaga) {
            venda.setStatus(StatusVenda.Paga);
            em.merge(venda);
        }
        
        
        em.getTransaction().commit();
        
    }

    

}
