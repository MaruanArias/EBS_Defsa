package com.co.unbosque.Entrega.repositories;

import com.co.unbosque.Entrega.models.PedidoModel;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoModel, Integer>{
    
}
