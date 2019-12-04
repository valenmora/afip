package com.cdainfo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdainfo.dominio.Impuesto;

import java.sql.Date;
import java.util.List;

@Repository
public interface ImpuestoRepository extends JpaRepository<Impuesto, Integer> {
	
	//List<Impuesto> findAllByNombreLike(String nombre);
	
	List<Impuesto> findByIdimpuesto(Integer idimpuesto);

	List<Impuesto> findAllByfechaliqBetween(Date fecha1, Date fecha2);


	
}
