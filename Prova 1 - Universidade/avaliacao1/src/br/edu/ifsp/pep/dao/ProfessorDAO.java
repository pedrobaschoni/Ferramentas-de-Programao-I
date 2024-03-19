package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Professor;
import javax.persistence.EntityManager;

public class ProfessorDAO extends PessoaDAO<Professor> {

    public void reajustarSalario(double percentual) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        em.createNamedQuery("Professor.reajustarSalario")
                .setParameter("percentual", percentual)
                .executeUpdate();
        
        em.getTransaction().commit();
        em.close();
    }
}
