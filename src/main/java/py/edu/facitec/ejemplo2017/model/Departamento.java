/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.ejemplo2017.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departamento {

    @Id
    @GeneratedValue
    private Integer id;
    private String descripcion;

    //Aolicaciion de asociacion bidireccional
    //nombre del objeto departamento en la clase gerente
    //solo en una de las clases se puede utilizar la anotacion mappedBy
    
    @OneToOne(mappedBy = "departamento") //relacion uno a uno
    private Gerente gerente;
    
    @OneToMany(mappedBy = "departamento")
    private List<Usuario> usuarios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
