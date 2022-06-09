package com.co.unbosque.Factura.repositories;

import java.util.ArrayList;

import com.co.unbosque.Factura.models.FacturaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends CrudRepository<FacturaModel, Integer> {
    
}
