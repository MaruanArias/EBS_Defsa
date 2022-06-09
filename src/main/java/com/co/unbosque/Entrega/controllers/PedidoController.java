package com.co.unbosque.Entrega.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.co.unbosque.Entrega.models.PedidoModel;
import com.co.unbosque.Entrega.services.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @GetMapping()
    public ArrayList<PedidoModel> obtenerPedidos(){
        return pedidoService.obtenerPedidos();
    }

    @PostMapping()
    public PedidoModel guardarPedido(@RequestBody PedidoModel pedido){
        return this.pedidoService.guardarPedido(pedido);
    }

    @GetMapping( path = "/{id}")
    public Optional<PedidoModel> obtenerPedidoPorId(@PathVariable("id") Integer id) {
        return this.pedidoService.obtenerPorId(id);
    }


    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.pedidoService.eliminarPedido(id);
        if (ok){
            return "Se eliminó el Pedido con id " + id;
        }else{
            return "No pudo eliminar el Pedido con id" + id;
        }
    }
}
