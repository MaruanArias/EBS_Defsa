package com.co.unbosque.Factura.services;

import java.util.ArrayList;
import java.util.Optional;

import com.co.unbosque.Factura.models.FacturaModel;
import com.co.unbosque.Factura.repositories.FacturaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {
    @Autowired
    FacturaRepository facturaRepository;
    
    public ArrayList<FacturaModel> obtenerFacturas(){
        return (ArrayList<FacturaModel>) facturaRepository.findAll();
    }

    public FacturaModel guardarFactura(FacturaModel factura){
        return facturaRepository.save(factura);
    }
/** 
    public Optional<FacturaModel> obtenerPorId(Long id){
    return facturaRepository.findById(id);
    }


    public ArrayList<FacturaModel>  obtenerPorPrioridad(Integer prioridad) {
        return facturaRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarFactura(Long id) {
        try{
            facturaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    */
}
