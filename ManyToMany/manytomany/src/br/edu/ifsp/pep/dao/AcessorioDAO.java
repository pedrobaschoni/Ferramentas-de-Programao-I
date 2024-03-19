package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Acessorio;
import javax.persistence.EntityManager;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author aluno
 */
public class AcessorioDAO extends AbstractDAO<Acessorio> {
    
//    public Acessorio buscarPeloCodigo(Long codigo) {
//        EntityManager em = getEntityManager();
//        Acessorio acessorio = em.find(Acessorio.class, codigo);
//        em.close();
//        return acessorio;
//    }
    
    public Acessorio buscarPeloCodigo(Long codigo) {
        EntityManager em = getEntityManager();
        Acessorio acessorio = em.createQuery(
                "FROM Acessorio a WHERE a.codigo = :codigo", 
                Acessorio.class)
                .setParameter("codigo", codigo)
                .setHint(QueryHints.REFRESH, HintValues.TRUE)
                .getSingleResult();
        em.close();
        return acessorio;
    }
    
}
