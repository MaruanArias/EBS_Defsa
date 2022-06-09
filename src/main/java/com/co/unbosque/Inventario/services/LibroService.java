package com.co.unbosque.Inventario.services;

import java.util.ArrayList;
import java.util.Optional;

import com.co.unbosque.Inventario.models.LibroModel;
import com.co.unbosque.Inventario.repositories.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    @Autowired
    LibroRepository libroRepository;
    
    public ArrayList<LibroModel> obtenerLibros(){
        return (ArrayList<LibroModel>) libroRepository.findAll();
    }

    public LibroModel guardarLibro(LibroModel libro){
        return libroRepository.save(libro);
    }

   
    public Optional<LibroModel> obtenerPorId(short id){
        return libroRepository.findById(id);
    }

    public boolean eliminarLibro(short id) {
        try{
            libroRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}