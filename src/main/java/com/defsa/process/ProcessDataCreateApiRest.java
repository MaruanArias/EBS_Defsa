package com.defsa.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessDataCreateApiRest implements Processor {
	String codLibro;
	private static ProcessDataCreateApiRest instance;

	private ProcessDataCreateApiRest(String codLibro) {
		this.codLibro = codLibro;
	}
	
	public static ProcessDataCreateApiRest getInstance(String codLibro) {
		if(instance == null) {
			instance = new ProcessDataCreateApiRest(codLibro);
		}
		return instance;
	}

	public String getCodLibro() {
		return codLibro;
	}

	public void setCodLibro(String codLibro) {
		instance.codLibro = codLibro;
	}

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("codLibro: " + instance.codLibro);
		exchange.getIn()
				.setBody("{" + "\"nombreDestinatario\": \"Maruan\"," + "\"formaEntrega\": \"Avion\","
						+ "\"ciudadEntrega\": \"Bogota\"," + "\"telefonoEntrega\": \"213499408\"," + " \"idLibro\":"
						+ codLibro + "}");
	}

}
