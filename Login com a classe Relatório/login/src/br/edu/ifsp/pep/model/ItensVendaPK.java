package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author aluno
 */
public class ItensVendaPK implements Serializable {

    private Long venda;
    private Long produto;

    public Long getVenda() {
        return venda;
    }

    public void setVenda(Long venda) {
        this.venda = venda;
    }

    public Long getProduto() {
        return produto;
    }

    public void setProduto(Long produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.venda);
        hash = 17 * hash + Objects.hashCode(this.produto);
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
        final ItensVendaPK other = (ItensVendaPK) obj;
        if (!Objects.equals(this.venda, other.venda)) {
            return false;
        }
        return Objects.equals(this.produto, other.produto);
    }
    
    

}
