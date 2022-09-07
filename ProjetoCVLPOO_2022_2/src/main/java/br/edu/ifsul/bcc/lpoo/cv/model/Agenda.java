/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Poglia
 */
@Entity
@Table(name = "Agenda")
public class Agenda implements Serializable
{
   
    @Id
    @SequenceGenerator(name = "seq_agenda", sequenceName = "seq_agenda_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_agenda", strategy = GenerationType.SEQUENCE)  
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_inicio;
    
    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_fim;
    
    @Column(nullable = false, length = 200)
    private String observacao;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoProduto tiposprodutos;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
    
    @ManyToOne
    @JoinColumn(name = "med_pessoa_cpf", nullable = false)
    private Medico medicos;
    
    @ManyToOne
    @JoinColumn(name = "func_pessoa_cpf", nullable = false)
    private Funcionario funcionarios;
    
    @ManyToOne
    @JoinColumn(name = "cliente_pessoa_cpf", nullable = false)
    private Cliente clientes;
        

    public Agenda(Integer id, Calendar data_inicio, Calendar data_fim, String observacao, TipoProduto tiposprodutos, Status status, Medico medicos, Funcionario funcionarios, Cliente cliente) {
        this.id = id;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.observacao = observacao;
        this.tiposprodutos = tiposprodutos;
        this.status = status;
        this.medicos = medicos;
        this.funcionarios = funcionarios;
        this.clientes = clientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Calendar getData_fim() {
        return data_fim;
    }

    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public TipoProduto getTiposprodutos() {
        return tiposprodutos;
    }

    public void setTiposprodutos(TipoProduto tiposprodutos) {
        this.tiposprodutos = tiposprodutos;
    }

    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }


    public Medico getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico medicos) {
        this.medicos = medicos;
    }

    public Funcionario getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios = funcionarios;
    }
    
        public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
    
}
