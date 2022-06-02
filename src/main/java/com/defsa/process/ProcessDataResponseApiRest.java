package com.defsa.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessDataResponseApiRest implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		//System.err.print("Body -> "+exchange.getIn().getBody(String.class));
		DataFactura dataFactura=exchange.getIn().getBody(DataFactura.class);
		if(dataFactura != null) {
			System.err.println("dataFactura ready");
		}else
			System.out.println("DataFactura NULL");
	}
}
