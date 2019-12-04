package com.cdainfo.dominio;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;


@Entity
public class Impuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idimpuesto;

    @Column(name = "nombreimpuesto")
    private String nombreimpuesto;

    @Column(name = "porcentaje")
    private  String porcentaje;
    
    @Column(name = "fechaliq")
    private  Date fechaliq;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Contribuyente> Contribuyentes;
	@JoinTable(
	        name = "impuesto_contribuyente",
	        joinColumns = @JoinColumn(name = "fk_impuesto", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="fk_contribuyente", nullable = false)
	    )
    
    
    public Integer getIdimpuesto() {
		return idimpuesto;
	}
    
	public void setIdimpuesto(Integer idimpuesto) {
		this.idimpuesto = idimpuesto;
	}

	public String getNombreimpuesto() {
		return nombreimpuesto;
	}

	public void setNombreimpuesto(String nombreimpuesto) {
		this.nombreimpuesto = nombreimpuesto;
	}

	public String getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Date getFechaliq() {
		return fechaliq;
	}

	public void setFechaliq(Date fechaliq) {
		this.fechaliq = fechaliq;
	}


	@Override
    public String toString() {
        return "Impuesto: \n" +
                "   id: " + this.idimpuesto +
                "\n   tipo impuesto: " + this.nombreimpuesto +
                "\n   porcentaje: " + this.porcentaje + 
                "\n   fecha Liquidacion: " + this.fechaliq;
    }
}

/*****************************
 CREATE TABLE `restapi`.`alumno` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(45) NULL,
 `surname` VARCHAR(45) NULL,
 PRIMARY KEY (`id`));


 INSERT INTO `restapi`.`alumno` (`name`, `surname`) VALUES ('Juan', 'Perez');
 INSERT INTO `restapi`.`alumno` (`name`, `surname`) VALUES ('Pepe', 'Gonzalez');
 INSERT INTO `restapi`.`alumno` (`name`, `surname`) VALUES ('Jose', 'Fernandez');


 */