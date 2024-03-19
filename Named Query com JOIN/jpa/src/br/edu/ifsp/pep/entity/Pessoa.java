package br.edu.ifsp.pep.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "pessoa", uniqueConstraints = {
    @UniqueConstraint(name = "unique_nome_sobrenome", columnNames = {"nome", "sobrenome"} )
})
@NamedQueries(
        @NamedQuery(name = "Pessoa.buscarTodas",
                query = "SELECT p FROM Pessoa p"))
public class Pessoa implements Serializable {

    @Id //Define como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincrement
    @Column(name = "codigo")//Define o nome do atributo no BD.
    private Integer codigo;
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    
    @Column(name = "sobrenome", length = 50, nullable = false)
    private String sobrenome;
    
    @Column(name = "login", length = 15, nullable = false, unique = true)
    private String login;

    public Pessoa() {
    }

    public Pessoa(String nome, String login, String sobrenome) {
        this.nome = nome;
        this.login = login;
        this.sobrenome = sobrenome;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }

}
