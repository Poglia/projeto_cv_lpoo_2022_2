/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

/**
 *
 * @author Poglia
 */
public class Produto {
     private Integer id;
    private String nome;
    private Float valor;
    private Float quantidade;
    private TipoProduto tiposprodutos;
    private Fornecedor fornecedores;
    
    public Produto(){
        
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @return the quantidade
     */
    public Float getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the tiposprodutos
     */
    public TipoProduto getTiposprodutos() {
        return tiposprodutos;
    }

    /**
     * @param tiposprodutos the tiposprodutos to set
     */
    public void setTiposprodutos(TipoProduto tiposprodutos) {
        this.tiposprodutos = tiposprodutos;
    }

    /**
     * @return the fornecedores
     */
    public Fornecedor getFornecedores() {
        return fornecedores;
    }

    /**
     * @param fornecedores the fornecedores to set
     */
    public void setFornecedores(Fornecedor fornecedores) {
        this.fornecedores = fornecedores;
    }
}
