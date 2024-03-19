package br.edu.ifsp.pep.dto;

import java.math.BigDecimal;

public class ProdutoDTO {

    private String descricao;
    private Integer quantidade;
    private BigDecimal preco;

    public ProdutoDTO(
            String descricao, 
            Integer quantidade, 
            BigDecimal preco) {
        
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }
    
    

    
}
