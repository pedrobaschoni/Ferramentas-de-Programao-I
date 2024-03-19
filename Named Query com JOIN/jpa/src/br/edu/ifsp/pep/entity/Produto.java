package br.edu.ifsp.pep.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.buscarPeloPreco",
            query = "FROM Produto p WHERE p.preco > :preco"),

    @NamedQuery(name = "Produto.buscarMaiorPreco",
            query = "SELECT MAX(p.preco) FROM Produto p"),

    @NamedQuery(name = "Produto.buscarDescricao",
            query = "SELECT p.descricao FROM Produto p"),

    @NamedQuery(name = "Produto.buscarDescricaoPrecoQuantidade",
            query = "SELECT p.descricao, p.preco, p.quantidade FROM Produto p"),

    @NamedQuery(name = "Produto.buscarDTO", 
            query = "SELECT NEW br.edu.ifsp.pep.dto.ProdutoDTO(p.descricao, p.quantidade, p.preco) FROM Produto p"),
    @NamedQuery(name = "Produto.buscarPeloIdCategoria",
            query = "SELECT p FROM Produto p WHERE p.categoria.codigo = :codigo")
}
)
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

    @ManyToOne
    @JoinColumn(name = "categoria_codigo", nullable = false)
    private Categoria categoria;

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
