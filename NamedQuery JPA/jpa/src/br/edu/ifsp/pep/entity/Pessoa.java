package br.edu.ifsp.pep.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
@NamedQueries(
        @NamedQuery(name = "Pessoa.buscarTodas",
                query = "SELECT p FROM Pessoa p"))
public class Pessoa implements Serializable {

    @Id //Define como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincrement
    @Column(name = "codigo")//Define o nome do atributo no BD.
    private Integer codigo;
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }

}
