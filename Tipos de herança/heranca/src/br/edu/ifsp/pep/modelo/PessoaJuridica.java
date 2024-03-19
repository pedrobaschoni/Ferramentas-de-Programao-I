package br.edu.ifsp.pep.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa_jurica")
//@DiscriminatorValue(value = "J")
public class PessoaJuridica extends Pessoa {

    @Column(name = "cnpj", length = 20, nullable = false)
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
