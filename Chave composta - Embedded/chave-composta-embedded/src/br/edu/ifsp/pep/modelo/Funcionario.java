package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
public class Funcionario implements Serializable {

    @EmbeddedId
    private FuncionarioPK funcionarioPK;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "empresa_codigo",
            nullable = false)
    private Empresa empresa;

    public Funcionario() {
    }


    public Funcionario(String cpf, String nome, Empresa empresa) {
        this.funcionarioPK = new FuncionarioPK(cpf);
        this.nome = nome;
        this.empresa = empresa;
    }

    public FuncionarioPK getFuncionarioPK() {
        return funcionarioPK;
    }

    public void setFuncionarioPK(FuncionarioPK funcionarioPK) {
        this.funcionarioPK = funcionarioPK;
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
