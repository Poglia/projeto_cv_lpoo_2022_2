
package br.edu.ifsul.bcc.lpoo.cv.model;
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
@Table(name = "Cliente")
public class Cliente extends Pessoa
{
    private Calendar data_ultima_visita;

    public Cliente(Calendar data_ultima_visita)
    {
        this.data_ultima_visita = data_ultima_visita;
    }

    public Calendar getData_ultima_visita() 
    {
        return data_ultima_visita;
    }

    public void setData_ultima_visita(Calendar data_ultima_visita) 
    {
        this.data_ultima_visita = data_ultima_visita;
    }
    
    
}