package com.cdainfo.dominio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Contribuyente 
{

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idcontribuyente;

	    @Column(name = "nombre")
	    private String nombre;
	    
	    @Column(name = "apellido")
	    private String apellido;

	    @Column(name = "dni")
	    private  Long dni;
	    
	    @Column(name = "clavefiscal")
	    private  String clavefiscal;
	
	    @ManyToMany(cascade = CascadeType.ALL)
	    private List<Impuesto> impuestos;
		
		
	    
	    public Integer getIdcontribuyente() {
			return idcontribuyente;
		}

		public void setIdcontribuyente(Integer idcontribuyente) {
			this.idcontribuyente = idcontribuyente;
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

		public Long getDni() {
			return dni;
		}

		public void setDni(Long dni) {
			this.dni = dni;
		}

		public String getClavefiscal() {
			return clavefiscal;
		}

		public void setClavefiscal(String clavefiscal) {
			this.clavefiscal = clavefiscal;
		}

		@Override
	    public String toString() {
	        return "Impuesto: \n" +
	                "   id: " + this.idcontribuyente +
	                "\n   Nombre: " + this.nombre +
	                "\n   Apellido: " + this.apellido +
	                "\n   DNI: " + this.dni + 
	                "\n   : " + this.clavefiscal;
	    }
		
}
