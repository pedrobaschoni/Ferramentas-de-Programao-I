package br.edu.ifsp.pep.modelo;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "monitor")
public class Monitor extends Aluno {

    @Column(name = "valor_bolsa", precision = 8, scale = 2, nullable = false)
    private BigDecimal valorBolsa;

    public Monitor() {
    }

    public Monitor(String login, String senha, String nome, BigDecimal valorBolsa, String disciplina, BigDecimal media) {
        super(login, senha, nome, disciplina, media);
        this.valorBolsa = valorBolsa;
    }

    public BigDecimal getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(BigDecimal valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Override
    public String toString() {
        return "Monitor{" + "valorBolsa=" + valorBolsa + '}';
    }

}
