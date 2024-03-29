package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries(value = {
    @NamedQuery(name = "Pessoa.buscaPorLogin",
            query = "FROM Pessoa p WHERE p.login = :login"),
    @NamedQuery(name = "Pessoa.buscarTodas",
            query = "FROM Pessoa p")
})
public abstract class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login", nullable = false, length = 20, unique = true)
    private String login;

    @Column(name = "senha", nullable = false, length = 20)
    private String senha;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    public Pessoa() {
    }

    public Pessoa(String login, String senha, String nome) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", login=" + login + ", senha=" + senha + ", nome=" + nome + '}';
    }

    
}
