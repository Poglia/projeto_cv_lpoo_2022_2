/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Poglia
 */
public class Consulta {
       private Integer id;
    private Calendar data;
    private String observacao;
    private Calendar data_retorno;
    private Float valor;
    private List<Receita> receitas;
    private Medico medicos;
    private Pet pets;
    
    public Consulta(){
        
    }

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
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the data_retorno
     */
    public Calendar getData_retorno() {
        return data_retorno;
    }

    /**
     * @param data_retorno the data_retorno to set
     */
    public void setData_retorno(Calendar data_retorno) {
        this.data_retorno = data_retorno;
    }

    /**
     * @return the valor
     */
    public Float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Float valor) {
        this.valor = valor;
    }

    /**
     * @return the receitas
     */
    public List<Receita> getReceitas() {
        return receitas;
    }

    /**
     * @param receitas the receitas to set
     */
    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }
    
}
