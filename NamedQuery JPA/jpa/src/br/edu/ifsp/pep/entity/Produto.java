package br.edu.ifsp.pep.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    @Id //Define como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincrement
    @Column(name = "codigo")//Define o nome do atributo no BD.
    private Integer codigo;
    @Column(name = "descricao", length = 50, nullable = false)
    private String descricao;
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;
    @Column(name = "preco", nullable = false, precision = 8, scale = 2)
    private BigDecimal preco;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }


}
