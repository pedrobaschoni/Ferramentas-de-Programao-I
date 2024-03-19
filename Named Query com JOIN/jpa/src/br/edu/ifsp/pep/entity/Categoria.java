package br.edu.ifsp.pep.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
@NamedQueries({
    @NamedQuery(name = "Categoria.buscarPelaQuantidadeProduto", 
            query = "SELECT DISTINCT c FROM Categoria c JOIN c.produtos p WHERE p.quantidade < :quantidade")    
})
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "nome", length = 20, nullable = false)
    private String nome;
    
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;

    public Categoria() {
    }

    public Categoria(String nome) {
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
        return "Categoria{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }

}
