package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.entity.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PessoaDAO {

    private EntityManagerFactory emf;

    public PessoaDAO() {
        this.emf = Persistence
                .createEntityManagerFactory("conexaoPU");
    }
    
    //inserir
    public void inserir(Pessoa p) {
        
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        
    }
    
    //alterar
    public void alterar(Pessoa p) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(p);//insere ou altera
        em.getTransaction().commit();
        em.close();
    }
    
    //excluir
    public void excluir(Pessoa p) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        em.remove(em.merge(p));
        em.remove(em.find(Pessoa.class, p.getCodigo()));
        em.getTransaction().commit();
        em.close();
    }
    
    //consultar pelo Id
    public Pessoa buscarPeloId(Integer id) {
        EntityManager em = emf.createEntityManager();
        Pessoa pessoa = em.find(Pessoa.class, id);
        em.close();
        
        return pessoa;
    }
    
    
    
    

}
