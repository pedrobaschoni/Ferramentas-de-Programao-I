package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "venda")
@NamedQueries(value = @NamedQuery(
        name = "findByData",
        query = "FROM Venda v WHERE v.data >= :dataInicio AND v.data <= :dataFim"))
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "data", nullable = false)
    private LocalDateTime data;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusVenda status;

    @ManyToOne
    @JoinColumn(name = "pessoa_codigo", nullable = false)
    private Pessoa pessoa;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
    private List<ItensVenda> itens;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
    private List<Parcela> parcelas;

    public Venda() {
        status = StatusVenda.Aberta;
    }

    public Venda(Pessoa pessoa) {
        this.pessoa = pessoa;
        status = StatusVenda.Aberta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public StatusVenda getStatus() {
        return status;
    }

    public void setStatus(StatusVenda status) {
        this.status = status;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<ItensVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItensVenda> itens) {
        this.itens = itens;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
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
        final Venda other = (Venda) obj;
        return Objects.equals(this.id, other.id);
    }

}
