package com.co.unbosque.Entrega.services;

import java.util.ArrayList;
import java.util.Optional;

import com.co.unbosque.Entrega.models.PedidoModel;
import com.co.unbosque.Entrega.repositories.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    
    @Autowired
    PedidoRepository pedidoRepository;
    
    public ArrayList<PedidoModel> obtenerPedidos(){
        return (ArrayList<PedidoModel>) pedidoRepository.findAll();
    }

    public PedidoModel guardarPedido(PedidoModel pedido){
        return pedidoRepository.save(pedido);
    }
}
