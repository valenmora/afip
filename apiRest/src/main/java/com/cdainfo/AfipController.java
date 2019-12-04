package com.cdainfo;

import com.cdainfo.dominio.Contribuyente;
import com.cdainfo.dominio.Impuesto;
import com.cdainfo.repository.ContribuyenteRepository;
import com.cdainfo.repository.ImpuestoRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;



@RestController
public class AfipController {
    @Autowired
    ContribuyenteRepository contribuyenteRepository;
    
    @Autowired
    ImpuestoRepository impuestoRepository;
    

    
    //@PostMapping("/crearAsociacion/add")
    //public ContribuyenteImpuesto createAsociacion(@RequestBody  ContribuyenteImpuesto body) {
      //  return contribuyenteImpuestoRepository.save(body);
    //}
    
    @GetMapping("/impuestos")
    public List<Impuesto> getAllImpuestos() {
        return impuestoRepository.findAll();
    }

    @GetMapping("/impuesto/{idimpuesto}")
    public List<Impuesto> getAllImpuesto(@PathVariable Integer idimpuesto) {
        return impuestoRepository.findByIdimpuesto(idimpuesto);
    }

    @GetMapping("/impuestos/fechaLiquidacion/{fechaInicio}/{fechaFin}")
    public List<Impuesto> getImpuestosByFechaLiq(@PathVariable Date fechaInicio ,@PathVariable Date fechaFin ) {
        return impuestoRepository.findAllByfechaliqBetween(fechaInicio, fechaFin);
    }
    
    @PostMapping("/impuesto/add/fecha{fecha}")
    public Impuesto createImpuesto(@RequestBody Impuesto body, @PathVariable Date fecha) {
        return impuestoRepository.save(body);
    }
    
    @PutMapping("/impuesto/")
    public Impuesto update(@RequestBody Impuesto body) {
        return impuestoRepository.save(body);
    }
    
    @PostMapping("/contribuyente/add")
    public Contribuyente createContribuyente(@RequestBody Contribuyente body) {
        return contribuyenteRepository.save(body);
    }
    
    @GetMapping("/contribuyentes")
    public List<Contribuyente> getAllContribuyente() {
        return contribuyenteRepository.findAll();
    }

    //@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //@JoinColumn(name= "impuesto", nullable = true)
    //public List<Impuesto> impuestos; 
    
   

}
