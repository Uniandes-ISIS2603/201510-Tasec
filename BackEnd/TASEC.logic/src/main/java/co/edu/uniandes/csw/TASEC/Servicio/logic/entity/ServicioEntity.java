/* ========================================================================
 * Copyright 2014 SportGroup
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 SportGroup
  
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:
  
 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.
  
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 * ========================================================================
  
  
 Source generated by CrudMaker version 1.0.0.201411201032*/
package co.edu.uniandes.csw.TASEC.Servicio.logic.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class ServicioEntity {

    @Id
    @GeneratedValue(generator = "Servicio")
    private Long id;
    private String name;
    private String descripcion;
    private Integer calificacion;
    private Integer precio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private boolean hayOferta;
    private Integer precioOferta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
     public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacioin(Integer calificacion) {
        this.calificacion = calificacion;
    }
     public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
     public Integer getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(Integer precioOferta) {
        this.precioOferta = precioOferta;
    }
    
    public Date  getfecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public boolean  getHayOferta() {
        return hayOferta;
    }

    public void setHayOferta(boolean hayOferta) {
        this.hayOferta = hayOferta;
    }
    
}
