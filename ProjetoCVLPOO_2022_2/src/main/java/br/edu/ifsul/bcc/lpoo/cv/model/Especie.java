/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Especie")
public class Especie implements Serializable
{
    @Id
    @SequenceGenerator(name = "seq_especie", sequenceName = "seq_especie_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_especie", strategy = GenerationType.SEQUENCE)   
    private Integer id;
    
    @Column(nullable = false, length = 100)
    private String nome;

    public Especie(Integer id, String nome) 
    {
        this.id = id;
        this.nome = nome;
    }
    
    public Integer getId() 
    {
        return id;
    }


    public void setId(Integer id) 
    {
        this.id = id;
    }


    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
}
