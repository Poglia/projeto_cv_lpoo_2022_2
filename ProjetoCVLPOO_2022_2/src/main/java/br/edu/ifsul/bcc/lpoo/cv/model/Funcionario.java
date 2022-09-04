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
public class Funcionario  extends Pessoa {
    private String numero_ctps;
    private String numero_pis;
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