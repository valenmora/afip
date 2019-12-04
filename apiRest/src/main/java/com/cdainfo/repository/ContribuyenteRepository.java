package com.cdainfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdainfo.dominio.Contribuyente;



@Repository
public interface ContribuyenteRepository  extends JpaRepository<Contribuyente, Integer>
{
	List<Contribuyente> findAllByNombreLike(String nombre); 
	
}

