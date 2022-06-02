package com.co.unbosque.Factura.controllers;
import java.util.ArrayList;
import java.util.Optional;

import com.co.unbosque.Factura.models.FacturaModel;
import com.co.unbosque.Factura.services.FacturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/factura")
public class FacturaController {
   
    @Autowired
    FacturaService facturaService;

    @GetMapping()
    public ArrayList<FacturaModel> obtenerFacturas(){
        return facturaService.obtenerFacturas();
    }

    @PostMapping()
    public FacturaModel guardarFactura(@RequestBody FacturaModel factura){
        return this.facturaService.guardarFactura(factura);
    }
/** 
    @GetMapping( path = "/{id}")
    public Optional<FacturaModel> obtenerFacturaPorId(@PathVariable("id") Long id) {
        return this.facturaService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<FacturaModel> obtenerFacturaPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.facturaService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.facturaService.eliminarFactura(id);
        if (ok){
            return "Se eliminó el factura con id " + id;
        }else{
            return "No pudo eliminar el factura con id" + id;
        }
    }
    */
}
