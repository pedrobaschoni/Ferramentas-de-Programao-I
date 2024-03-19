package br.edu.ifsp.pep.modelo;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
@NamedQueries({
    @NamedQuery(name = "Aluno.mediaMaiorDoQueSeis",
            query = "FROM Aluno a WHERE a.media > 6")
})
public class Aluno extends Pessoa {

    @Column(name = "disciplina", length = 50, nullable = false)
    private String disciplina;

    @Column(name = "media", nullable = false, precision = 4, scale = 2)
    private BigDecimal media;

    public Aluno() {
    }

    public Aluno(String login, String senha, String nome, String disciplina, BigDecimal media) {
        super(login, senha, nome);
        this.disciplina = disciplina;
        this.media = media;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public BigDecimal getMedia() {
        return media;
    }

    public void setMedia(BigDecimal media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" + "disciplina=" + disciplina + ", media=" + media + '}';
    }

    
}
