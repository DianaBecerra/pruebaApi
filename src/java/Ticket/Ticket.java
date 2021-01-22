/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JUAN DAVID
 */
@Entity
@Table(name = "ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t")
    , @NamedQuery(name = "Ticket.findById", query = "SELECT t FROM Ticket t WHERE t.id = :id")
    , @NamedQuery(name = "Ticket.findByNombre", query = "SELECT t FROM Ticket t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Ticket.findByApellido", query = "SELECT t FROM Ticket t WHERE t.apellido = :apellido")
    , @NamedQuery(name = "Ticket.findByFechaCreaccion", query = "SELECT t FROM Ticket t WHERE t.fechaCreaccion = :fechaCreaccion")
    , @NamedQuery(name = "Ticket.findByFechaActulizacion", query = "SELECT t FROM Ticket t WHERE t.fechaActulizacion = :fechaActulizacion")
    , @NamedQuery(name = "Ticket.findByEstado", query = "SELECT t FROM Ticket t WHERE t.estado = :estado")})
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Creaccion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreaccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Actulizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaActulizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "estado")
    private String estado;

    public Ticket() {
    }

    public Ticket(Integer id) {
        this.id = id;
    }

    public Ticket(Integer id, String nombre, String apellido, Date fechaCreaccion, Date fechaActulizacion, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaCreaccion = fechaCreaccion;
        this.fechaActulizacion = fechaActulizacion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaCreaccion() {
        return fechaCreaccion;
    }

    public void setFechaCreaccion(Date fechaCreaccion) {
        this.fechaCreaccion = fechaCreaccion;
    }

    public Date getFechaActulizacion() {
        return fechaActulizacion;
    }

    public void setFechaActulizacion(Date fechaActulizacion) {
        this.fechaActulizacion = fechaActulizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ticket.Ticket[ id=" + id + " ]";
    }
    
}
