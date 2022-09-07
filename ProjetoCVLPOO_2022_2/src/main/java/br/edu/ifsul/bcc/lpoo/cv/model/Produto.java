
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.io.Serializable;
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

@Entity
@Table(name = "Produto")
public class Produto implements Serializable {
      @Id
    @SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_produto", strategy = GenerationType.SEQUENCE)      
    private Integer id;
    
    @Column(nullable = true, length = 100)
    private String nome;
    
    @Column(nullable = false)
    private Float valor;
        
    @Column(nullable = false)
    private Float quantidade;
        
    @ManyToOne
    @JoinColumn(name = "fornecedor_cpf", nullable = false)
    private Fornecedor fornecedores;
        
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoProduto tiposprodutos;
    
    public Produto(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

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
