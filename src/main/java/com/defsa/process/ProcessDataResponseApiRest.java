package com.defsa.process;

import java.util.Iterator;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessDataResponseApiRest implements Processor {
	
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		//System.err.print("Body -> "+exchange.getIn().getBody(String.class));
		//DataFactura dataFactura=exchange.getIn().getBody(DataFactura.class);
		DataFacturav2 dataFacturav2=exchange.getIn().getBody(DataFacturav2.class);
		
		
		if(dataFacturav2 != null) {
			System.err.println("dataFactura ready");
			System.out.println("?"+dataFacturav2.toString());
			System.out.println("id: "+dataFacturav2.getId() +"-> "+"cod_cliente: "+dataFacturav2.getCodCliente()+"-> "+"cod Libro:"+dataFacturav2.getCodLibro() +"-> "+ "Forma de Pago: "+ dataFacturav2.getFormaPago() + "-> "+ "Estado: "+ dataFacturav2.getEstado() +"-> "+ "costo: "+ dataFacturav2.getCosto());
			ProcessDataCreateApiRest processDataCreateApiRest = ProcessDataCreateApiRest.getInstance(dataFacturav2.getCodLibro());
			processDataCreateApiRest.setCodLibro(dataFacturav2.getCodLibro());
		}else
			System.out.println("DataFactura NULL");	
	}


}
