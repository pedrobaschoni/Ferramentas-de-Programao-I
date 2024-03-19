package br.edu.ifsp.pep;

import br.edu.ifsp.pep.entity.Pessoa;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("conexaoPU");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();//Inicia a transação.
        
        for (int i = 0; i < 10; i++) {
            em.persist(new Pessoa("Pessoa " + i));//Insert            
        }

        em.getTransaction().commit();//Persiste as alterações no BD.
    }

}
