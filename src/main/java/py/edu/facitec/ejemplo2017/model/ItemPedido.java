/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.ejemplo2017.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue // generacion automatica de id
    private Integer id;
    private Integer cantidadProducto;
    private Double subTotal;
    //////////////////////////////////////////
    @ManyToOne
    private Pedido pedido;
    /////////////////////////////////////////
    @ManyToOne
    private Producto producto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

	@Override
	public String toString() {
		return "ItemPedido [id=" + id + ", cantidadProducto=" + cantidadProducto + ", subTotal=" + subTotal
				+ ", pedido=" + pedido + ", producto=" + producto + "]";
	}
    

}
