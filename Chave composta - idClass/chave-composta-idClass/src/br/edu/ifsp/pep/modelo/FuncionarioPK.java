package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Objects;

/*
- Implementar Serializable.
- Definir os atributos que fazem parte da chave composta.
- Gerar os getters e setters.
- Gerar os métodos equals e hashcode.
*/

public class FuncionarioPK implements Serializable {

    private String cpf;

    private Integer empresa;

    public FuncionarioPK() {
    }

    public FuncionarioPK(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.cpf);
        hash = 23 * hash + this.empresa;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FuncionarioPK other = (FuncionarioPK) obj;
        if (this.empresa != other.empresa) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }

}
