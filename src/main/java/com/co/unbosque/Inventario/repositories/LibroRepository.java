package com.co.unbosque.Inventario.repositories;

import com.co.unbosque.Inventario.models.LibroModel;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends CrudRepository<LibroModel, Short>{
    //public abstract ArrayList<LibroModel> findByPrioridad(Integer prioridad);
}
