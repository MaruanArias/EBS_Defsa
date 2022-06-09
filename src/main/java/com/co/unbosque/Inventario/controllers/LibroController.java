package com.co.unbosque.Inventario.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.co.unbosque.Inventario.models.LibroModel;
import com.co.unbosque.Inventario.services.LibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/libro")
public class LibroController {
    @Autowired
    LibroService libroService;

    @GetMapping()
    public ArrayList<LibroModel> obtenerLibros(){
        return libroService.obtenerLibros();
    }

    @PostMapping()
    public LibroModel guardarLibro(@RequestBody LibroModel libro){
        return this.libroService.guardarLibro(libro);
    }

    
    @GetMapping( path = "/{id}")
    public Optional<LibroModel> obtenerLibroPorId(@PathVariable("id") short id) {
        return this.libroService.obtenerPorId(id);
    }


    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") short id){
        boolean ok = this.libroService.eliminarLibro(id);
        if (ok){
            return "Se eliminó el libro con id " + id;
        }else{
            return "No pudo eliminar el libro con id" + id;
        }
    }
}
