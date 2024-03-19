package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
@NamedQueries(value = { 
        @NamedQuery(name = "Pessoa.Login", 
                query = "FROM Pessoa p WHERE p.login = :login AND p.senha = :senha"),
        @NamedQuery(name = "Pessoa.buscarPorNome", 
                query = "FROM Pessoa p WHERE p.nome LIKE :nome")
})
public class Pessoa implements Serializable {

    //chave primária - autoincrement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long codigo;
    
    //Tamanho 50 - Obrigatório
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    
    //Tamanho 20 - Obrigatório
    @Column(name = "senha", length = 20, nullable = false)
    private String senha;
    
    //Tamanho 15 - Obrigatório - Unique
    @Column(name = "login", length = 15, nullable = false, unique = true)
    private String login;
    
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.codigo);
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
        final Pessoa other = (Pessoa) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
    
}
