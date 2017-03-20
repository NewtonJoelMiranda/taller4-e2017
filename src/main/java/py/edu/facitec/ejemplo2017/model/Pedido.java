/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.ejemplo2017.model;

import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;
    private Date fechaToma;
    private Date fechaEntrega;
    private double total;

    //aplicacion de la declaracion bidireccional
    //relacion de muchis a uno
    
    @ManyToOne
    private Cliente cliente;
    
    @ManyToOne
    private Usuario usuario;
    
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaToma() {
        return fechaToma;
    }

    public void setFechaToma(Date fechaToma) {
        this.fechaToma = fechaToma;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", fechaToma=" + fechaToma + ", fechaEntrega=" + fechaEntrega + ", total=" + total + '}';
    }

}
