package com.defsa.bus_servicio_camel;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;

import com.defsa.process.DataFactura;
import com.defsa.process.DataFacturav2;
import com.defsa.process.ProcessDataExchangeProcessor;
import com.defsa.process.ProcessDataResponseApiRest;
import com.defsa.process.SetDataExchangeProcessor;

/**
 * A Camel Java8 DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {
	private JacksonDataFormat jDataFormat;
	
	public MyRouteBuilder() {
		jDataFormat=new JacksonDataFormat(DataFacturav2.class);
	}
    private int index;

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {
    	
        // here is a sample which set a raondom body then performs content
        // based routing on the message using method references
    	// Indicamos la ruta de la cual esta consumiendo el servicio
    	
    	// Establecir bodys
    	
        from("timer:simple?period=1000")
//        .log("Disparando procesamiento.") // indica la acción
//        .setHeader("Cabecera1", constant("Valor cabecera 1"))
//        .setBody(constant("mensaje a procesar"))
        //.process(new SetDataExchangeProcessor())
        .to("direct:consumirApiFactura")// indica el end point o la ruta
        .end();
        // Recibir Body
        from("direct:processarMensaje")
        .log("Inió procesamiento de mensaje")
        .process(new ProcessDataExchangeProcessor())
        .end();
        
        from("direct:consumirApiFactura")
        .setHeader(Exchange.HTTP_METHOD, constant("GET"))//->Le decimos a Camel como acceder al recurso
        .to("http://localhost:8081/factura/1")// Ruta del servio del api
        .unmarshal(jDataFormat)
        //.to("mock:marshalledObject")
        .process(new ProcessDataResponseApiRest())
        .end();
        
        // Declaración de productores y consumidores
      
}
}