package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "funcionario")
@IdClass(FuncionarioPK.class)
public class Funcionario implements Serializable {

    @Id
    @Column(name = "cpf", length = 14)
    private String cpf;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    @Id
    @ManyToOne
    @JoinColumn(name = "empresa_codigo",
            nullable = false)
    private Empresa empresa;

    public Funcionario() {
    }

    public Funcionario(String cpf, String nome, Empresa empresa) {
        this.cpf = cpf;
        this.nome = nome;
        this.empresa = empresa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
