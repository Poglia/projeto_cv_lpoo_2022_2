/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.bcc.lpoo.cv.model;
import java.util.List;
/**
 *
 * @author Poglia
 */
public class Receita {
     private Integer id;
    private String orientacao;
    private List <Produto> produtos;
    private Consulta consultas;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the orientacao
     */
    public String getOrientacao() {
        return orientacao;
    }

    /**
     * @param orientacao the orientacao to set
     */
    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    /**
     * @return the produtos
     */
    public List <Produto> getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(List <Produto> produtos) {
        this.produtos = produtos;
    }

    /**
     * @return the consultas
     */
    public Consulta getConsultas() {
        return consultas;
    }

    /**
     * @param consultas the consultas to set
     */
    public void setConsultas(Consulta consultas) {
        this.consultas = consultas;
    }
}
