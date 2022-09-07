package br.edu.ifsul.bcc.lpoo.cv.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Consulta")
public class Consulta implements Serializable
{
       @Id
    @SequenceGenerator(name = "seq_consulta", sequenceName = "seq_consulta_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_consulta", strategy = GenerationType.SEQUENCE)      
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data;
        
    @Column(nullable = true, length = 200)
    private String observacao;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_retorno;
    
    @Column(nullable = false)
    private Float valor;
    
    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pet;
    
    @ManyToOne
    @JoinColumn(name = "medico_cpf", nullable = false)
    private Medico medico;
    
    @OneToMany(mappedBy = "consulta")//mappedBy deve apontar para a referencia de cliente dentro de Pet.
    private List<Receita> receitas;

    public Consulta(Integer id, Calendar data, String observacao, Calendar data_retorno, Float valor, Pet pet, Medico medico, List<Receita> receitas) {
        this.id = id;
        this.data = data;
        this.observacao = observacao;
        this.data_retorno = data_retorno;
        this.valor = valor;
        this.pet = pet;
        this.medico = medico;
        this.receitas = receitas;
    }
   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }


    public String getObservacao() {
        return observacao;
    }


    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    public Calendar getData_retorno() {
        return data_retorno;
    }

    public void setData_retorno(Calendar data_retorno) {
        this.data_retorno = data_retorno;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }
}
