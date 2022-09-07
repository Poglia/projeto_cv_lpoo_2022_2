package br.edu.ifsul.bcc.lpoo.cv.model;
import java.util.List;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "Procedimento")
public class Procedimento {
    @Id
    @SequenceGenerator(name = "seq_procedimento", sequenceName = "seq_procedimento_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_procedimento", strategy = GenerationType.SEQUENCE)  
    private Integer id;
    
    @Column(nullable = false, length = 200)
    private String observacao;
    
    @Column(nullable = false)
    private Float valor;
       
    @ManyToMany
    @JoinTable(name = "tb_procedimento_produto", joinColumns = {@JoinColumn(name = "procedimento_id")}, //agregacao, vai gerar uma tabela associativa.
                                       inverseJoinColumns = {@JoinColumn(name = "produto_id")})       
    private List<Produto> produtos;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
    
    @ManyToOne
    @JoinColumn(name = "agenda_id", nullable = false)
    private Agenda agendas;
    
    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pets;
    
    public Procedimento(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Agenda getAgendas() {
        return agendas;
    }

    /**
     * @param agendas the agendas to set
     */
    public void setAgendas(Agenda agendas) {
        this.agendas = agendas;
    }

    /**
     * @return the pets
     */
    public Pet getPets() {
        return pets;
    }

    /**
     * @param pets the pets to set
     */
    public void setPets(Pet pets) {
        this.pets = pets;
    }
}
