package br.edu.ifsp.pep.modelo;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
@NamedQueries({
    @NamedQuery(name = "Professor.reajustarSalario",
            query = "UPDATE Professor p SET p.salario = p.salario + p.salario * :percentual")
})
public class Professor extends Pessoa {

    @Column(name = "salario", nullable = false, precision = 8, scale = 2)
    private BigDecimal salario;

    public Professor() {
    }

    public Professor(String login, String senha, String nome, BigDecimal salario) {
        super(login, senha, nome);
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "salario=" + salario + '}';
    }

    
}
