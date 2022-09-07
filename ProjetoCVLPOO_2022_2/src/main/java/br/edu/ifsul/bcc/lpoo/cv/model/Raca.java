package br.edu.ifsul.bcc.lpoo.cv.model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Raca")
public class Raca implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_raca", sequenceName = "seq_raca_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_raca", strategy = GenerationType.SEQUENCE)  
    private Integer id;
    
    @Column(nullable = false, length = 100)
    private String nome;
        
    @ManyToOne
    @JoinColumn(name = "especie_id", nullable = false)
    private Especie especies;
    
    
    public Raca(){
        
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
     * @return the especies
     */
    public Especie getEspecies() {
        return especies;
    }

    /**
     * @param especies the especies to set
     */
    public void setEspecies(Especie especies) {
        this.especies = especies;
    }
    
}
