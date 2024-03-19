package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Aluno;
import java.util.List;

public class AlunoDAO extends PessoaDAO<Aluno> {

    public List<Aluno> buscarMediaMaiorQueSeis() {
        return getEntityManager()
        .createNamedQuery("Aluno.mediaMaiorDoQueSeis", 
                Aluno.class)
        .getResultList();
    }
}
