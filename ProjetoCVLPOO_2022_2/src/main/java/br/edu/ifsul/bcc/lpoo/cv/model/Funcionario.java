package br.edu.ifsul.bcc.lpoo.cv.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;


@Entity
@Table(name = "Funcionario")
@DiscriminatorValue("U")
public class Funcionario extends Pessoa{
    @Column(nullable = false, length = 10)
    private String numero_ctps;
    
    @Column(nullable = false, length = 10)
    private String numero_pis;
    
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Cargo cargos;
    
    public Funcionario(){
        
    }

    /**
     * @return the numero_ctps
     */
    public String getNumero_ctps() {
        return numero_ctps;
    }

    /**
     * @param numero_ctps the numero_ctps to set
     */
    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    /**
     * @return the numero_pis
     */
    public String getNumero_pis() {
        return numero_pis;
    }

    /**
     * @param numero_pis the numero_pis to set
     */
    public void setNumero_pis(String numero_pis) {
        this.numero_pis = numero_pis;
    }

    /**
     * @return the cargos
     */
    public Cargo getCargos() {
        return cargos;
    }

    /**
     * @param cargos the cargos to set
     */
    public void setCargos(Cargo cargos) {
        this.cargos = cargos;
    }
    
    
}