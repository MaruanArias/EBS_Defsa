package com.defsa.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessDataCreateApiRest implements Processor{
	 String codLibro;
	 
		public String getCodLibro() {
		return codLibro;
	}

	public void setCodLibro(String codLibro) {
		this.codLibro = codLibro;
	}
	ProcessDataResponseApiRest processDataResponseApiRest = new ProcessDataResponseApiRest();
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("codLibro: " +codLibro);
		exchange.getIn().setBody("{"+"\"nombreDestinatario\": \"Mata\","+"\"formaEntrega\": \"Avion\","+"\"ciudadEntrega\": \"Bogota\","+"\"telefonoEntrega\": \"213499408\","+" \"idLibro\":"+codLibro+"}");
	}
	

}
