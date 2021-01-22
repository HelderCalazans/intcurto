package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela TESTE
* @generated
*/
@Entity
@Table(name = "\"TESTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Teste")
public class Teste implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ano", nullable = false, insertable=true, updatable=true)
        private java.lang.Short ano;

    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * Construtor
    * @generated
    */
    public Teste(){
    }

    /**
    * Obtém ano
    * return ano
    * @generated
    */
    
    public java.lang.Short getAno(){
        return this.ano;
    }

    /**
    * Define ano
    * @param ano ano
    * @generated
    */
    public Teste setAno(java.lang.Short ano){
        this.ano = ano;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Teste setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Teste object = (Teste)obj;
        if (ano != null ? !ano.equals(object.ano) : object.ano != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((ano == null) ? 0 : ano.hashCode());
        return result;
    }

}